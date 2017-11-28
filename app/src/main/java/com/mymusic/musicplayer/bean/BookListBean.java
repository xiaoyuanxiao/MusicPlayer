package com.mymusic.musicplayer.bean;

/**
 * Created by xiaoyu on 2017/11/28.
 */

public class BookListBean {


    /**
     * id : 21
     * title : 百听十大畅销书，你听过几本？
     * description : 九月已至，天气渐转微凉，
     * 倚栏凭风，正是听书好时光。
     * <p>
     * 本期推荐的十本畅销书，
     * 有童心，有温暖，有悬疑，也有智慧。
     * 当经典作品配上朗朗书声，畅销好书听起来。
     * cover : http://jyts-public-oss.longruncloud.com/images/booklist/21feeca15c5c28791822d24e0a1c2371af7ff60cc40dffe2aae36e2aded77dc7.jpg
     */

    private int id;
    private String title;
    private String description;
    private String cover;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }
}
