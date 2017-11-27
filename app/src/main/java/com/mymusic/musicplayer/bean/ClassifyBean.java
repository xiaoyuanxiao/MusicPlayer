package com.mymusic.musicplayer.bean;

import java.util.List;

/**
 * Created by xiaoyu on 2017/11/27.
 */

public class ClassifyBean {

    private List<LabelsBean> labels;
    private List<StandardTypesBean> standard_types;

    public List<LabelsBean> getLabels() {
        return labels;
    }

    public void setLabels(List<LabelsBean> labels) {
        this.labels = labels;
    }

    public List<StandardTypesBean> getStandard_types() {
        return standard_types;
    }

    public void setStandard_types(List<StandardTypesBean> standard_types) {
        this.standard_types = standard_types;
    }

    public static class LabelsBean {
        /**
         * id : 17
         * name : 金庸武侠
         */

        private int id;
        private String name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class StandardTypesBean {
        /**
         * labels : [{"id":38,"name":"诗歌韵文"},{"id":39,"name":"古代至近代小说"},{"id":40,"name":"现代小说"},{"id":41,"name":"当代小说"},{"id":42,"name":"散文"},{"id":43,"name":"民间文学"},{"id":44,"name":"儿童文学"}]
         * name : 中国文学
         */

        private String name;
        private List<LabelsBeanX> labels;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<LabelsBeanX> getLabels() {
            return labels;
        }

        public void setLabels(List<LabelsBeanX> labels) {
            this.labels = labels;
        }

        public static class LabelsBeanX {
            /**
             * id : 38
             * name : 诗歌韵文
             */

            private int id;
            private String name;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
    }
}
