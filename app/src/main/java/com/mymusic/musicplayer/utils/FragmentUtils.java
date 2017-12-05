package com.mymusic.musicplayer.utils;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import java.util.ArrayList;

/**
 * Created by xiaoyu on 2017/12/5.
 */

public class FragmentUtils {

    /**
     * 显示fragment
     *
     * @param fragment 要显示的fragment
     */
    public static void showFragment(Fragment fragment, int id, FragmentManager fragmentManager, ArrayList<Fragment> fragments) {
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        hideFragment(transaction, fragments);
        if (fragment.isAdded()) {
            transaction.show(fragment);
        } else {
            transaction.add(id, fragment, fragment.getClass().getName());
        }
        transaction.commit();
    }
    /**
     * 隐藏其他fragment
     *
     * @param transaction 控制器
     */
    private static void hideFragment(FragmentTransaction transaction, ArrayList<Fragment> fragments) {
        for (int i = 0; fragments.size() > i; i++) {
            if (fragments.get(i).isVisible()) {
                transaction.hide(fragments.get(i));
            }
        }
    }
}
