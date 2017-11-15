package com.mymusic.musicplayer.bean;

import java.util.List;

/**
 * Created by xiaoyu on 2017/11/15.
 */

public class RecommendationBean {

    private List<CarouselsBean> carousels;
    private List<HotBooklistsBean> hot_booklists;
    private List<BooklistsBean> booklists;
    private List<EditorsPicksBean> editors_picks;
    private List<TopicsBean> topics;
    private List<HotHitsBean> hot_hits;
    private List<NewArrivalsBean> new_arrivals;
    private List<BestAuthorsBean> best_authors;
    private List<HotRecordersBean> hot_recorders;
    private List<RecommendationsBean> recommendations;

    public List<CarouselsBean> getCarousels() {
        return carousels;
    }

    public void setCarousels(List<CarouselsBean> carousels) {
        this.carousels = carousels;
    }

    public List<HotBooklistsBean> getHot_booklists() {
        return hot_booklists;
    }

    public void setHot_booklists(List<HotBooklistsBean> hot_booklists) {
        this.hot_booklists = hot_booklists;
    }

    public List<BooklistsBean> getBooklists() {
        return booklists;
    }

    public void setBooklists(List<BooklistsBean> booklists) {
        this.booklists = booklists;
    }

    public List<EditorsPicksBean> getEditors_picks() {
        return editors_picks;
    }

    public void setEditors_picks(List<EditorsPicksBean> editors_picks) {
        this.editors_picks = editors_picks;
    }

    public List<TopicsBean> getTopics() {
        return topics;
    }

    public void setTopics(List<TopicsBean> topics) {
        this.topics = topics;
    }

    public List<HotHitsBean> getHot_hits() {
        return hot_hits;
    }

    public void setHot_hits(List<HotHitsBean> hot_hits) {
        this.hot_hits = hot_hits;
    }

    public List<NewArrivalsBean> getNew_arrivals() {
        return new_arrivals;
    }

    public void setNew_arrivals(List<NewArrivalsBean> new_arrivals) {
        this.new_arrivals = new_arrivals;
    }

    public List<BestAuthorsBean> getBest_authors() {
        return best_authors;
    }

    public void setBest_authors(List<BestAuthorsBean> best_authors) {
        this.best_authors = best_authors;
    }

    public List<HotRecordersBean> getHot_recorders() {
        return hot_recorders;
    }

    public void setHot_recorders(List<HotRecordersBean> hot_recorders) {
        this.hot_recorders = hot_recorders;
    }

    public List<RecommendationsBean> getRecommendations() {
        return recommendations;
    }

    public void setRecommendations(List<RecommendationsBean> recommendations) {
        this.recommendations = recommendations;
    }

    public static class CarouselsBean {
        /**
         * image : http://jyts-public-oss.longruncloud.com/carousel/2017/07/05/7a55c7fd9e6cafe15cd9301c838ace8689598b1cbbabc319a63af7489bea659c.jpg
         * content : {"book":null,"pages":null}
         */

        private String image;
        private ContentBean content;

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public ContentBean getContent() {
            return content;
        }

        public void setContent(ContentBean content) {
            this.content = content;
        }

        public static class ContentBean {
            /**
             * book : null
             * pages : null
             */

            private Object book;
            private Object pages;

            public Object getBook() {
                return book;
            }

            public void setBook(Object book) {
                this.book = book;
            }

            public Object getPages() {
                return pages;
            }

            public void setPages(Object pages) {
                this.pages = pages;
            }
        }
    }

    public static class HotBooklistsBean {
        /**
         * id : 13
         * title : 古诗词特辑
         * 中小学语文必听，期末考试不再愁
         * description : 音韵和谐、充满律动、语感优美，好诗是语言的精粹。反复聆听、反复吟诵，更是我们民族代代相传的学习诗歌之法。
         * <p>
         * 朗声图书出品古典诗歌系列有声书，朗朗书声专项突破，视听并用高效记忆。中小学语文必听音频，感受古典诗歌的气质之美。
         * cover : http://jyts-public-oss.longruncloud.com/images/booklist/62bede68776e58b80fc8c3cbb8e0a5e8514cb4f1b53c98bc658fcc133f1f8758.jpg
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

    public static class BooklistsBean {
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

    public static class EditorsPicksBean {
        /**
         * book : {"id":1292,"title":"跟郭靖比聪明？你差的不仅是\u201c练十遍\u201d！","description":"别人练一遍，我练十遍。\r\n\r\n【正文】\r\n1\r\n讲历史，可能有人觉得太老旧；讲文学，可能有人认为太文艺。\r\n然而讲起奋斗来，当真是个个口若悬河，但凡是经历过个把考试、干过数载职员的，都能深挖浅析，讲出至少十几个男默女泪的故事来。\r\n而最后的结尾，总要扯上些自谦之辞、人生哲理，归纳起来，无非就是：\r\n洒可还嫩着，还是幸运的，社会浪淘沙，奋斗是总则。\r\n而奋斗家们最爱的，就是《射雕英雄传》，看着里面郭靖变成了绝代大侠，他们激动得仿佛自己也走上了人生的巅峰。\r\n而他们的人生信条，也就是郭靖的那句话：\r\n别人练一遍，我练十遍。\r\n于是他们不爱听聪明人的故事，聪明人起点高啊，咱不跟他们比！\r\n他们也不爱听富二代的故事，富二代一生下来就坐拥金山银山，有什么意思！\r\n他们最喜欢的就是郭靖这样的主人公，笨拙、穷苦、边远地区出身、没有官宦贵人背景。\r\n\u201c这样一个蠢人，都能够成功，那么我智力能力都是上上之选，还像郭靖一样刻苦努力，绝对能成为个中翘楚。\u201d\r\n他们的心里都是这样想的。然而他们搞错了，人家郭靖并不是只靠着死磕，也并不见得能力就比谁低。\r\n我们看看他都拥有什么条件。\r\n\r\n2.\r\n首先是家庭背景。很多人看到背景就烦，你是不是鼓吹天生论、命运说？\r\n并不是，这是要跟各位讲，就算有了成就，也别忙着沾沾自喜，觉得自己的奋斗造就了一切，先看看别人对你的帮助有多么重要。\r\n该感谢的感谢，该还钱的还钱，该赡养的赡养。\r\n他的父亲\u2014\u2014郭啸天，是谁呢？梁山好汉\u201c赛仁贵\u201d郭盛的后代。\r\n这还好说，毕竟过去这么多代，原生家庭的影响微乎其微。\r\n然而他的父亲还有个过命的朋友\u2014\u2014长春子丘处机。在明面上，他父亲还是因为保护这个朋友才遭难的（其实是什么原因咱就先不讨论了）。\r\n丘处机是何许人也？名满天下的全真集团副总裁，据说武功是里面最高的。\r\n所以丘道长四处寻访他，找了辅导班知名群体导师江南七怪去给他补习，一人负责一门功课。要不是这个机缘，什么武林盟主、襄阳英雄、桃花岛女婿，他连金刀驸马都当不上。\r\n丘道长的背景也衍生出了其他人的照应，江南七怪的辅导班还是老式教育，不会因材施教，丘道长的师兄\u2014\u2014著名导师马钰马道长，看不过去了，出手点拨了两下，郭靖也不含糊，立刻开窍了。\r\n\r\n3.\r\n为什么这么容易开窍，这就是第二点了：智商。\r\n没错我说的就是智商，你们真的以为郭靖智商低么？\r\n我们有他智商低的错觉， 是因为周围的人对比太明显。\r\n一开始江南七怪见到他，就传授了几招，那时托雷在郭靖身边，郭靖还没看清楚第一个姿势，人家托雷在一边儿咔咔练会了。\r\n江南七怪就说：艾玛这小子好笨。\r\n我们也想：艾玛我比他聪明多了。\r\n完全忘了我们军训学军体拳的时光了么？教官演示一遍又一遍，说得口干舌燥，都是在夸你们学得快吗？并不是！\r\n教官都在讲：手抬高！再抬高！这样下去！不是这样，是这样！好，这是第一个姿势啊，我们再复习一遍，走！都说了手抬高了！好，我们第一个姿势就练习5次啊，一定要跟上啊，练5次没练会要去跑圈！\r\n所以说，托雷学会了，郭靖没学会，不是因为郭靖蠢，而是因为托雷聪明。\r\n同理，黄蓉和郭靖、黄药师和郭靖、杨康和郭靖，都是没什么可比性的。\r\n突然觉得郭靖好可怜，周围全是神......\r\n那么郭靖的智商，怎样才能看出来呢？\r\n智商上最接近正常人的，就是周伯通了（别看不起周老爷子的智商！），周伯通和郭靖的那段对话，让所有的读者都舒服了，因为郭靖的智商好像突然就不用被吊打了。\r\n        周伯通顺手拿起刚才盛过饭的饭碗，说道：\u201c这只碗只因为中间是空的，才有盛饭的功用，倘若它是实心的一块瓷土，还能装什么饭？\u201d郭靖点点头，心想：\u201c这道理说来很浅，只是我从没想到过。\u201d\u2026\u2026郭靖和周伯通以空对空，以柔迎柔，再也不会给他摔倒了，郭靖忽然悟到，说道：\u201c我洪恩师教我使那降龙十八掌，必须发力少而留力多，倒也不是一味刚猛。\u201d\r\n\r\n周伯通所讲的武侠道理，郭靖秒懂，而学了几招空明拳，郭靖还能举一反三，发动发散性思维，悟到降龙十八掌上，这种智商就算不是上乘，至少也是中等资质了。\r\n\r\n4.\r\n下面就要说郭靖的情商了。\r\n郭靖的情商和黄蓉一比，似乎是低到了尘埃里。\r\n蓉儿一句话，郭靖就完全跟着跑，又不会公关又不会做饭，貌似什么事情都办不好。\r\n但是找一找细节，就能发现，其实黄蓉一直在受郭靖的照顾。\r\n        黄蓉道：\u201c靖哥哥，咱俩从瀑布里窜到崖顶上去。\u201d郭靖道：\u201c好，咱们试试。你穿上防身的软甲吧。\u201d\r\n        到得湖岸，郭靖道：\u201c我们先去还了船，还有两匹坐骑寄在那边。\u201d\r\n\r\n黄大小姐一路走来，好不风光，这些收拾行李、寄存马匹的琐碎事情，那是不放在眼里的，那是谁让她一路妥帖周全，帮她惦记着小事情呢？\r\n郭靖。\r\n所以暖男配佳人啊。\r\n另外，郭靖虽然口齿笨拙，不太会讲漂亮话，但是话说出口，也往往能提到重点问题，比如在桃花岛与欧阳克争当女婿的时候，郭靖上来就扎中了红心：\r\n        \u201c蓉儿，你把他\u2026\u2026强抢程大小姐的事说给你爹听！\u201d\r\n要换成一个正常的老丈人，非当场毙了欧阳克不可。\r\n\r\n5.\r\n但是说到底，无论是武林环境（四大高手以及他们的子女徒儿们），还是政治环境（少年时代在成吉思汗身边），郭靖都是处于中心位置，在这里，精英天才俯拾皆是，而资质中等的郭靖和这些人一比，智商情商完全没优势。\r\n郭靖最聪明的地方就是，他立刻在这里找准了自己的位置，并为自己制定了一个方针：\r\n人家练一遍，我练十遍。\r\n这不是一个傻小子只知道死磕的宣言。\r\n这是一个资质中等，从小便开始扎实打基础，机遇不断，每次都不放过，自身有着令人亲近的魅力，又有着举一反三的领悟力的人。\r\n这样的人说他要练十遍，按理说，我们应该练二十遍才是。\r\n可偏偏很多人嘴上说着当郭靖，心里把自己当黄蓉，奋斗的故事讲得口沫横飞，翻一翻考证的课本，还是全新的。\r\n\r\n【本书音频精选自《射雕英雄传》有声书】","thumbnail":"http://jyts-public-oss.longruncloud.com/images/f91a26e40934937f023df2f48eb27a5a71c328b9510509625af92939d8223961.png?x-oss-process=image/resize,w_256,h_256","cover":"http://jyts-public-oss.longruncloud.com/images/f91a26e40934937f023df2f48eb27a5a71c328b9510509625af92939d8223961.png","author":{"id":523,"title":"作者","name":"令狐小跑","description":"略","head":"http://jyts-public-oss.longruncloud.com/images/authors/5767e2228e49cdc173498aed7a7176daef1ed479af777ff6008f30d96112efd4.jpg"},"recorder":{"id":5,"title":"演播","name":"吕磊","description":"山东省胶州电视台主持人，国家一级播音员，从业二十年。\r\n\r\n播音名：小黑驴，录制过多部优秀的有声作品《一枚袁大头》、《竞聘演讲轻松过关》、《领导的真功夫》、《好饭局是设计出来的》\r\n\r\n荣获全国市级电视台\u201c60年60人\u201d荣誉称号。\r\n","head":"http://jyts-public-oss.longruncloud.com/images/recorders/73303227bdf940a597eb489173bc97a3e048e5422ce809bbab1dec9db1825a5c.jpg"},"is_bundle":false,"status_code":0,"status":"完结","section_pages":2}
         * content : 别人练一遍，我练十遍。
         * pages : null
         */

        private BookBean book;
        private String content;
        private Object pages;

        public BookBean getBook() {
            return book;
        }

        public void setBook(BookBean book) {
            this.book = book;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public Object getPages() {
            return pages;
        }

        public void setPages(Object pages) {
            this.pages = pages;
        }

        public static class BookBean {
            /**
             * id : 1292
             * title : 跟郭靖比聪明？你差的不仅是“练十遍”！
             * description : 别人练一遍，我练十遍。
             * <p>
             * 【正文】
             * 1
             * 讲历史，可能有人觉得太老旧；讲文学，可能有人认为太文艺。
             * 然而讲起奋斗来，当真是个个口若悬河，但凡是经历过个把考试、干过数载职员的，都能深挖浅析，讲出至少十几个男默女泪的故事来。
             * 而最后的结尾，总要扯上些自谦之辞、人生哲理，归纳起来，无非就是：
             * 洒可还嫩着，还是幸运的，社会浪淘沙，奋斗是总则。
             * 而奋斗家们最爱的，就是《射雕英雄传》，看着里面郭靖变成了绝代大侠，他们激动得仿佛自己也走上了人生的巅峰。
             * 而他们的人生信条，也就是郭靖的那句话：
             * 别人练一遍，我练十遍。
             * 于是他们不爱听聪明人的故事，聪明人起点高啊，咱不跟他们比！
             * 他们也不爱听富二代的故事，富二代一生下来就坐拥金山银山，有什么意思！
             * 他们最喜欢的就是郭靖这样的主人公，笨拙、穷苦、边远地区出身、没有官宦贵人背景。
             * “这样一个蠢人，都能够成功，那么我智力能力都是上上之选，还像郭靖一样刻苦努力，绝对能成为个中翘楚。”
             * 他们的心里都是这样想的。然而他们搞错了，人家郭靖并不是只靠着死磕，也并不见得能力就比谁低。
             * 我们看看他都拥有什么条件。
             * <p>
             * 2.
             * 首先是家庭背景。很多人看到背景就烦，你是不是鼓吹天生论、命运说？
             * 并不是，这是要跟各位讲，就算有了成就，也别忙着沾沾自喜，觉得自己的奋斗造就了一切，先看看别人对你的帮助有多么重要。
             * 该感谢的感谢，该还钱的还钱，该赡养的赡养。
             * 他的父亲——郭啸天，是谁呢？梁山好汉“赛仁贵”郭盛的后代。
             * 这还好说，毕竟过去这么多代，原生家庭的影响微乎其微。
             * 然而他的父亲还有个过命的朋友——长春子丘处机。在明面上，他父亲还是因为保护这个朋友才遭难的（其实是什么原因咱就先不讨论了）。
             * 丘处机是何许人也？名满天下的全真集团副总裁，据说武功是里面最高的。
             * 所以丘道长四处寻访他，找了辅导班知名群体导师江南七怪去给他补习，一人负责一门功课。要不是这个机缘，什么武林盟主、襄阳英雄、桃花岛女婿，他连金刀驸马都当不上。
             * 丘道长的背景也衍生出了其他人的照应，江南七怪的辅导班还是老式教育，不会因材施教，丘道长的师兄——著名导师马钰马道长，看不过去了，出手点拨了两下，郭靖也不含糊，立刻开窍了。
             * <p>
             * 3.
             * 为什么这么容易开窍，这就是第二点了：智商。
             * 没错我说的就是智商，你们真的以为郭靖智商低么？
             * 我们有他智商低的错觉， 是因为周围的人对比太明显。
             * 一开始江南七怪见到他，就传授了几招，那时托雷在郭靖身边，郭靖还没看清楚第一个姿势，人家托雷在一边儿咔咔练会了。
             * 江南七怪就说：艾玛这小子好笨。
             * 我们也想：艾玛我比他聪明多了。
             * 完全忘了我们军训学军体拳的时光了么？教官演示一遍又一遍，说得口干舌燥，都是在夸你们学得快吗？并不是！
             * 教官都在讲：手抬高！再抬高！这样下去！不是这样，是这样！好，这是第一个姿势啊，我们再复习一遍，走！都说了手抬高了！好，我们第一个姿势就练习5次啊，一定要跟上啊，练5次没练会要去跑圈！
             * 所以说，托雷学会了，郭靖没学会，不是因为郭靖蠢，而是因为托雷聪明。
             * 同理，黄蓉和郭靖、黄药师和郭靖、杨康和郭靖，都是没什么可比性的。
             * 突然觉得郭靖好可怜，周围全是神......
             * 那么郭靖的智商，怎样才能看出来呢？
             * 智商上最接近正常人的，就是周伯通了（别看不起周老爷子的智商！），周伯通和郭靖的那段对话，让所有的读者都舒服了，因为郭靖的智商好像突然就不用被吊打了。
             * 周伯通顺手拿起刚才盛过饭的饭碗，说道：“这只碗只因为中间是空的，才有盛饭的功用，倘若它是实心的一块瓷土，还能装什么饭？”郭靖点点头，心想：“这道理说来很浅，只是我从没想到过。”……郭靖和周伯通以空对空，以柔迎柔，再也不会给他摔倒了，郭靖忽然悟到，说道：“我洪恩师教我使那降龙十八掌，必须发力少而留力多，倒也不是一味刚猛。”
             * <p>
             * 周伯通所讲的武侠道理，郭靖秒懂，而学了几招空明拳，郭靖还能举一反三，发动发散性思维，悟到降龙十八掌上，这种智商就算不是上乘，至少也是中等资质了。
             * <p>
             * 4.
             * 下面就要说郭靖的情商了。
             * 郭靖的情商和黄蓉一比，似乎是低到了尘埃里。
             * 蓉儿一句话，郭靖就完全跟着跑，又不会公关又不会做饭，貌似什么事情都办不好。
             * 但是找一找细节，就能发现，其实黄蓉一直在受郭靖的照顾。
             * 黄蓉道：“靖哥哥，咱俩从瀑布里窜到崖顶上去。”郭靖道：“好，咱们试试。你穿上防身的软甲吧。”
             * 到得湖岸，郭靖道：“我们先去还了船，还有两匹坐骑寄在那边。”
             * <p>
             * 黄大小姐一路走来，好不风光，这些收拾行李、寄存马匹的琐碎事情，那是不放在眼里的，那是谁让她一路妥帖周全，帮她惦记着小事情呢？
             * 郭靖。
             * 所以暖男配佳人啊。
             * 另外，郭靖虽然口齿笨拙，不太会讲漂亮话，但是话说出口，也往往能提到重点问题，比如在桃花岛与欧阳克争当女婿的时候，郭靖上来就扎中了红心：
             * “蓉儿，你把他……强抢程大小姐的事说给你爹听！”
             * 要换成一个正常的老丈人，非当场毙了欧阳克不可。
             * <p>
             * 5.
             * 但是说到底，无论是武林环境（四大高手以及他们的子女徒儿们），还是政治环境（少年时代在成吉思汗身边），郭靖都是处于中心位置，在这里，精英天才俯拾皆是，而资质中等的郭靖和这些人一比，智商情商完全没优势。
             * 郭靖最聪明的地方就是，他立刻在这里找准了自己的位置，并为自己制定了一个方针：
             * 人家练一遍，我练十遍。
             * 这不是一个傻小子只知道死磕的宣言。
             * 这是一个资质中等，从小便开始扎实打基础，机遇不断，每次都不放过，自身有着令人亲近的魅力，又有着举一反三的领悟力的人。
             * 这样的人说他要练十遍，按理说，我们应该练二十遍才是。
             * 可偏偏很多人嘴上说着当郭靖，心里把自己当黄蓉，奋斗的故事讲得口沫横飞，翻一翻考证的课本，还是全新的。
             * <p>
             * 【本书音频精选自《射雕英雄传》有声书】
             * thumbnail : http://jyts-public-oss.longruncloud.com/images/f91a26e40934937f023df2f48eb27a5a71c328b9510509625af92939d8223961.png?x-oss-process=image/resize,w_256,h_256
             * cover : http://jyts-public-oss.longruncloud.com/images/f91a26e40934937f023df2f48eb27a5a71c328b9510509625af92939d8223961.png
             * author : {"id":523,"title":"作者","name":"令狐小跑","description":"略","head":"http://jyts-public-oss.longruncloud.com/images/authors/5767e2228e49cdc173498aed7a7176daef1ed479af777ff6008f30d96112efd4.jpg"}
             * recorder : {"id":5,"title":"演播","name":"吕磊","description":"山东省胶州电视台主持人，国家一级播音员，从业二十年。\r\n\r\n播音名：小黑驴，录制过多部优秀的有声作品《一枚袁大头》、《竞聘演讲轻松过关》、《领导的真功夫》、《好饭局是设计出来的》\r\n\r\n荣获全国市级电视台\u201c60年60人\u201d荣誉称号。\r\n","head":"http://jyts-public-oss.longruncloud.com/images/recorders/73303227bdf940a597eb489173bc97a3e048e5422ce809bbab1dec9db1825a5c.jpg"}
             * is_bundle : false
             * status_code : 0
             * status : 完结
             * section_pages : 2
             */

            private int id;
            private String title;
            private String description;
            private String thumbnail;
            private String cover;
            private AuthorBean author;
            private RecorderBean recorder;
            private boolean is_bundle;
            private int status_code;
            private String status;
            private int section_pages;

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

            public String getThumbnail() {
                return thumbnail;
            }

            public void setThumbnail(String thumbnail) {
                this.thumbnail = thumbnail;
            }

            public String getCover() {
                return cover;
            }

            public void setCover(String cover) {
                this.cover = cover;
            }

            public AuthorBean getAuthor() {
                return author;
            }

            public void setAuthor(AuthorBean author) {
                this.author = author;
            }

            public RecorderBean getRecorder() {
                return recorder;
            }

            public void setRecorder(RecorderBean recorder) {
                this.recorder = recorder;
            }

            public boolean isIs_bundle() {
                return is_bundle;
            }

            public void setIs_bundle(boolean is_bundle) {
                this.is_bundle = is_bundle;
            }

            public int getStatus_code() {
                return status_code;
            }

            public void setStatus_code(int status_code) {
                this.status_code = status_code;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public int getSection_pages() {
                return section_pages;
            }

            public void setSection_pages(int section_pages) {
                this.section_pages = section_pages;
            }

            public static class AuthorBean {
                /**
                 * id : 523
                 * title : 作者
                 * name : 令狐小跑
                 * description : 略
                 * head : http://jyts-public-oss.longruncloud.com/images/authors/5767e2228e49cdc173498aed7a7176daef1ed479af777ff6008f30d96112efd4.jpg
                 */

                private int id;
                private String title;
                private String name;
                private String description;
                private String head;

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

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getDescription() {
                    return description;
                }

                public void setDescription(String description) {
                    this.description = description;
                }

                public String getHead() {
                    return head;
                }

                public void setHead(String head) {
                    this.head = head;
                }
            }

            public static class RecorderBean {
                /**
                 * id : 5
                 * title : 演播
                 * name : 吕磊
                 * description : 山东省胶州电视台主持人，国家一级播音员，从业二十年。
                 * <p>
                 * 播音名：小黑驴，录制过多部优秀的有声作品《一枚袁大头》、《竞聘演讲轻松过关》、《领导的真功夫》、《好饭局是设计出来的》
                 * <p>
                 * 荣获全国市级电视台“60年60人”荣誉称号。
                 * <p>
                 * head : http://jyts-public-oss.longruncloud.com/images/recorders/73303227bdf940a597eb489173bc97a3e048e5422ce809bbab1dec9db1825a5c.jpg
                 */

                private int id;
                private String title;
                private String name;
                private String description;
                private String head;

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

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getDescription() {
                    return description;
                }

                public void setDescription(String description) {
                    this.description = description;
                }

                public String getHead() {
                    return head;
                }

                public void setHead(String head) {
                    this.head = head;
                }
            }
        }
    }

    public static class TopicsBean {
        /**
         * id : 11
         * title : 经典名著
         * cover : http://jyts-public-oss.longruncloud.com/topics/2017/03/21/20341025d86a860f0b53241035cda22d7f89edd613ed9716c505576bddb5cfd5.jpg
         */

        private int id;
        private String title;
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

        public String getCover() {
            return cover;
        }

        public void setCover(String cover) {
            this.cover = cover;
        }
    }

    public static class HotHitsBean {
        /**
         * book : {"id":1077,"title":"傲慢与偏见","description":"国家教育部推荐读物，语文新课标必读丛书。\r\n简·奥斯汀代表作，世界十大小说之一，经典浪漫的伟大爱情小说。傲慢与偏见的浪漫反讽喜剧，女性婚姻与经济关系的深刻写照。\r\n","thumbnail":"http://jyts-public-oss.longruncloud.com/images/f82f5f88371c66d0d751b05f77d8c589aab75fa765d4300bbbd59471f0c9dac7.jpg?x-oss-process=image/resize,w_256,h_256","cover":"http://jyts-public-oss.longruncloud.com/images/f82f5f88371c66d0d751b05f77d8c589aab75fa765d4300bbbd59471f0c9dac7.jpg","author":{"id":372,"title":"作者","name":"简·奥斯汀","description":"简·奥斯汀（Jane Austen），英国女小说家，主要作品有《傲慢与偏见》、《理智与情感》等。\r\n奥斯汀的小说出现在19世纪初叶，一扫风行一时的假浪漫主义潮流，继承和发展了英国18世纪优秀的现实主义传统，为19世纪现实主义小说的高潮做了准备。虽然其作品反映的广度和深度有限，但对改变当时小说创作中的庸俗风气起了好的作用，在英国小说的发展史上有承上启下的意义，被誉为地位\u201c可与莎士比亚平起平坐\u201d的作家。","head":"http://jyts-public-oss.longruncloud.com/images/authors/5bbc5dc1c988b54a4d78b78d0967d9708b615fcf6af7e22aa06adfbcd28cd3c1.jpg"},"recorder":{"id":22,"title":"演播","name":"王春瑞","description":"王春瑞，湖南衡阳人，现就读于广州暨南大学\t\r\n艺考期间，湖南省艺术联考播音主持专业语言考场全省最高分，校考共得到中国传媒大学，湖南大学，重庆大学，暨南大学等八所学校的专业合格证；以暨大播音主持专业湖南省第一的成绩录取进入暨南大学；\r\n暨南大学校园电视台男主播，主配音，记者；\r\n广东广播电视台传媒艺术中心认证讲师，认证主持人；\r\n现任暨南大学校园电视台副台长\r\n2015广州市大学生电影节开幕式主持人；\r\n2015广东大学生广告节启动仪式主持人；\r\n座右铭：无论头上是怎样的天空，我愿意承受任何风暴","head":"http://jyts-public-oss.longruncloud.com/images/recorders/4c900457f77fc68b852081ac9e0b679e27cd036674077fc3cc0fd8e39fb6cdd6.jpg"},"is_bundle":true,"status_code":0,"status":"完结","section_pages":0}
         * pages : null
         */

        private BookBeanX book;
        private Object pages;

        public BookBeanX getBook() {
            return book;
        }

        public void setBook(BookBeanX book) {
            this.book = book;
        }

        public Object getPages() {
            return pages;
        }

        public void setPages(Object pages) {
            this.pages = pages;
        }

        public static class BookBeanX {
            /**
             * id : 1077
             * title : 傲慢与偏见
             * description : 国家教育部推荐读物，语文新课标必读丛书。
             * 简·奥斯汀代表作，世界十大小说之一，经典浪漫的伟大爱情小说。傲慢与偏见的浪漫反讽喜剧，女性婚姻与经济关系的深刻写照。
             * <p>
             * thumbnail : http://jyts-public-oss.longruncloud.com/images/f82f5f88371c66d0d751b05f77d8c589aab75fa765d4300bbbd59471f0c9dac7.jpg?x-oss-process=image/resize,w_256,h_256
             * cover : http://jyts-public-oss.longruncloud.com/images/f82f5f88371c66d0d751b05f77d8c589aab75fa765d4300bbbd59471f0c9dac7.jpg
             * author : {"id":372,"title":"作者","name":"简·奥斯汀","description":"简·奥斯汀（Jane Austen），英国女小说家，主要作品有《傲慢与偏见》、《理智与情感》等。\r\n奥斯汀的小说出现在19世纪初叶，一扫风行一时的假浪漫主义潮流，继承和发展了英国18世纪优秀的现实主义传统，为19世纪现实主义小说的高潮做了准备。虽然其作品反映的广度和深度有限，但对改变当时小说创作中的庸俗风气起了好的作用，在英国小说的发展史上有承上启下的意义，被誉为地位\u201c可与莎士比亚平起平坐\u201d的作家。","head":"http://jyts-public-oss.longruncloud.com/images/authors/5bbc5dc1c988b54a4d78b78d0967d9708b615fcf6af7e22aa06adfbcd28cd3c1.jpg"}
             * recorder : {"id":22,"title":"演播","name":"王春瑞","description":"王春瑞，湖南衡阳人，现就读于广州暨南大学\t\r\n艺考期间，湖南省艺术联考播音主持专业语言考场全省最高分，校考共得到中国传媒大学，湖南大学，重庆大学，暨南大学等八所学校的专业合格证；以暨大播音主持专业湖南省第一的成绩录取进入暨南大学；\r\n暨南大学校园电视台男主播，主配音，记者；\r\n广东广播电视台传媒艺术中心认证讲师，认证主持人；\r\n现任暨南大学校园电视台副台长\r\n2015广州市大学生电影节开幕式主持人；\r\n2015广东大学生广告节启动仪式主持人；\r\n座右铭：无论头上是怎样的天空，我愿意承受任何风暴","head":"http://jyts-public-oss.longruncloud.com/images/recorders/4c900457f77fc68b852081ac9e0b679e27cd036674077fc3cc0fd8e39fb6cdd6.jpg"}
             * is_bundle : true
             * status_code : 0
             * status : 完结
             * section_pages : 0
             */

            private int id;
            private String title;
            private String description;
            private String thumbnail;
            private String cover;
            private AuthorBeanX author;
            private RecorderBeanX recorder;
            private boolean is_bundle;
            private int status_code;
            private String status;
            private int section_pages;

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

            public String getThumbnail() {
                return thumbnail;
            }

            public void setThumbnail(String thumbnail) {
                this.thumbnail = thumbnail;
            }

            public String getCover() {
                return cover;
            }

            public void setCover(String cover) {
                this.cover = cover;
            }

            public AuthorBeanX getAuthor() {
                return author;
            }

            public void setAuthor(AuthorBeanX author) {
                this.author = author;
            }

            public RecorderBeanX getRecorder() {
                return recorder;
            }

            public void setRecorder(RecorderBeanX recorder) {
                this.recorder = recorder;
            }

            public boolean isIs_bundle() {
                return is_bundle;
            }

            public void setIs_bundle(boolean is_bundle) {
                this.is_bundle = is_bundle;
            }

            public int getStatus_code() {
                return status_code;
            }

            public void setStatus_code(int status_code) {
                this.status_code = status_code;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public int getSection_pages() {
                return section_pages;
            }

            public void setSection_pages(int section_pages) {
                this.section_pages = section_pages;
            }

            public static class AuthorBeanX {
                /**
                 * id : 372
                 * title : 作者
                 * name : 简·奥斯汀
                 * description : 简·奥斯汀（Jane Austen），英国女小说家，主要作品有《傲慢与偏见》、《理智与情感》等。
                 * 奥斯汀的小说出现在19世纪初叶，一扫风行一时的假浪漫主义潮流，继承和发展了英国18世纪优秀的现实主义传统，为19世纪现实主义小说的高潮做了准备。虽然其作品反映的广度和深度有限，但对改变当时小说创作中的庸俗风气起了好的作用，在英国小说的发展史上有承上启下的意义，被誉为地位“可与莎士比亚平起平坐”的作家。
                 * head : http://jyts-public-oss.longruncloud.com/images/authors/5bbc5dc1c988b54a4d78b78d0967d9708b615fcf6af7e22aa06adfbcd28cd3c1.jpg
                 */

                private int id;
                private String title;
                private String name;
                private String description;
                private String head;

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

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getDescription() {
                    return description;
                }

                public void setDescription(String description) {
                    this.description = description;
                }

                public String getHead() {
                    return head;
                }

                public void setHead(String head) {
                    this.head = head;
                }
            }

            public static class RecorderBeanX {
                /**
                 * id : 22
                 * title : 演播
                 * name : 王春瑞
                 * description : 王春瑞，湖南衡阳人，现就读于广州暨南大学
                 * 艺考期间，湖南省艺术联考播音主持专业语言考场全省最高分，校考共得到中国传媒大学，湖南大学，重庆大学，暨南大学等八所学校的专业合格证；以暨大播音主持专业湖南省第一的成绩录取进入暨南大学；
                 * 暨南大学校园电视台男主播，主配音，记者；
                 * 广东广播电视台传媒艺术中心认证讲师，认证主持人；
                 * 现任暨南大学校园电视台副台长
                 * 2015广州市大学生电影节开幕式主持人；
                 * 2015广东大学生广告节启动仪式主持人；
                 * 座右铭：无论头上是怎样的天空，我愿意承受任何风暴
                 * head : http://jyts-public-oss.longruncloud.com/images/recorders/4c900457f77fc68b852081ac9e0b679e27cd036674077fc3cc0fd8e39fb6cdd6.jpg
                 */

                private int id;
                private String title;
                private String name;
                private String description;
                private String head;

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

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getDescription() {
                    return description;
                }

                public void setDescription(String description) {
                    this.description = description;
                }

                public String getHead() {
                    return head;
                }

                public void setHead(String head) {
                    this.head = head;
                }
            }
        }
    }

    public static class NewArrivalsBean {
        /**
         * book : {"id":1294,"title":"巴黎圣母院（上部）","description":"思辨美丑，感受善恶。\u201c世界十大名著\u201d位列第二，一曲美女与野兽的爱情悲歌，一部雄浑悲壮的命运交响乐。\r\n\r\n\u201c丑在美的旁边，畸形靠近优美，丑怪藏在崇高背后，美与丑并存，光明与黑暗相共。\u201d\u2014\u2014雨果\r\n\r\n雨果在《巴黎圣母院》里围绕\u201c美与丑\u201d塑造了四个不同的人，善良美丽的吉普赛少女埃斯梅拉达，外表丑陋、内心崇高的的敲钟人伽西莫多，残忍虚伪的副主教弗罗洛以及外表英俊却风流不负责任的皇家护卫队长法比。\r\n\r\n故事发生在黑暗的中世纪。\r\n\r\n愚人节那天，吉普赛少女埃斯梅拉达和她的小羊正在热闹的街头表演歌舞，路过的副主教弗罗洛被她的美丽深深迷倒，他命令对他言听计从的养子卡西莫多劫走她。国王卫队长法比救下了埃斯梅拉达，卡西莫多被鞭打示众，副主教却不予理睬。而善良的埃斯梅拉达给了卡西莫多帮助，少女的善良和宽容感动了卡西莫多\u2026\u2026\r\n\r\n因为得不到埃斯梅拉达的心，副主教竟借教会的力量将她送上绞刑架。忠诚的教堂敲钟人卡西莫多不惜性命去救埃斯梅拉达，最终将副主教从教堂顶楼推下\u2026\u2026\r\n\r\n命运将他们捆绑在一起，赋予他们曲折离奇的经历和错综复杂的情感，最终也造成了他们的毁灭\u2026\u2026","thumbnail":"http://jyts-public-oss.longruncloud.com/images/e573fec838e55d3efe5f91b0aa7e6b2d39c562635af6c9ed6006e660eb51a1cb.jpg?x-oss-process=image/resize,w_256,h_256","cover":"http://jyts-public-oss.longruncloud.com/images/e573fec838e55d3efe5f91b0aa7e6b2d39c562635af6c9ed6006e660eb51a1cb.jpg","author":{"id":230,"title":"作者","name":"雨果","description":"略","head":"http://jyts-public-oss.longruncloud.com/images/authors/0909a99cdf7b8483cd69aa5de45809bde6d5d5794d3281e7de391c4756bc5cfb.png"},"recorder":{"id":458,"title":"演播","name":"黛黛","description":"黛黛，从事播音工作近20年，2014年起开始录制有声作品，类型有：外国文学名著、历史悬疑类、武侠类、古代言情，都市言情，经管社科类等等，作品在多个网站和平台上架播出，拥有较高的点击和播放率。","head":"http://jyts-public-oss.longruncloud.com/images/recorders/e59957a69f47b4d630653ee2e3b8ca4d8992c17f52b987c6a1658b35e521cb40.jpg"},"is_bundle":false,"status_code":0,"status":"完结","section_pages":3}
         * pages : null
         */

        private BookBeanXX book;
        private Object pages;

        public BookBeanXX getBook() {
            return book;
        }

        public void setBook(BookBeanXX book) {
            this.book = book;
        }

        public Object getPages() {
            return pages;
        }

        public void setPages(Object pages) {
            this.pages = pages;
        }

        public static class BookBeanXX {
            /**
             * id : 1294
             * title : 巴黎圣母院（上部）
             * description : 思辨美丑，感受善恶。“世界十大名著”位列第二，一曲美女与野兽的爱情悲歌，一部雄浑悲壮的命运交响乐。
             * <p>
             * “丑在美的旁边，畸形靠近优美，丑怪藏在崇高背后，美与丑并存，光明与黑暗相共。”——雨果
             * <p>
             * 雨果在《巴黎圣母院》里围绕“美与丑”塑造了四个不同的人，善良美丽的吉普赛少女埃斯梅拉达，外表丑陋、内心崇高的的敲钟人伽西莫多，残忍虚伪的副主教弗罗洛以及外表英俊却风流不负责任的皇家护卫队长法比。
             * <p>
             * 故事发生在黑暗的中世纪。
             * <p>
             * 愚人节那天，吉普赛少女埃斯梅拉达和她的小羊正在热闹的街头表演歌舞，路过的副主教弗罗洛被她的美丽深深迷倒，他命令对他言听计从的养子卡西莫多劫走她。国王卫队长法比救下了埃斯梅拉达，卡西莫多被鞭打示众，副主教却不予理睬。而善良的埃斯梅拉达给了卡西莫多帮助，少女的善良和宽容感动了卡西莫多……
             * <p>
             * 因为得不到埃斯梅拉达的心，副主教竟借教会的力量将她送上绞刑架。忠诚的教堂敲钟人卡西莫多不惜性命去救埃斯梅拉达，最终将副主教从教堂顶楼推下……
             * <p>
             * 命运将他们捆绑在一起，赋予他们曲折离奇的经历和错综复杂的情感，最终也造成了他们的毁灭……
             * thumbnail : http://jyts-public-oss.longruncloud.com/images/e573fec838e55d3efe5f91b0aa7e6b2d39c562635af6c9ed6006e660eb51a1cb.jpg?x-oss-process=image/resize,w_256,h_256
             * cover : http://jyts-public-oss.longruncloud.com/images/e573fec838e55d3efe5f91b0aa7e6b2d39c562635af6c9ed6006e660eb51a1cb.jpg
             * author : {"id":230,"title":"作者","name":"雨果","description":"略","head":"http://jyts-public-oss.longruncloud.com/images/authors/0909a99cdf7b8483cd69aa5de45809bde6d5d5794d3281e7de391c4756bc5cfb.png"}
             * recorder : {"id":458,"title":"演播","name":"黛黛","description":"黛黛，从事播音工作近20年，2014年起开始录制有声作品，类型有：外国文学名著、历史悬疑类、武侠类、古代言情，都市言情，经管社科类等等，作品在多个网站和平台上架播出，拥有较高的点击和播放率。","head":"http://jyts-public-oss.longruncloud.com/images/recorders/e59957a69f47b4d630653ee2e3b8ca4d8992c17f52b987c6a1658b35e521cb40.jpg"}
             * is_bundle : false
             * status_code : 0
             * status : 完结
             * section_pages : 3
             */

            private int id;
            private String title;
            private String description;
            private String thumbnail;
            private String cover;
            private AuthorBeanXX author;
            private RecorderBeanXX recorder;
            private boolean is_bundle;
            private int status_code;
            private String status;
            private int section_pages;

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

            public String getThumbnail() {
                return thumbnail;
            }

            public void setThumbnail(String thumbnail) {
                this.thumbnail = thumbnail;
            }

            public String getCover() {
                return cover;
            }

            public void setCover(String cover) {
                this.cover = cover;
            }

            public AuthorBeanXX getAuthor() {
                return author;
            }

            public void setAuthor(AuthorBeanXX author) {
                this.author = author;
            }

            public RecorderBeanXX getRecorder() {
                return recorder;
            }

            public void setRecorder(RecorderBeanXX recorder) {
                this.recorder = recorder;
            }

            public boolean isIs_bundle() {
                return is_bundle;
            }

            public void setIs_bundle(boolean is_bundle) {
                this.is_bundle = is_bundle;
            }

            public int getStatus_code() {
                return status_code;
            }

            public void setStatus_code(int status_code) {
                this.status_code = status_code;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public int getSection_pages() {
                return section_pages;
            }

            public void setSection_pages(int section_pages) {
                this.section_pages = section_pages;
            }

            public static class AuthorBeanXX {
                /**
                 * id : 230
                 * title : 作者
                 * name : 雨果
                 * description : 略
                 * head : http://jyts-public-oss.longruncloud.com/images/authors/0909a99cdf7b8483cd69aa5de45809bde6d5d5794d3281e7de391c4756bc5cfb.png
                 */

                private int id;
                private String title;
                private String name;
                private String description;
                private String head;

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

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getDescription() {
                    return description;
                }

                public void setDescription(String description) {
                    this.description = description;
                }

                public String getHead() {
                    return head;
                }

                public void setHead(String head) {
                    this.head = head;
                }
            }

            public static class RecorderBeanXX {
                /**
                 * id : 458
                 * title : 演播
                 * name : 黛黛
                 * description : 黛黛，从事播音工作近20年，2014年起开始录制有声作品，类型有：外国文学名著、历史悬疑类、武侠类、古代言情，都市言情，经管社科类等等，作品在多个网站和平台上架播出，拥有较高的点击和播放率。
                 * head : http://jyts-public-oss.longruncloud.com/images/recorders/e59957a69f47b4d630653ee2e3b8ca4d8992c17f52b987c6a1658b35e521cb40.jpg
                 */

                private int id;
                private String title;
                private String name;
                private String description;
                private String head;

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

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getDescription() {
                    return description;
                }

                public void setDescription(String description) {
                    this.description = description;
                }

                public String getHead() {
                    return head;
                }

                public void setHead(String head) {
                    this.head = head;
                }
            }
        }
    }

    public static class BestAuthorsBean {
        /**
         * book : {"id":59,"title":"故事新编","description":"以远古神话和历史传说为题材而写就的短篇小说集，短小而意味深长，缺晦涩难懂，带点戏谑的声音，把其\u201c游戏笔墨\u201d的特点发挥得淋漓尽致，通过声音讲述故事，将其中的冰冷更深地隐藏在文字的深处，更彰显整个作品的特殊魅力。","thumbnail":"http://jyts-public-oss.longruncloud.com/images/fdcc3237f282cff67f88820e842bf01a9837f9df9a547cc032275b1ba533228f.jpg?x-oss-process=image/resize,w_256,h_256","cover":"http://jyts-public-oss.longruncloud.com/images/fdcc3237f282cff67f88820e842bf01a9837f9df9a547cc032275b1ba533228f.jpg","author":{"id":7,"title":"作者","name":"鲁迅","description":"鲁迅（1881年9月25日－1936年10月19日），原名周樟寿，后改名周树人，字豫山，后改豫才，\u201c鲁迅\u201d是他1918年发表《狂人日记》时所用的笔名，也是他影响最为广泛的笔名，浙江绍兴人。著名的文学家、思想家、教育家，五四新文化运动的重要参与者，中国现代文学的奠基人。毛泽东曾评价：\u201c鲁迅的方向，就是中华民族新文化的方向。\u201d","head":"http://jyts-public-oss.longruncloud.com/images/authors/f9de5a79def0b406054affe6eea92f4afee3f097e7454d79d70073b508a42234.jpg"},"recorder":{"id":15,"title":"演播","name":"艾德民","description":"央视及多家卫视频道配音员\r\n上海东方卫视《金星秀》栏目配音员\r\n江苏卫视《最强大脑》网络宣传配音员\r\n2012年山西卫视创意中国秀声音形象\r\n上海星尚频道《美食大王牌》配音员\r\n湖南都市频道《寻情记》《怀胎九月》配音员","head":"http://jyts-public-oss.longruncloud.com/images/recorders/50450a3c219ca6acf1e11069daf53027455b097519101bd3b283e262bc87a0a4.jpg"},"is_bundle":false,"status_code":0,"status":"完结","section_pages":1}
         * pages : null
         */

        private BookBeanXXX book;
        private Object pages;

        public BookBeanXXX getBook() {
            return book;
        }

        public void setBook(BookBeanXXX book) {
            this.book = book;
        }

        public Object getPages() {
            return pages;
        }

        public void setPages(Object pages) {
            this.pages = pages;
        }

        public static class BookBeanXXX {
            /**
             * id : 59
             * title : 故事新编
             * description : 以远古神话和历史传说为题材而写就的短篇小说集，短小而意味深长，缺晦涩难懂，带点戏谑的声音，把其“游戏笔墨”的特点发挥得淋漓尽致，通过声音讲述故事，将其中的冰冷更深地隐藏在文字的深处，更彰显整个作品的特殊魅力。
             * thumbnail : http://jyts-public-oss.longruncloud.com/images/fdcc3237f282cff67f88820e842bf01a9837f9df9a547cc032275b1ba533228f.jpg?x-oss-process=image/resize,w_256,h_256
             * cover : http://jyts-public-oss.longruncloud.com/images/fdcc3237f282cff67f88820e842bf01a9837f9df9a547cc032275b1ba533228f.jpg
             * author : {"id":7,"title":"作者","name":"鲁迅","description":"鲁迅（1881年9月25日－1936年10月19日），原名周樟寿，后改名周树人，字豫山，后改豫才，\u201c鲁迅\u201d是他1918年发表《狂人日记》时所用的笔名，也是他影响最为广泛的笔名，浙江绍兴人。著名的文学家、思想家、教育家，五四新文化运动的重要参与者，中国现代文学的奠基人。毛泽东曾评价：\u201c鲁迅的方向，就是中华民族新文化的方向。\u201d","head":"http://jyts-public-oss.longruncloud.com/images/authors/f9de5a79def0b406054affe6eea92f4afee3f097e7454d79d70073b508a42234.jpg"}
             * recorder : {"id":15,"title":"演播","name":"艾德民","description":"央视及多家卫视频道配音员\r\n上海东方卫视《金星秀》栏目配音员\r\n江苏卫视《最强大脑》网络宣传配音员\r\n2012年山西卫视创意中国秀声音形象\r\n上海星尚频道《美食大王牌》配音员\r\n湖南都市频道《寻情记》《怀胎九月》配音员","head":"http://jyts-public-oss.longruncloud.com/images/recorders/50450a3c219ca6acf1e11069daf53027455b097519101bd3b283e262bc87a0a4.jpg"}
             * is_bundle : false
             * status_code : 0
             * status : 完结
             * section_pages : 1
             */

            private int id;
            private String title;
            private String description;
            private String thumbnail;
            private String cover;
            private AuthorBeanXXX author;
            private RecorderBeanXXX recorder;
            private boolean is_bundle;
            private int status_code;
            private String status;
            private int section_pages;

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

            public String getThumbnail() {
                return thumbnail;
            }

            public void setThumbnail(String thumbnail) {
                this.thumbnail = thumbnail;
            }

            public String getCover() {
                return cover;
            }

            public void setCover(String cover) {
                this.cover = cover;
            }

            public AuthorBeanXXX getAuthor() {
                return author;
            }

            public void setAuthor(AuthorBeanXXX author) {
                this.author = author;
            }

            public RecorderBeanXXX getRecorder() {
                return recorder;
            }

            public void setRecorder(RecorderBeanXXX recorder) {
                this.recorder = recorder;
            }

            public boolean isIs_bundle() {
                return is_bundle;
            }

            public void setIs_bundle(boolean is_bundle) {
                this.is_bundle = is_bundle;
            }

            public int getStatus_code() {
                return status_code;
            }

            public void setStatus_code(int status_code) {
                this.status_code = status_code;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public int getSection_pages() {
                return section_pages;
            }

            public void setSection_pages(int section_pages) {
                this.section_pages = section_pages;
            }

            public static class AuthorBeanXXX {
                /**
                 * id : 7
                 * title : 作者
                 * name : 鲁迅
                 * description : 鲁迅（1881年9月25日－1936年10月19日），原名周樟寿，后改名周树人，字豫山，后改豫才，“鲁迅”是他1918年发表《狂人日记》时所用的笔名，也是他影响最为广泛的笔名，浙江绍兴人。著名的文学家、思想家、教育家，五四新文化运动的重要参与者，中国现代文学的奠基人。毛泽东曾评价：“鲁迅的方向，就是中华民族新文化的方向。”
                 * head : http://jyts-public-oss.longruncloud.com/images/authors/f9de5a79def0b406054affe6eea92f4afee3f097e7454d79d70073b508a42234.jpg
                 */

                private int id;
                private String title;
                private String name;
                private String description;
                private String head;

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

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getDescription() {
                    return description;
                }

                public void setDescription(String description) {
                    this.description = description;
                }

                public String getHead() {
                    return head;
                }

                public void setHead(String head) {
                    this.head = head;
                }
            }

            public static class RecorderBeanXXX {
                /**
                 * id : 15
                 * title : 演播
                 * name : 艾德民
                 * description : 央视及多家卫视频道配音员
                 * 上海东方卫视《金星秀》栏目配音员
                 * 江苏卫视《最强大脑》网络宣传配音员
                 * 2012年山西卫视创意中国秀声音形象
                 * 上海星尚频道《美食大王牌》配音员
                 * 湖南都市频道《寻情记》《怀胎九月》配音员
                 * head : http://jyts-public-oss.longruncloud.com/images/recorders/50450a3c219ca6acf1e11069daf53027455b097519101bd3b283e262bc87a0a4.jpg
                 */

                private int id;
                private String title;
                private String name;
                private String description;
                private String head;

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

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getDescription() {
                    return description;
                }

                public void setDescription(String description) {
                    this.description = description;
                }

                public String getHead() {
                    return head;
                }

                public void setHead(String head) {
                    this.head = head;
                }
            }
        }
    }

    public static class HotRecordersBean {
        /**
         * recorder : {"id":18,"title":"演播","name":"孟东儒","description":"孟东儒，播音名：韦一笑。1987年圣诞节出生在一个艺术世家。父亲是一名民族歌手，从小秉承父亲的艺术细胞，虽然在音乐上没有突出的造诣，但在语言上却有过人的天赋。6岁时开始热爱相声艺术，8岁登台演出，16岁跟随老相声艺人学习相声并常年活跃在舞台上，擅长柳活儿（即学唱）、模仿等。2014年开始接触有声小说，一出道就为多家公司录制了数十万字的有声作品并获得一致认可。2015年跟随著名有声小说播讲员巴胡子学习有声小说播讲，并与同年正式拜入巴胡子门下为徒。\r\n播音风格诙谐幽默、轻松明快，善于刻画人物、剖析人物性格，大处气势磅礴，小处细致入微。立志将单口相声的包袱融入有声小说中，独树一帜，开拓创新，打造一个全新的播音风格。","head":"http://jyts-public-oss.longruncloud.com/images/recorders/5a3a03fa6464bb0ea16d68e2580d03f6e8778c908a67c3497d2fe81eae983404.jpg"}
         * books : [{"book":{"id":431,"title":"西游记","description":"原本顽石，通灵化猴，怎耐一身本领！？夺神铁，改生死，大闹天宫，只因心比天高。齐天不敌五指，难逃禁锢。机缘所在，护师上路。师徒四人，除妖魔，度劫难，终得圣经。\r\n斗战胜佛，得的是万民敬仰，功德无量，还是一身桎梏，初心不在？\r\n新评书版西游记，为你呈现原始的孙悟空，真实的唐三藏，或许齐天大圣不仅是威风凛凛，更是一只撒泼打滚的小皮猴，或许唐三藏不仅是德高望重的圣僧，还是会惊讶、会紧张的平凡人，说一家之言，自有自的评判。","thumbnail":"http://jyts-public-oss.longruncloud.com/images/d7fd78c750e21b865a5e46ef6535815db5277f4df201c19ea51ebfe461d941c8.jpg?x-oss-process=image/resize,w_256,h_256","cover":"http://jyts-public-oss.longruncloud.com/images/d7fd78c750e21b865a5e46ef6535815db5277f4df201c19ea51ebfe461d941c8.jpg","author":{"id":6,"title":"作者","name":"吴承恩","description":"吴承恩（1510\u2014\u20141582），明代小说家，字汝忠，别号射阳山人，淮安山阳（今江苏淮安）人，生于一个由学官沦落为商人的家族，家境清贫。吴承恩自幼聪明过人，《淮安府志》载他\u201c性敏而多慧，博极群书，为诗文下笔立成。但他科考不利，至中年才补上\u201c岁贡生\u201d，后流寓南京，长期靠卖文补贴家用。晚年出任长兴县丞，由于看不惯官场的黑暗，不久愤而辞官，贫老以终。","head":"http://jyts-public-oss.longruncloud.com/images/authors/6b1dfb7d69723cadc64124280198f6e00c83f08c41579f72e142a3df7d8a45ec.jpg"},"recorder":{"id":252,"title":"演播","name":"韦一笑","description":"韦一笑。1987年圣诞节出生在一个艺术世家。父亲是一名民族歌手，从小秉承父亲的艺术细胞，虽然在音乐上没有突出的造诣，但在语言上却有过人的天赋。6岁时开始热爱相声艺术，8岁登台演出，16岁跟随老相声艺人学习相声并常年活跃在舞台上，擅长柳活儿（即学唱）、模仿等。2014年开始接触有声小说，一出道就为多家公司录制了数十万字的有声作品并获得一致认可。2015年跟随著名有声小说播讲员巴胡子学习有声小说播讲，并与同年正式拜入巴胡子门下为徒。\r\n播音风格诙谐幽默、轻松明快，善于刻画人物、剖析人物性格，大处气势磅礴，小处细致入微。立志将单口相声的包袱融入有声小说中，独树一帜，开拓创新，打造一个全新的播音风格。","head":"http://jyts-public-oss.longruncloud.com/images/recorders/e1ba90eae10d15af90955e258a71d402c438d40e1e26183149372f066165a37b.jpg"},"is_bundle":true,"status_code":0,"status":"完结","section_pages":0}},{"book":{"id":391,"title":"射雕英雄传（山东话版）","description":"谁听谁乐呵，《射雕英雄传》山东话版，给你一个不一样的英雄梦！","thumbnail":"http://jyts-public-oss.longruncloud.com/images/732837ec7cdf2db7f42842eb58ff71963a889e07c2c031f9f74d9750cc6631b2.jpg?x-oss-process=image/resize,w_256,h_256","cover":"http://jyts-public-oss.longruncloud.com/images/732837ec7cdf2db7f42842eb58ff71963a889e07c2c031f9f74d9750cc6631b2.jpg","author":{"id":1,"title":"作者","name":"金庸","description":"金庸，本名查良镛，浙江海宁人，一九二四年生。曾任报社记者、翻译、编辑，电影公司编剧、导演等。一九五九年在香港创办明报机构，出版报纸、杂志及书籍，1955年以金庸为笔名在香港《新晚报》副刊连载武侠小说《书剑恩仇录》。由此开始，先后创作武侠小说十五部，开创了中国当代文学新领域，广受读者欢迎，至今已蔚为全世界华人的共同语言，并兴起海内外金学研究风气。其《金庸作品集》已出版中文简体、繁体版，并有英、法、意大利、希腊、日、韩、泰、越、印尼等多种译文。","head":"http://jyts-public-oss.longruncloud.com/images/authors/b4d32d651aa2fac799c3786392c3c408a5a2fb9ab42a06c1ed8a82e6f65033e3.jpg"},"recorder":{"id":18,"title":"演播","name":"孟东儒","description":"孟东儒，播音名：韦一笑。1987年圣诞节出生在一个艺术世家。父亲是一名民族歌手，从小秉承父亲的艺术细胞，虽然在音乐上没有突出的造诣，但在语言上却有过人的天赋。6岁时开始热爱相声艺术，8岁登台演出，16岁跟随老相声艺人学习相声并常年活跃在舞台上，擅长柳活儿（即学唱）、模仿等。2014年开始接触有声小说，一出道就为多家公司录制了数十万字的有声作品并获得一致认可。2015年跟随著名有声小说播讲员巴胡子学习有声小说播讲，并与同年正式拜入巴胡子门下为徒。\r\n播音风格诙谐幽默、轻松明快，善于刻画人物、剖析人物性格，大处气势磅礴，小处细致入微。立志将单口相声的包袱融入有声小说中，独树一帜，开拓创新，打造一个全新的播音风格。","head":"http://jyts-public-oss.longruncloud.com/images/recorders/5a3a03fa6464bb0ea16d68e2580d03f6e8778c908a67c3497d2fe81eae983404.jpg"},"is_bundle":false,"status_code":1,"status":"连载","section_pages":1}}]
         */

        private RecorderBeanXXXX recorder;
        private List<BooksBean> books;

        public RecorderBeanXXXX getRecorder() {
            return recorder;
        }

        public void setRecorder(RecorderBeanXXXX recorder) {
            this.recorder = recorder;
        }

        public List<BooksBean> getBooks() {
            return books;
        }

        public void setBooks(List<BooksBean> books) {
            this.books = books;
        }

        public static class RecorderBeanXXXX {
            /**
             * id : 18
             * title : 演播
             * name : 孟东儒
             * description : 孟东儒，播音名：韦一笑。1987年圣诞节出生在一个艺术世家。父亲是一名民族歌手，从小秉承父亲的艺术细胞，虽然在音乐上没有突出的造诣，但在语言上却有过人的天赋。6岁时开始热爱相声艺术，8岁登台演出，16岁跟随老相声艺人学习相声并常年活跃在舞台上，擅长柳活儿（即学唱）、模仿等。2014年开始接触有声小说，一出道就为多家公司录制了数十万字的有声作品并获得一致认可。2015年跟随著名有声小说播讲员巴胡子学习有声小说播讲，并与同年正式拜入巴胡子门下为徒。
             * 播音风格诙谐幽默、轻松明快，善于刻画人物、剖析人物性格，大处气势磅礴，小处细致入微。立志将单口相声的包袱融入有声小说中，独树一帜，开拓创新，打造一个全新的播音风格。
             * head : http://jyts-public-oss.longruncloud.com/images/recorders/5a3a03fa6464bb0ea16d68e2580d03f6e8778c908a67c3497d2fe81eae983404.jpg
             */

            private int id;
            private String title;
            private String name;
            private String description;
            private String head;

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

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getHead() {
                return head;
            }

            public void setHead(String head) {
                this.head = head;
            }
        }

        public static class BooksBean {
            /**
             * book : {"id":431,"title":"西游记","description":"原本顽石，通灵化猴，怎耐一身本领！？夺神铁，改生死，大闹天宫，只因心比天高。齐天不敌五指，难逃禁锢。机缘所在，护师上路。师徒四人，除妖魔，度劫难，终得圣经。\r\n斗战胜佛，得的是万民敬仰，功德无量，还是一身桎梏，初心不在？\r\n新评书版西游记，为你呈现原始的孙悟空，真实的唐三藏，或许齐天大圣不仅是威风凛凛，更是一只撒泼打滚的小皮猴，或许唐三藏不仅是德高望重的圣僧，还是会惊讶、会紧张的平凡人，说一家之言，自有自的评判。","thumbnail":"http://jyts-public-oss.longruncloud.com/images/d7fd78c750e21b865a5e46ef6535815db5277f4df201c19ea51ebfe461d941c8.jpg?x-oss-process=image/resize,w_256,h_256","cover":"http://jyts-public-oss.longruncloud.com/images/d7fd78c750e21b865a5e46ef6535815db5277f4df201c19ea51ebfe461d941c8.jpg","author":{"id":6,"title":"作者","name":"吴承恩","description":"吴承恩（1510\u2014\u20141582），明代小说家，字汝忠，别号射阳山人，淮安山阳（今江苏淮安）人，生于一个由学官沦落为商人的家族，家境清贫。吴承恩自幼聪明过人，《淮安府志》载他\u201c性敏而多慧，博极群书，为诗文下笔立成。但他科考不利，至中年才补上\u201c岁贡生\u201d，后流寓南京，长期靠卖文补贴家用。晚年出任长兴县丞，由于看不惯官场的黑暗，不久愤而辞官，贫老以终。","head":"http://jyts-public-oss.longruncloud.com/images/authors/6b1dfb7d69723cadc64124280198f6e00c83f08c41579f72e142a3df7d8a45ec.jpg"},"recorder":{"id":252,"title":"演播","name":"韦一笑","description":"韦一笑。1987年圣诞节出生在一个艺术世家。父亲是一名民族歌手，从小秉承父亲的艺术细胞，虽然在音乐上没有突出的造诣，但在语言上却有过人的天赋。6岁时开始热爱相声艺术，8岁登台演出，16岁跟随老相声艺人学习相声并常年活跃在舞台上，擅长柳活儿（即学唱）、模仿等。2014年开始接触有声小说，一出道就为多家公司录制了数十万字的有声作品并获得一致认可。2015年跟随著名有声小说播讲员巴胡子学习有声小说播讲，并与同年正式拜入巴胡子门下为徒。\r\n播音风格诙谐幽默、轻松明快，善于刻画人物、剖析人物性格，大处气势磅礴，小处细致入微。立志将单口相声的包袱融入有声小说中，独树一帜，开拓创新，打造一个全新的播音风格。","head":"http://jyts-public-oss.longruncloud.com/images/recorders/e1ba90eae10d15af90955e258a71d402c438d40e1e26183149372f066165a37b.jpg"},"is_bundle":true,"status_code":0,"status":"完结","section_pages":0}
             */

            private BookBeanXXXX book;

            public BookBeanXXXX getBook() {
                return book;
            }

            public void setBook(BookBeanXXXX book) {
                this.book = book;
            }

            public static class BookBeanXXXX {
                /**
                 * id : 431
                 * title : 西游记
                 * description : 原本顽石，通灵化猴，怎耐一身本领！？夺神铁，改生死，大闹天宫，只因心比天高。齐天不敌五指，难逃禁锢。机缘所在，护师上路。师徒四人，除妖魔，度劫难，终得圣经。
                 * 斗战胜佛，得的是万民敬仰，功德无量，还是一身桎梏，初心不在？
                 * 新评书版西游记，为你呈现原始的孙悟空，真实的唐三藏，或许齐天大圣不仅是威风凛凛，更是一只撒泼打滚的小皮猴，或许唐三藏不仅是德高望重的圣僧，还是会惊讶、会紧张的平凡人，说一家之言，自有自的评判。
                 * thumbnail : http://jyts-public-oss.longruncloud.com/images/d7fd78c750e21b865a5e46ef6535815db5277f4df201c19ea51ebfe461d941c8.jpg?x-oss-process=image/resize,w_256,h_256
                 * cover : http://jyts-public-oss.longruncloud.com/images/d7fd78c750e21b865a5e46ef6535815db5277f4df201c19ea51ebfe461d941c8.jpg
                 * author : {"id":6,"title":"作者","name":"吴承恩","description":"吴承恩（1510\u2014\u20141582），明代小说家，字汝忠，别号射阳山人，淮安山阳（今江苏淮安）人，生于一个由学官沦落为商人的家族，家境清贫。吴承恩自幼聪明过人，《淮安府志》载他\u201c性敏而多慧，博极群书，为诗文下笔立成。但他科考不利，至中年才补上\u201c岁贡生\u201d，后流寓南京，长期靠卖文补贴家用。晚年出任长兴县丞，由于看不惯官场的黑暗，不久愤而辞官，贫老以终。","head":"http://jyts-public-oss.longruncloud.com/images/authors/6b1dfb7d69723cadc64124280198f6e00c83f08c41579f72e142a3df7d8a45ec.jpg"}
                 * recorder : {"id":252,"title":"演播","name":"韦一笑","description":"韦一笑。1987年圣诞节出生在一个艺术世家。父亲是一名民族歌手，从小秉承父亲的艺术细胞，虽然在音乐上没有突出的造诣，但在语言上却有过人的天赋。6岁时开始热爱相声艺术，8岁登台演出，16岁跟随老相声艺人学习相声并常年活跃在舞台上，擅长柳活儿（即学唱）、模仿等。2014年开始接触有声小说，一出道就为多家公司录制了数十万字的有声作品并获得一致认可。2015年跟随著名有声小说播讲员巴胡子学习有声小说播讲，并与同年正式拜入巴胡子门下为徒。\r\n播音风格诙谐幽默、轻松明快，善于刻画人物、剖析人物性格，大处气势磅礴，小处细致入微。立志将单口相声的包袱融入有声小说中，独树一帜，开拓创新，打造一个全新的播音风格。","head":"http://jyts-public-oss.longruncloud.com/images/recorders/e1ba90eae10d15af90955e258a71d402c438d40e1e26183149372f066165a37b.jpg"}
                 * is_bundle : true
                 * status_code : 0
                 * status : 完结
                 * section_pages : 0
                 */

                private int id;
                private String title;
                private String description;
                private String thumbnail;
                private String cover;
                private AuthorBeanXXXX author;
                private RecorderBeanXXXXX recorder;
                private boolean is_bundle;
                private int status_code;
                private String status;
                private int section_pages;

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

                public String getThumbnail() {
                    return thumbnail;
                }

                public void setThumbnail(String thumbnail) {
                    this.thumbnail = thumbnail;
                }

                public String getCover() {
                    return cover;
                }

                public void setCover(String cover) {
                    this.cover = cover;
                }

                public AuthorBeanXXXX getAuthor() {
                    return author;
                }

                public void setAuthor(AuthorBeanXXXX author) {
                    this.author = author;
                }

                public RecorderBeanXXXXX getRecorder() {
                    return recorder;
                }

                public void setRecorder(RecorderBeanXXXXX recorder) {
                    this.recorder = recorder;
                }

                public boolean isIs_bundle() {
                    return is_bundle;
                }

                public void setIs_bundle(boolean is_bundle) {
                    this.is_bundle = is_bundle;
                }

                public int getStatus_code() {
                    return status_code;
                }

                public void setStatus_code(int status_code) {
                    this.status_code = status_code;
                }

                public String getStatus() {
                    return status;
                }

                public void setStatus(String status) {
                    this.status = status;
                }

                public int getSection_pages() {
                    return section_pages;
                }

                public void setSection_pages(int section_pages) {
                    this.section_pages = section_pages;
                }

                public static class AuthorBeanXXXX {
                    /**
                     * id : 6
                     * title : 作者
                     * name : 吴承恩
                     * description : 吴承恩（1510——1582），明代小说家，字汝忠，别号射阳山人，淮安山阳（今江苏淮安）人，生于一个由学官沦落为商人的家族，家境清贫。吴承恩自幼聪明过人，《淮安府志》载他“性敏而多慧，博极群书，为诗文下笔立成。但他科考不利，至中年才补上“岁贡生”，后流寓南京，长期靠卖文补贴家用。晚年出任长兴县丞，由于看不惯官场的黑暗，不久愤而辞官，贫老以终。
                     * head : http://jyts-public-oss.longruncloud.com/images/authors/6b1dfb7d69723cadc64124280198f6e00c83f08c41579f72e142a3df7d8a45ec.jpg
                     */

                    private int id;
                    private String title;
                    private String name;
                    private String description;
                    private String head;

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

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getDescription() {
                        return description;
                    }

                    public void setDescription(String description) {
                        this.description = description;
                    }

                    public String getHead() {
                        return head;
                    }

                    public void setHead(String head) {
                        this.head = head;
                    }
                }

                public static class RecorderBeanXXXXX {
                    /**
                     * id : 252
                     * title : 演播
                     * name : 韦一笑
                     * description : 韦一笑。1987年圣诞节出生在一个艺术世家。父亲是一名民族歌手，从小秉承父亲的艺术细胞，虽然在音乐上没有突出的造诣，但在语言上却有过人的天赋。6岁时开始热爱相声艺术，8岁登台演出，16岁跟随老相声艺人学习相声并常年活跃在舞台上，擅长柳活儿（即学唱）、模仿等。2014年开始接触有声小说，一出道就为多家公司录制了数十万字的有声作品并获得一致认可。2015年跟随著名有声小说播讲员巴胡子学习有声小说播讲，并与同年正式拜入巴胡子门下为徒。
                     * 播音风格诙谐幽默、轻松明快，善于刻画人物、剖析人物性格，大处气势磅礴，小处细致入微。立志将单口相声的包袱融入有声小说中，独树一帜，开拓创新，打造一个全新的播音风格。
                     * head : http://jyts-public-oss.longruncloud.com/images/recorders/e1ba90eae10d15af90955e258a71d402c438d40e1e26183149372f066165a37b.jpg
                     */

                    private int id;
                    private String title;
                    private String name;
                    private String description;
                    private String head;

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

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getDescription() {
                        return description;
                    }

                    public void setDescription(String description) {
                        this.description = description;
                    }

                    public String getHead() {
                        return head;
                    }

                    public void setHead(String head) {
                        this.head = head;
                    }
                }
            }
        }
    }

    public static class RecommendationsBean {
        /**
         * id : 19
         * type :
         * cover : null
         * name : 金庸武侠
         * count_of_books : 22
         * books : [{"book":{"id":5,"title":"飞狐外传","description":"《雪山飞狐》番外篇，大侠胡斐的成长之路。江湖纷争夹杂着三角关系，又热闹又缠绵。无奈大侠终会长大，生死离别是成长的烙印。","thumbnail":"http://jyts-public-oss.longruncloud.com/images/4ab7e00c44f0060f35e7e3ae49ef3eecc481022adc41e330f63c39798c5a2959.jpg?x-oss-process=image/resize,w_256,h_256","cover":"http://jyts-public-oss.longruncloud.com/images/4ab7e00c44f0060f35e7e3ae49ef3eecc481022adc41e330f63c39798c5a2959.jpg","author":{"id":1,"title":"作者","name":"金庸","description":"金庸，本名查良镛，浙江海宁人，一九二四年生。曾任报社记者、翻译、编辑，电影公司编剧、导演等。一九五九年在香港创办明报机构，出版报纸、杂志及书籍，1955年以金庸为笔名在香港《新晚报》副刊连载武侠小说《书剑恩仇录》。由此开始，先后创作武侠小说十五部，开创了中国当代文学新领域，广受读者欢迎，至今已蔚为全世界华人的共同语言，并兴起海内外金学研究风气。其《金庸作品集》已出版中文简体、繁体版，并有英、法、意大利、希腊、日、韩、泰、越、印尼等多种译文。","head":"http://jyts-public-oss.longruncloud.com/images/authors/b4d32d651aa2fac799c3786392c3c408a5a2fb9ab42a06c1ed8a82e6f65033e3.jpg"},"recorder":{"id":3,"title":"演播","name":"袁志伟","description":"从事电台主持人工作至今，曾在多家地方和网络媒体工作，如：厦广音乐台 、北京一听音乐网 、扬州音乐广播等。\r\n\r\n接触有声小说多年，至今已经演播了长短篇小说30余部，如：《狱霸》《叱咤》《红嫁衣》《惊悚集系列》《鬼故事谜系列》《网游之盗版神话》《我一无是处的大学青春》等 。\r\n","head":"http://jyts-public-oss.longruncloud.com/images/recorders/3e799d989f168bf3dd95b2c94dce34266af30281185ec075462c8bdd8c23f736.jpg"},"is_bundle":true,"status_code":0,"status":"完结","section_pages":0}},{"book":{"id":8,"title":"雪山飞狐","description":"胡、苗、范、田四家本来同是闯王侍卫，何以百年来互相仇杀不断？千年雪峰上又藏着怎样的惊天宝藏？沧州大战，本是宿世冤仇，何以相逢恨晚？累世血仇，何日方能化解？","thumbnail":"http://jyts-public-oss.longruncloud.com/images/342a774000c307b1a7e64338978451d3b3b63bda9c2c47b74817a1beeee2f5ad.jpg?x-oss-process=image/resize,w_256,h_256","cover":"http://jyts-public-oss.longruncloud.com/images/342a774000c307b1a7e64338978451d3b3b63bda9c2c47b74817a1beeee2f5ad.jpg","author":{"id":1,"title":"作者","name":"金庸","description":"金庸，本名查良镛，浙江海宁人，一九二四年生。曾任报社记者、翻译、编辑，电影公司编剧、导演等。一九五九年在香港创办明报机构，出版报纸、杂志及书籍，1955年以金庸为笔名在香港《新晚报》副刊连载武侠小说《书剑恩仇录》。由此开始，先后创作武侠小说十五部，开创了中国当代文学新领域，广受读者欢迎，至今已蔚为全世界华人的共同语言，并兴起海内外金学研究风气。其《金庸作品集》已出版中文简体、繁体版，并有英、法、意大利、希腊、日、韩、泰、越、印尼等多种译文。","head":"http://jyts-public-oss.longruncloud.com/images/authors/b4d32d651aa2fac799c3786392c3c408a5a2fb9ab42a06c1ed8a82e6f65033e3.jpg"},"recorder":{"id":12,"title":"演播","name":"思迈","description":"","head":""},"is_bundle":false,"status_code":0,"status":"完结","section_pages":3}},{"book":{"id":9,"title":"连城诀","description":"与世无争的乡间少年狄云突然含冤入狱，受尽折磨终于学成高强武功。当真相步步接近，却发现背后关系一个惊天宝藏，一套绝世武功。刻画人性善恶的武侠寓言，始作俑者往往是自己最信任的人。","thumbnail":"http://jyts-public-oss.longruncloud.com/images/f2eea189ccd59149736fa39a3cba6762fc87a4aa46454afb7f2da68601d27fc7.jpg?x-oss-process=image/resize,w_256,h_256","cover":"http://jyts-public-oss.longruncloud.com/images/f2eea189ccd59149736fa39a3cba6762fc87a4aa46454afb7f2da68601d27fc7.jpg","author":{"id":1,"title":"作者","name":"金庸","description":"金庸，本名查良镛，浙江海宁人，一九二四年生。曾任报社记者、翻译、编辑，电影公司编剧、导演等。一九五九年在香港创办明报机构，出版报纸、杂志及书籍，1955年以金庸为笔名在香港《新晚报》副刊连载武侠小说《书剑恩仇录》。由此开始，先后创作武侠小说十五部，开创了中国当代文学新领域，广受读者欢迎，至今已蔚为全世界华人的共同语言，并兴起海内外金学研究风气。其《金庸作品集》已出版中文简体、繁体版，并有英、法、意大利、希腊、日、韩、泰、越、印尼等多种译文。","head":"http://jyts-public-oss.longruncloud.com/images/authors/b4d32d651aa2fac799c3786392c3c408a5a2fb9ab42a06c1ed8a82e6f65033e3.jpg"},"recorder":{"id":4,"title":"演播","name":"李晓慧","description":"从事播音、配音工作多年，播音名：第二城子。\r\n\r\n录制了多部优秀有声小说、广播剧作品。主要代表作：机甲战斗类 《冒牌大英雄》  、\r\n武侠类《一刀倾城》 、都市玄幻类 《我的贴身校花》、修仙奇幻类 《完美世界》 等。\r\n","head":"http://jyts-public-oss.longruncloud.com/images/recorders/8b6f795c340b9dea0b8764d038dc20f97bda7144625d5c089b9937a4d963a363.jpg"},"is_bundle":false,"status_code":0,"status":"完结","section_pages":5}},{"book":{"id":10,"title":"天龙八部","description":"生老病死、求不得、爱别离、怨憎会是苦，都道是有情皆孽，无人不冤。公子王孙、豪情侠客、如水佳人，叹一句万般皆是命，半点不由人。","thumbnail":"http://jyts-public-oss.longruncloud.com/images/8e07b6466ed49ae0e5f2274def259a2e29dec49d042cb3170a3f992bef4a2ecf.jpg?x-oss-process=image/resize,w_256,h_256","cover":"http://jyts-public-oss.longruncloud.com/images/8e07b6466ed49ae0e5f2274def259a2e29dec49d042cb3170a3f992bef4a2ecf.jpg","author":{"id":1,"title":"作者","name":"金庸","description":"金庸，本名查良镛，浙江海宁人，一九二四年生。曾任报社记者、翻译、编辑，电影公司编剧、导演等。一九五九年在香港创办明报机构，出版报纸、杂志及书籍，1955年以金庸为笔名在香港《新晚报》副刊连载武侠小说《书剑恩仇录》。由此开始，先后创作武侠小说十五部，开创了中国当代文学新领域，广受读者欢迎，至今已蔚为全世界华人的共同语言，并兴起海内外金学研究风气。其《金庸作品集》已出版中文简体、繁体版，并有英、法、意大利、希腊、日、韩、泰、越、印尼等多种译文。","head":"http://jyts-public-oss.longruncloud.com/images/authors/b4d32d651aa2fac799c3786392c3c408a5a2fb9ab42a06c1ed8a82e6f65033e3.jpg"},"recorder":{"id":7,"title":"演播","name":"王殷康","description":" 毕业于名校播音主持专业。\r\n\r\n      现任湖南广播电视集团专业配音员，录制新闻类、政法专业作品达千余部。\r\n\r\n著名网站主持人。\r\n\r\n录制过《世界是部金融史》等多部优秀有声作品。\r\n\r\n荣获全国校园金话筒金奖\r\n\r\n全国校园金话筒最佳人气奖\r\n\r\n全国文学大赛朗诵金奖。\r\n","head":"http://jyts-public-oss.longruncloud.com/images/recorders/2d93ad4ce9210cc6667a2443f7017bab3e6d395e89441d23d61cfe06f3edb077.jpg"},"is_bundle":true,"status_code":0,"status":"完结","section_pages":0}},{"book":{"id":16,"title":"射雕英雄传","description":"金庸武侠宗师地位奠基之作，百所名校中学生阅读推荐书目！\r\n\r\n金庸脍炙人口的作品，平凡人逆袭成一代大侠的故事。有绝世武功，有美人相伴，傻郭靖、俏黄蓉成就一段武林佳话。从漠北到江南，只要有一颗纯朴善良的赤子之心，终会成为一代射雕英雄。","thumbnail":"http://jyts-public-oss.longruncloud.com/images/fae518630b11a8cd690cc4262f546e59b4c4c3e00ee400e56d357439a32b4046.jpg?x-oss-process=image/resize,w_256,h_256","cover":"http://jyts-public-oss.longruncloud.com/images/fae518630b11a8cd690cc4262f546e59b4c4c3e00ee400e56d357439a32b4046.jpg","author":{"id":1,"title":"作者","name":"金庸","description":"金庸，本名查良镛，浙江海宁人，一九二四年生。曾任报社记者、翻译、编辑，电影公司编剧、导演等。一九五九年在香港创办明报机构，出版报纸、杂志及书籍，1955年以金庸为笔名在香港《新晚报》副刊连载武侠小说《书剑恩仇录》。由此开始，先后创作武侠小说十五部，开创了中国当代文学新领域，广受读者欢迎，至今已蔚为全世界华人的共同语言，并兴起海内外金学研究风气。其《金庸作品集》已出版中文简体、繁体版，并有英、法、意大利、希腊、日、韩、泰、越、印尼等多种译文。","head":"http://jyts-public-oss.longruncloud.com/images/authors/b4d32d651aa2fac799c3786392c3c408a5a2fb9ab42a06c1ed8a82e6f65033e3.jpg"},"recorder":{"id":5,"title":"演播","name":"吕磊","description":"山东省胶州电视台主持人，国家一级播音员，从业二十年。\r\n\r\n播音名：小黑驴，录制过多部优秀的有声作品《一枚袁大头》、《竞聘演讲轻松过关》、《领导的真功夫》、《好饭局是设计出来的》\r\n\r\n荣获全国市级电视台\u201c60年60人\u201d荣誉称号。\r\n","head":"http://jyts-public-oss.longruncloud.com/images/recorders/73303227bdf940a597eb489173bc97a3e048e5422ce809bbab1dec9db1825a5c.jpg"},"is_bundle":true,"status_code":0,"status":"完结","section_pages":0}},{"book":{"id":21,"title":"白马啸西风","description":"中原少女身负血海深仇藏身塞外近十载。由内而外的善良和难以捉摸的内心，为她带来了一切也夺走了一切。眼睁睁看着心爱之人逐个离去，无能为力的她该何去何从？","thumbnail":"http://jyts-public-oss.longruncloud.com/images/1f80e13e872087602582fffbf6d16e3909e2176c3b0e7ad24c6dfa4c8cca9d30.jpg?x-oss-process=image/resize,w_256,h_256","cover":"http://jyts-public-oss.longruncloud.com/images/1f80e13e872087602582fffbf6d16e3909e2176c3b0e7ad24c6dfa4c8cca9d30.jpg","author":{"id":1,"title":"作者","name":"金庸","description":"金庸，本名查良镛，浙江海宁人，一九二四年生。曾任报社记者、翻译、编辑，电影公司编剧、导演等。一九五九年在香港创办明报机构，出版报纸、杂志及书籍，1955年以金庸为笔名在香港《新晚报》副刊连载武侠小说《书剑恩仇录》。由此开始，先后创作武侠小说十五部，开创了中国当代文学新领域，广受读者欢迎，至今已蔚为全世界华人的共同语言，并兴起海内外金学研究风气。其《金庸作品集》已出版中文简体、繁体版，并有英、法、意大利、希腊、日、韩、泰、越、印尼等多种译文。","head":"http://jyts-public-oss.longruncloud.com/images/authors/b4d32d651aa2fac799c3786392c3c408a5a2fb9ab42a06c1ed8a82e6f65033e3.jpg"},"recorder":{"id":1,"title":"演播","name":"李宛思","description":"人民教师。\r\n\r\n以\u201c荷衣\u201d为播音名，录制过多部优秀的有声作品《职场中的心理操纵术》、《找个有缺点的人结婚》等。\r\n\r\n发布过多部优秀广播剧，并担任主要角色，如：《华胥引之十三月》 、《迷侠记》 《陈先生和程太太》等。\r\n","head":"http://jyts-public-oss.longruncloud.com/images/recorders/7c5997d8a1818fccec440251c65820bb90df29cce792fd385804aa20c481a974.jpg"},"is_bundle":false,"status_code":0,"status":"完结","section_pages":2}},{"book":{"id":22,"title":"鹿鼎记","description":"反英雄、反传统、反束缚，金庸武侠的另类之作，小人物韦小宝的快意江湖。\r\n\r\n讲述了出身于妓院的少年韦小宝，凭一时之勇搭救了落难的江湖好汉茅十八，又阴差阳错地假冒小太监，成为少年康熙驾前红人；他既是天地会总舵主的关门弟子，被寄予反清复明重任；他又艳福齐天，娶得七个如花似玉的夫人；他不肯反清，只因当今皇上是好朋友小玄子；他不肯剿灭天地会，只因不愿坏了江湖义气；他不学无术，却是天下好运的小无赖；他建功无数，却懂得功成身退。","thumbnail":"http://jyts-public-oss.longruncloud.com/images/c2cad4cec9db44fd86ca8cbfbf934e22b465815037dcdb51733c6a7a21a0f71f.jpg?x-oss-process=image/resize,w_256,h_256","cover":"http://jyts-public-oss.longruncloud.com/images/c2cad4cec9db44fd86ca8cbfbf934e22b465815037dcdb51733c6a7a21a0f71f.jpg","author":{"id":1,"title":"作者","name":"金庸","description":"金庸，本名查良镛，浙江海宁人，一九二四年生。曾任报社记者、翻译、编辑，电影公司编剧、导演等。一九五九年在香港创办明报机构，出版报纸、杂志及书籍，1955年以金庸为笔名在香港《新晚报》副刊连载武侠小说《书剑恩仇录》。由此开始，先后创作武侠小说十五部，开创了中国当代文学新领域，广受读者欢迎，至今已蔚为全世界华人的共同语言，并兴起海内外金学研究风气。其《金庸作品集》已出版中文简体、繁体版，并有英、法、意大利、希腊、日、韩、泰、越、印尼等多种译文。","head":"http://jyts-public-oss.longruncloud.com/images/authors/b4d32d651aa2fac799c3786392c3c408a5a2fb9ab42a06c1ed8a82e6f65033e3.jpg"},"recorder":{"id":8,"title":"演播","name":"王松龄","description":"一风之音  原名王松龄，风行天下配音组创始人，毕业于浙江传媒学院，长期从事中英文配音工作。声音风格多变，中英文广告，专题，影视动画均有涉猎，擅长明星模仿配音，独自一人模仿周星驰，葛优，范伟，曾志伟，王宝强，孙悟空，海绵宝宝，熊大熊二，灰太狼等48位明星和动画片角色声音。曾播讲《福尔摩斯探案集》《怪事集》《笑傲江湖》《鹿鼎记》等有声小说，其播讲风格独树一帜，一人独自演绎数十个角色，惟妙惟肖，引人入胜。因钟爱TVB风格配音，其声音具有独特洋气时尚气质。曾参与《摩尔庄园》《寻找太阳》《海岛总动员》《项羽》等动画片配音。与深圳卫视年代秀，湖南卫视百变大咖秀，河南卫视成语英雄，中国教育频道爱上APP，全国众多广播电台广播购物频道等保持长期合作关系。多次受邀东方卫视，河北卫视，河南卫视访谈和演出。\r\n","head":"http://jyts-public-oss.longruncloud.com/images/recorders/31a188752b86d9055e3bcde177176097265bbbe16b433362ebf4d06de9a4b2a1.jpg"},"is_bundle":true,"status_code":0,"status":"完结","section_pages":0}},{"book":{"id":28,"title":"笑傲江湖","description":"名门正派的华山派大弟子令狐冲只因心性自由、不受羁勒，喜欢结交左道人士，被逐出师门，遭到正宗门派武林人士的唾弃而流落江湖。令狐冲依然率性而为，只因正义良知自在心中。后来他认识了魔教圣姑任盈盈，两个不喜权势、向往自由的年轻人几经生死患难，笑傲江湖，终成知心情侣。","thumbnail":"http://jyts-public-oss.longruncloud.com/images/d3e26bb82dee234d13e37ff446519dd3abc1bfc0209834adec4a4bbb8a77bf03.jpg?x-oss-process=image/resize,w_256,h_256","cover":"http://jyts-public-oss.longruncloud.com/images/d3e26bb82dee234d13e37ff446519dd3abc1bfc0209834adec4a4bbb8a77bf03.jpg","author":{"id":1,"title":"作者","name":"金庸","description":"金庸，本名查良镛，浙江海宁人，一九二四年生。曾任报社记者、翻译、编辑，电影公司编剧、导演等。一九五九年在香港创办明报机构，出版报纸、杂志及书籍，1955年以金庸为笔名在香港《新晚报》副刊连载武侠小说《书剑恩仇录》。由此开始，先后创作武侠小说十五部，开创了中国当代文学新领域，广受读者欢迎，至今已蔚为全世界华人的共同语言，并兴起海内外金学研究风气。其《金庸作品集》已出版中文简体、繁体版，并有英、法、意大利、希腊、日、韩、泰、越、印尼等多种译文。","head":"http://jyts-public-oss.longruncloud.com/images/authors/b4d32d651aa2fac799c3786392c3c408a5a2fb9ab42a06c1ed8a82e6f65033e3.jpg"},"recorder":{"id":8,"title":"演播","name":"王松龄","description":"一风之音  原名王松龄，风行天下配音组创始人，毕业于浙江传媒学院，长期从事中英文配音工作。声音风格多变，中英文广告，专题，影视动画均有涉猎，擅长明星模仿配音，独自一人模仿周星驰，葛优，范伟，曾志伟，王宝强，孙悟空，海绵宝宝，熊大熊二，灰太狼等48位明星和动画片角色声音。曾播讲《福尔摩斯探案集》《怪事集》《笑傲江湖》《鹿鼎记》等有声小说，其播讲风格独树一帜，一人独自演绎数十个角色，惟妙惟肖，引人入胜。因钟爱TVB风格配音，其声音具有独特洋气时尚气质。曾参与《摩尔庄园》《寻找太阳》《海岛总动员》《项羽》等动画片配音。与深圳卫视年代秀，湖南卫视百变大咖秀，河南卫视成语英雄，中国教育频道爱上APP，全国众多广播电台广播购物频道等保持长期合作关系。多次受邀东方卫视，河北卫视，河南卫视访谈和演出。\r\n","head":"http://jyts-public-oss.longruncloud.com/images/recorders/31a188752b86d9055e3bcde177176097265bbbe16b433362ebf4d06de9a4b2a1.jpg"},"is_bundle":true,"status_code":0,"status":"完结","section_pages":0}},{"book":{"id":33,"title":"书剑恩仇录","description":"清朝中叶天下初定，民间反清复明势力却此起彼伏。一位是反清首领，一位是清朝皇帝，中间隐藏着什么不可告人的惊天秘密？金庸武侠力作，一段故老相传的武林旧事。","thumbnail":"http://jyts-public-oss.longruncloud.com/images/bed73b7338ab43e50bb4d4370ad25300a6239773ba5dc48c7e1e0f8ec2cec3f1.jpg?x-oss-process=image/resize,w_256,h_256","cover":"http://jyts-public-oss.longruncloud.com/images/bed73b7338ab43e50bb4d4370ad25300a6239773ba5dc48c7e1e0f8ec2cec3f1.jpg","author":{"id":1,"title":"作者","name":"金庸","description":"金庸，本名查良镛，浙江海宁人，一九二四年生。曾任报社记者、翻译、编辑，电影公司编剧、导演等。一九五九年在香港创办明报机构，出版报纸、杂志及书籍，1955年以金庸为笔名在香港《新晚报》副刊连载武侠小说《书剑恩仇录》。由此开始，先后创作武侠小说十五部，开创了中国当代文学新领域，广受读者欢迎，至今已蔚为全世界华人的共同语言，并兴起海内外金学研究风气。其《金庸作品集》已出版中文简体、繁体版，并有英、法、意大利、希腊、日、韩、泰、越、印尼等多种译文。","head":"http://jyts-public-oss.longruncloud.com/images/authors/b4d32d651aa2fac799c3786392c3c408a5a2fb9ab42a06c1ed8a82e6f65033e3.jpg"},"recorder":{"id":6,"title":"演播","name":"张涛","description":"从事汉语有声播音工作30多年，主任播音员职称。\r\n\r\n荣获中国首届金话筒铜奖\r\n\r\n河南省五个一工程奖\r\n\r\n河南省首届十佳电视节目主持人\r\n\r\n河南省好播音员\r\n\r\n《四小时紧急援助农民工》获河南省好新闻一等奖\r\n\r\n专题片《走进武警》获河南省文艺牡丹奖二等奖\r\n\r\n纪录片《对历史负责》获河南省好新闻三等奖\r\n\r\n        代表作：《宰执天下》、《郁达夫小说》、《四大名捕》、《名剑风流》等多部汉语有声小说。\r\n","head":"http://jyts-public-oss.longruncloud.com/images/recorders/3f68a6c191e38696484907a4425ec944b9ff1748eb2e3523e41168f3ed161a45.jpg"},"is_bundle":true,"status_code":0,"status":"完结","section_pages":0}},{"book":{"id":36,"title":"神雕侠侣","description":"父母早亡的乖张少年杨过，有幸拜入古墓派小龙女门下，二人日久生情，倾心相爱，却不为礼法所容。经历十六年聚散离别之苦，痴心爱侣能否修成正果？","thumbnail":"http://jyts-public-oss.longruncloud.com/images/f6f2affec4c8ac92c2c899c9eddf39db346dd69770955c0d7213b14e176bf894.jpg?x-oss-process=image/resize,w_256,h_256","cover":"http://jyts-public-oss.longruncloud.com/images/f6f2affec4c8ac92c2c899c9eddf39db346dd69770955c0d7213b14e176bf894.jpg","author":{"id":1,"title":"作者","name":"金庸","description":"金庸，本名查良镛，浙江海宁人，一九二四年生。曾任报社记者、翻译、编辑，电影公司编剧、导演等。一九五九年在香港创办明报机构，出版报纸、杂志及书籍，1955年以金庸为笔名在香港《新晚报》副刊连载武侠小说《书剑恩仇录》。由此开始，先后创作武侠小说十五部，开创了中国当代文学新领域，广受读者欢迎，至今已蔚为全世界华人的共同语言，并兴起海内外金学研究风气。其《金庸作品集》已出版中文简体、繁体版，并有英、法、意大利、希腊、日、韩、泰、越、印尼等多种译文。","head":"http://jyts-public-oss.longruncloud.com/images/authors/b4d32d651aa2fac799c3786392c3c408a5a2fb9ab42a06c1ed8a82e6f65033e3.jpg"},"recorder":{"id":1,"title":"演播","name":"李宛思","description":"人民教师。\r\n\r\n以\u201c荷衣\u201d为播音名，录制过多部优秀的有声作品《职场中的心理操纵术》、《找个有缺点的人结婚》等。\r\n\r\n发布过多部优秀广播剧，并担任主要角色，如：《华胥引之十三月》 、《迷侠记》 《陈先生和程太太》等。\r\n","head":"http://jyts-public-oss.longruncloud.com/images/recorders/7c5997d8a1818fccec440251c65820bb90df29cce792fd385804aa20c481a974.jpg"},"is_bundle":true,"status_code":0,"status":"完结","section_pages":0}},{"book":{"id":41,"title":"侠客行","description":"一个奇妙的寓言世界，情节离奇，出人意表。几十年来江湖上弥漫着一股恐怖气氛，一切皆由神秘的赏善罚恶令而起。小乞丐机缘巧合下，揭开侠客岛的传说。","thumbnail":"http://jyts-public-oss.longruncloud.com/images/91719da17f228a57560483364d02742634f7453754caa6b4f3028376204ffd0d.jpg?x-oss-process=image/resize,w_256,h_256","cover":"http://jyts-public-oss.longruncloud.com/images/91719da17f228a57560483364d02742634f7453754caa6b4f3028376204ffd0d.jpg","author":{"id":1,"title":"作者","name":"金庸","description":"金庸，本名查良镛，浙江海宁人，一九二四年生。曾任报社记者、翻译、编辑，电影公司编剧、导演等。一九五九年在香港创办明报机构，出版报纸、杂志及书籍，1955年以金庸为笔名在香港《新晚报》副刊连载武侠小说《书剑恩仇录》。由此开始，先后创作武侠小说十五部，开创了中国当代文学新领域，广受读者欢迎，至今已蔚为全世界华人的共同语言，并兴起海内外金学研究风气。其《金庸作品集》已出版中文简体、繁体版，并有英、法、意大利、希腊、日、韩、泰、越、印尼等多种译文。","head":"http://jyts-public-oss.longruncloud.com/images/authors/b4d32d651aa2fac799c3786392c3c408a5a2fb9ab42a06c1ed8a82e6f65033e3.jpg"},"recorder":{"id":9,"title":"演播","name":"老朱","description":"国家一级播音员，从事播音工作近二十年。\r\n\r\n先后录制各类纪录片、广播剧、评书等有声作品5000余小时。代表作品有长篇广播《中华五千年》、《福尔摩斯探案集》等。\r\n","head":"http://jyts-public-oss.longruncloud.com/images/recorders/9319bb8c22472b8bf74b9d754babc4e1ed2f2b1bb6799990f38b4c89aa42fce6.jpg"},"is_bundle":true,"status_code":0,"status":"完结","section_pages":0}},{"book":{"id":44,"title":"倚天屠龙记","description":"\u201c射雕三部曲\u201d完结篇。江湖传言：武林至尊，宝刀屠龙，号令天下，莫敢不从。百年来引发江湖人士对屠龙刀的竞相争夺。元朝末年天下烽烟四起，屠龙刀重现江湖，又会引起怎样的波澜？","thumbnail":"http://jyts-public-oss.longruncloud.com/images/dd9c1cb670b83ba6aeef5fde47a7722fea5e59f89dc40c98ece63390d89b5fad.jpg?x-oss-process=image/resize,w_256,h_256","cover":"http://jyts-public-oss.longruncloud.com/images/dd9c1cb670b83ba6aeef5fde47a7722fea5e59f89dc40c98ece63390d89b5fad.jpg","author":{"id":1,"title":"作者","name":"金庸","description":"金庸，本名查良镛，浙江海宁人，一九二四年生。曾任报社记者、翻译、编辑，电影公司编剧、导演等。一九五九年在香港创办明报机构，出版报纸、杂志及书籍，1955年以金庸为笔名在香港《新晚报》副刊连载武侠小说《书剑恩仇录》。由此开始，先后创作武侠小说十五部，开创了中国当代文学新领域，广受读者欢迎，至今已蔚为全世界华人的共同语言，并兴起海内外金学研究风气。其《金庸作品集》已出版中文简体、繁体版，并有英、法、意大利、希腊、日、韩、泰、越、印尼等多种译文。","head":"http://jyts-public-oss.longruncloud.com/images/authors/b4d32d651aa2fac799c3786392c3c408a5a2fb9ab42a06c1ed8a82e6f65033e3.jpg"},"recorder":{"id":2,"title":"演播","name":"陈强","description":"东北某电台著名主持人。\r\n\r\n接触有声小说已逾4个年头，以艺名\u201c明晨\u201d录制了大量的有声文学作品。\r\n\r\n代表作：《权力野兽朱元璋》、《无尽武装》、《星河大帝》等，作品以生动、大气引人入胜，深受听友喜爱。\r\n","head":"http://jyts-public-oss.longruncloud.com/images/recorders/1cb6191a8ba9ae0713cd53a74f978802ba1dfd9f3d6a7aaff0bbae5f3b3d2636.jpg"},"is_bundle":true,"status_code":0,"status":"完结","section_pages":0}},{"book":{"id":49,"title":"碧血剑","description":"当忠臣义士爱上仇家女，当私人恩怨碰上家仇国恨，一心为民请命，死而后已，却鸟尽弓藏，兔死狗烹，你是袁承志，又会何去何从？","thumbnail":"http://jyts-public-oss.longruncloud.com/images/e0508956288b55e12b4b0e7cd2297f2a59e978fcedfcfbec37d348efeea6d44a.jpg?x-oss-process=image/resize,w_256,h_256","cover":"http://jyts-public-oss.longruncloud.com/images/e0508956288b55e12b4b0e7cd2297f2a59e978fcedfcfbec37d348efeea6d44a.jpg","author":{"id":1,"title":"作者","name":"金庸","description":"金庸，本名查良镛，浙江海宁人，一九二四年生。曾任报社记者、翻译、编辑，电影公司编剧、导演等。一九五九年在香港创办明报机构，出版报纸、杂志及书籍，1955年以金庸为笔名在香港《新晚报》副刊连载武侠小说《书剑恩仇录》。由此开始，先后创作武侠小说十五部，开创了中国当代文学新领域，广受读者欢迎，至今已蔚为全世界华人的共同语言，并兴起海内外金学研究风气。其《金庸作品集》已出版中文简体、繁体版，并有英、法、意大利、希腊、日、韩、泰、越、印尼等多种译文。","head":"http://jyts-public-oss.longruncloud.com/images/authors/b4d32d651aa2fac799c3786392c3c408a5a2fb9ab42a06c1ed8a82e6f65033e3.jpg"},"recorder":{"id":2,"title":"演播","name":"陈强","description":"东北某电台著名主持人。\r\n\r\n接触有声小说已逾4个年头，以艺名\u201c明晨\u201d录制了大量的有声文学作品。\r\n\r\n代表作：《权力野兽朱元璋》、《无尽武装》、《星河大帝》等，作品以生动、大气引人入胜，深受听友喜爱。\r\n","head":"http://jyts-public-oss.longruncloud.com/images/recorders/1cb6191a8ba9ae0713cd53a74f978802ba1dfd9f3d6a7aaff0bbae5f3b3d2636.jpg"},"is_bundle":true,"status_code":0,"status":"完结","section_pages":0}},{"book":{"id":52,"title":"鸳鸯刀","description":"鸳鸯宝刀重现江湖，重燃一场朝廷江湖恩怨纷争。萍水相逢成命中注定，夫妻刀法成就无敌美名。究竟这鸳鸯刀中暗藏什么玄机？","thumbnail":"http://jyts-public-oss.longruncloud.com/images/147071d8bbc1471c88741dab168b1c69cfe33bc93d18bf611dcc3f5048c2136b.jpg?x-oss-process=image/resize,w_256,h_256","cover":"http://jyts-public-oss.longruncloud.com/images/147071d8bbc1471c88741dab168b1c69cfe33bc93d18bf611dcc3f5048c2136b.jpg","author":{"id":1,"title":"作者","name":"金庸","description":"金庸，本名查良镛，浙江海宁人，一九二四年生。曾任报社记者、翻译、编辑，电影公司编剧、导演等。一九五九年在香港创办明报机构，出版报纸、杂志及书籍，1955年以金庸为笔名在香港《新晚报》副刊连载武侠小说《书剑恩仇录》。由此开始，先后创作武侠小说十五部，开创了中国当代文学新领域，广受读者欢迎，至今已蔚为全世界华人的共同语言，并兴起海内外金学研究风气。其《金庸作品集》已出版中文简体、繁体版，并有英、法、意大利、希腊、日、韩、泰、越、印尼等多种译文。","head":"http://jyts-public-oss.longruncloud.com/images/authors/b4d32d651aa2fac799c3786392c3c408a5a2fb9ab42a06c1ed8a82e6f65033e3.jpg"},"recorder":{"id":10,"title":"演播","name":"郑昆宇","description":"从事音频后期制作工作。\r\n\r\n录制过多部优秀有声书作品：《盗墓迷局》、《老千迷雾》、刘慈欣《地球大炮》、《全频段阻塞干扰》等。\r\n","head":"http://jyts-public-oss.longruncloud.com/images/recorders/49b1aad093a291d937f955749f5f19392b6aef084e5ab12e599cfb238443ebc6.jpg"},"is_bundle":false,"status_code":0,"status":"完结","section_pages":1}},{"book":{"id":53,"title":"越女剑","description":"卧薪尝胆，勾践灭吴，眼看九计已成八计，谁料难过兵器大关。当一国命运竟掌握在区区牧羊女手中，看百姓如何救国于水火。金庸演绎千年传说，谁说小人物难当重任。","thumbnail":"http://jyts-public-oss.longruncloud.com/images/c871ce4d729792f97e048cb16b54fb452ab67ab58ba9b835356752c03b4313aa.jpg?x-oss-process=image/resize,w_256,h_256","cover":"http://jyts-public-oss.longruncloud.com/images/c871ce4d729792f97e048cb16b54fb452ab67ab58ba9b835356752c03b4313aa.jpg","author":{"id":1,"title":"作者","name":"金庸","description":"金庸，本名查良镛，浙江海宁人，一九二四年生。曾任报社记者、翻译、编辑，电影公司编剧、导演等。一九五九年在香港创办明报机构，出版报纸、杂志及书籍，1955年以金庸为笔名在香港《新晚报》副刊连载武侠小说《书剑恩仇录》。由此开始，先后创作武侠小说十五部，开创了中国当代文学新领域，广受读者欢迎，至今已蔚为全世界华人的共同语言，并兴起海内外金学研究风气。其《金庸作品集》已出版中文简体、繁体版，并有英、法、意大利、希腊、日、韩、泰、越、印尼等多种译文。","head":"http://jyts-public-oss.longruncloud.com/images/authors/b4d32d651aa2fac799c3786392c3c408a5a2fb9ab42a06c1ed8a82e6f65033e3.jpg"},"recorder":{"id":10,"title":"演播","name":"郑昆宇","description":"从事音频后期制作工作。\r\n\r\n录制过多部优秀有声书作品：《盗墓迷局》、《老千迷雾》、刘慈欣《地球大炮》、《全频段阻塞干扰》等。\r\n","head":"http://jyts-public-oss.longruncloud.com/images/recorders/49b1aad093a291d937f955749f5f19392b6aef084e5ab12e599cfb238443ebc6.jpg"},"is_bundle":false,"status_code":0,"status":"完结","section_pages":1}},{"book":{"id":60,"title":"雪山飞狐（广播剧）","description":"本是情同手足，何以反目成仇，累世恩怨，其中藏着多少秘密？宿敌相逢，却是惺惺相惜，几百年来的血债仇怨，谁人能解，何日能解！？广播剧版《雪山飞狐》，用声音上演一场江湖儿女的爱恨情仇，定有不一样的精彩。","thumbnail":"http://jyts-public-oss.longruncloud.com/images/90f5b722f89abf5798f3b84c75f9a3991107342151de623cfd2080a7dd36414a.jpg?x-oss-process=image/resize,w_256,h_256","cover":"http://jyts-public-oss.longruncloud.com/images/90f5b722f89abf5798f3b84c75f9a3991107342151de623cfd2080a7dd36414a.jpg","author":{"id":1,"title":"作者","name":"金庸","description":"金庸，本名查良镛，浙江海宁人，一九二四年生。曾任报社记者、翻译、编辑，电影公司编剧、导演等。一九五九年在香港创办明报机构，出版报纸、杂志及书籍，1955年以金庸为笔名在香港《新晚报》副刊连载武侠小说《书剑恩仇录》。由此开始，先后创作武侠小说十五部，开创了中国当代文学新领域，广受读者欢迎，至今已蔚为全世界华人的共同语言，并兴起海内外金学研究风气。其《金庸作品集》已出版中文简体、繁体版，并有英、法、意大利、希腊、日、韩、泰、越、印尼等多种译文。","head":"http://jyts-public-oss.longruncloud.com/images/authors/b4d32d651aa2fac799c3786392c3c408a5a2fb9ab42a06c1ed8a82e6f65033e3.jpg"},"recorder":{"id":17,"title":"演播","name":"声优百代","description":"无","head":"http://jyts-public-oss.longruncloud.com/images/recorders/72eb3ae18e0da511d001a06ad8126265ccedafff36e14e8a45e00a57a01005f7.jpg"},"is_bundle":false,"status_code":0,"status":"完结","section_pages":3}},{"book":{"id":453,"title":"射雕英雄传（粤语版）","description":"平凡人逆袭成一代大侠的故事，有绝世武功，有美人相伴，傻郭靖，俏黄蓉成就一段武林佳话。《射雕英雄传》，无数粤港人心中的英雄梦。","thumbnail":"http://jyts-public-oss.longruncloud.com/images/27f2da37b5afd7593bd665c830fd31700f6e24f4ef577733d848742f72a5ac85.jpg?x-oss-process=image/resize,w_256,h_256","cover":"http://jyts-public-oss.longruncloud.com/images/27f2da37b5afd7593bd665c830fd31700f6e24f4ef577733d848742f72a5ac85.jpg","author":{"id":1,"title":"作者","name":"金庸","description":"金庸，本名查良镛，浙江海宁人，一九二四年生。曾任报社记者、翻译、编辑，电影公司编剧、导演等。一九五九年在香港创办明报机构，出版报纸、杂志及书籍，1955年以金庸为笔名在香港《新晚报》副刊连载武侠小说《书剑恩仇录》。由此开始，先后创作武侠小说十五部，开创了中国当代文学新领域，广受读者欢迎，至今已蔚为全世界华人的共同语言，并兴起海内外金学研究风气。其《金庸作品集》已出版中文简体、繁体版，并有英、法、意大利、希腊、日、韩、泰、越、印尼等多种译文。","head":"http://jyts-public-oss.longruncloud.com/images/authors/b4d32d651aa2fac799c3786392c3c408a5a2fb9ab42a06c1ed8a82e6f65033e3.jpg"},"recorder":{"id":26,"title":"演播","name":"梁皓明","description":"五年新闻播音员、一年新闻编辑、四年新闻节目主持、两年娱乐节目主持。从2006年开始录制了八部纪实小说：《李真秘密档案》、《伊拉克火线淘金记》、《霍英东全传》、《追杀汪精卫》、《我的侦探路》、《周星驰外传》、《玄奘西游记》、《驻京办主任》，新锐粤语说书人。","head":"http://jyts-public-oss.longruncloud.com/images/recorders/02a7c7e039d8241c70ffd9cb445c0556f033801de616b556786ef5f0e67ec5ab.jpg"},"is_bundle":true,"status_code":0,"status":"完结","section_pages":0}},{"book":{"id":457,"title":"神雕侠侣（粤语版）","description":"父母早亡的乖张少年杨过，有幸拜入古墓派小龙女门下，二人日久生情，倾心相爱，却不为礼法所容。经历十六年聚散离别之苦，痴心爱侣能否修成正果？","thumbnail":"http://jyts-public-oss.longruncloud.com/images/0510c8a87c4bbdc357d2815b07d3b9245c179e326514658ad66eb3ebc2d3fa48.jpg?x-oss-process=image/resize,w_256,h_256","cover":"http://jyts-public-oss.longruncloud.com/images/0510c8a87c4bbdc357d2815b07d3b9245c179e326514658ad66eb3ebc2d3fa48.jpg","author":{"id":1,"title":"作者","name":"金庸","description":"金庸，本名查良镛，浙江海宁人，一九二四年生。曾任报社记者、翻译、编辑，电影公司编剧、导演等。一九五九年在香港创办明报机构，出版报纸、杂志及书籍，1955年以金庸为笔名在香港《新晚报》副刊连载武侠小说《书剑恩仇录》。由此开始，先后创作武侠小说十五部，开创了中国当代文学新领域，广受读者欢迎，至今已蔚为全世界华人的共同语言，并兴起海内外金学研究风气。其《金庸作品集》已出版中文简体、繁体版，并有英、法、意大利、希腊、日、韩、泰、越、印尼等多种译文。","head":"http://jyts-public-oss.longruncloud.com/images/authors/b4d32d651aa2fac799c3786392c3c408a5a2fb9ab42a06c1ed8a82e6f65033e3.jpg"},"recorder":{"id":26,"title":"演播","name":"梁皓明","description":"五年新闻播音员、一年新闻编辑、四年新闻节目主持、两年娱乐节目主持。从2006年开始录制了八部纪实小说：《李真秘密档案》、《伊拉克火线淘金记》、《霍英东全传》、《追杀汪精卫》、《我的侦探路》、《周星驰外传》、《玄奘西游记》、《驻京办主任》，新锐粤语说书人。","head":"http://jyts-public-oss.longruncloud.com/images/recorders/02a7c7e039d8241c70ffd9cb445c0556f033801de616b556786ef5f0e67ec5ab.jpg"},"is_bundle":true,"status_code":0,"status":"完结","section_pages":0}},{"book":{"id":390,"title":"射雕英雄传（陕西话版）","description":"陕西话亲和而不失力量，陕西方言打造新《射雕英雄传》，给你一个不一样的英雄梦。","thumbnail":"http://jyts-public-oss.longruncloud.com/images/a05cfc9f389d27197952e3410850114a21aedac2d385b19322975320df5267cc.jpg?x-oss-process=image/resize,w_256,h_256","cover":"http://jyts-public-oss.longruncloud.com/images/a05cfc9f389d27197952e3410850114a21aedac2d385b19322975320df5267cc.jpg","author":{"id":1,"title":"作者","name":"金庸","description":"金庸，本名查良镛，浙江海宁人，一九二四年生。曾任报社记者、翻译、编辑，电影公司编剧、导演等。一九五九年在香港创办明报机构，出版报纸、杂志及书籍，1955年以金庸为笔名在香港《新晚报》副刊连载武侠小说《书剑恩仇录》。由此开始，先后创作武侠小说十五部，开创了中国当代文学新领域，广受读者欢迎，至今已蔚为全世界华人的共同语言，并兴起海内外金学研究风气。其《金庸作品集》已出版中文简体、繁体版，并有英、法、意大利、希腊、日、韩、泰、越、印尼等多种译文。","head":"http://jyts-public-oss.longruncloud.com/images/authors/b4d32d651aa2fac799c3786392c3c408a5a2fb9ab42a06c1ed8a82e6f65033e3.jpg"},"recorder":{"id":39,"title":"演播","name":"满园","description":"满园，部分作品《三生三世艳莲杀》《莲上仙》《埃及丽影》《中年危机》《儒人的栈道》《日本明治维新》《月若有情月长圆 最痴不过张爱玲》《无敌睡神朱启乐》《怪老头儿》。","head":"http://jyts-public-oss.longruncloud.com/images/recorders/916844a303022236a7d2e4e428cea1ad039ec9cc0afa832f0796ac9f07de37a3.jpg"},"is_bundle":false,"status_code":1,"status":"连载","section_pages":1}},{"book":{"id":391,"title":"射雕英雄传（山东话版）","description":"谁听谁乐呵，《射雕英雄传》山东话版，给你一个不一样的英雄梦！","thumbnail":"http://jyts-public-oss.longruncloud.com/images/732837ec7cdf2db7f42842eb58ff71963a889e07c2c031f9f74d9750cc6631b2.jpg?x-oss-process=image/resize,w_256,h_256","cover":"http://jyts-public-oss.longruncloud.com/images/732837ec7cdf2db7f42842eb58ff71963a889e07c2c031f9f74d9750cc6631b2.jpg","author":{"id":1,"title":"作者","name":"金庸","description":"金庸，本名查良镛，浙江海宁人，一九二四年生。曾任报社记者、翻译、编辑，电影公司编剧、导演等。一九五九年在香港创办明报机构，出版报纸、杂志及书籍，1955年以金庸为笔名在香港《新晚报》副刊连载武侠小说《书剑恩仇录》。由此开始，先后创作武侠小说十五部，开创了中国当代文学新领域，广受读者欢迎，至今已蔚为全世界华人的共同语言，并兴起海内外金学研究风气。其《金庸作品集》已出版中文简体、繁体版，并有英、法、意大利、希腊、日、韩、泰、越、印尼等多种译文。","head":"http://jyts-public-oss.longruncloud.com/images/authors/b4d32d651aa2fac799c3786392c3c408a5a2fb9ab42a06c1ed8a82e6f65033e3.jpg"},"recorder":{"id":18,"title":"演播","name":"孟东儒","description":"孟东儒，播音名：韦一笑。1987年圣诞节出生在一个艺术世家。父亲是一名民族歌手，从小秉承父亲的艺术细胞，虽然在音乐上没有突出的造诣，但在语言上却有过人的天赋。6岁时开始热爱相声艺术，8岁登台演出，16岁跟随老相声艺人学习相声并常年活跃在舞台上，擅长柳活儿（即学唱）、模仿等。2014年开始接触有声小说，一出道就为多家公司录制了数十万字的有声作品并获得一致认可。2015年跟随著名有声小说播讲员巴胡子学习有声小说播讲，并与同年正式拜入巴胡子门下为徒。\r\n播音风格诙谐幽默、轻松明快，善于刻画人物、剖析人物性格，大处气势磅礴，小处细致入微。立志将单口相声的包袱融入有声小说中，独树一帜，开拓创新，打造一个全新的播音风格。","head":"http://jyts-public-oss.longruncloud.com/images/recorders/5a3a03fa6464bb0ea16d68e2580d03f6e8778c908a67c3497d2fe81eae983404.jpg"},"is_bundle":false,"status_code":1,"status":"连载","section_pages":1}},{"book":{"id":392,"title":"射雕英雄传（东北话版）","description":"浓厚的黑土地气息，东北话版《射雕英雄传》，给你不一样的英雄梦！","thumbnail":"http://jyts-public-oss.longruncloud.com/images/ba5f87678ce45bea4be3a797a31167a49b87b1a3a6dd97be8625008a3ba76115.jpg?x-oss-process=image/resize,w_256,h_256","cover":"http://jyts-public-oss.longruncloud.com/images/ba5f87678ce45bea4be3a797a31167a49b87b1a3a6dd97be8625008a3ba76115.jpg","author":{"id":1,"title":"作者","name":"金庸","description":"金庸，本名查良镛，浙江海宁人，一九二四年生。曾任报社记者、翻译、编辑，电影公司编剧、导演等。一九五九年在香港创办明报机构，出版报纸、杂志及书籍，1955年以金庸为笔名在香港《新晚报》副刊连载武侠小说《书剑恩仇录》。由此开始，先后创作武侠小说十五部，开创了中国当代文学新领域，广受读者欢迎，至今已蔚为全世界华人的共同语言，并兴起海内外金学研究风气。其《金庸作品集》已出版中文简体、繁体版，并有英、法、意大利、希腊、日、韩、泰、越、印尼等多种译文。","head":"http://jyts-public-oss.longruncloud.com/images/authors/b4d32d651aa2fac799c3786392c3c408a5a2fb9ab42a06c1ed8a82e6f65033e3.jpg"},"recorder":{"id":40,"title":"演播","name":"蘑菇","description":"冯宪明(蘑菇)，居住于辽宁抚顺，与2010年5月拜抚顺相声名家刘家珂先生为师，曾在天津跟随多位相声名家学习，功底深厚，具备专业素养，曾为成都哈哈曲艺社逗哏演员，现经常在沈阳小茶馆演出，擅长传统相声的表演。\r\n","head":"http://jyts-public-oss.longruncloud.com/images/recorders/fa5ec1260ccb1d6ff12c91e751cbd916dbf0e55d54f7e20b32a3b2b64b79b0b3.jpg"},"is_bundle":false,"status_code":1,"status":"连载","section_pages":1}},{"book":{"id":771,"title":"射雕英雄传（长沙话版）","description":"地道湘味。《射雕英雄传》长沙话版，给你一个不一样的英雄梦！","thumbnail":"http://jyts-public-oss.longruncloud.com/images/d2ac62999a587dc125ed5600f896a146101899e507f6ecee90eaa72cbd139691.jpg?x-oss-process=image/resize,w_256,h_256","cover":"http://jyts-public-oss.longruncloud.com/images/d2ac62999a587dc125ed5600f896a146101899e507f6ecee90eaa72cbd139691.jpg","author":{"id":1,"title":"作者","name":"金庸","description":"金庸，本名查良镛，浙江海宁人，一九二四年生。曾任报社记者、翻译、编辑，电影公司编剧、导演等。一九五九年在香港创办明报机构，出版报纸、杂志及书籍，1955年以金庸为笔名在香港《新晚报》副刊连载武侠小说《书剑恩仇录》。由此开始，先后创作武侠小说十五部，开创了中国当代文学新领域，广受读者欢迎，至今已蔚为全世界华人的共同语言，并兴起海内外金学研究风气。其《金庸作品集》已出版中文简体、繁体版，并有英、法、意大利、希腊、日、韩、泰、越、印尼等多种译文。","head":"http://jyts-public-oss.longruncloud.com/images/authors/b4d32d651aa2fac799c3786392c3c408a5a2fb9ab42a06c1ed8a82e6f65033e3.jpg"},"recorder":{"id":255,"title":"演播","name":"赵天阳","description":"略","head":"http://jyts-public-oss.longruncloud.com/images/recorders/2d652469772c18cd876b3cdc90772dcc6a05baf7eb7e51518a2367e67e5e5cf7.png"},"is_bundle":false,"status_code":0,"status":"完结","section_pages":1}}]
         */

        private int id;
        private String type;
        private Object cover;
        private String name;
        private int count_of_books;
        private List<BooksBeanX> books;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Object getCover() {
            return cover;
        }

        public void setCover(Object cover) {
            this.cover = cover;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getCount_of_books() {
            return count_of_books;
        }

        public void setCount_of_books(int count_of_books) {
            this.count_of_books = count_of_books;
        }

        public List<BooksBeanX> getBooks() {
            return books;
        }

        public void setBooks(List<BooksBeanX> books) {
            this.books = books;
        }

        public static class BooksBeanX {
            /**
             * book : {"id":5,"title":"飞狐外传","description":"《雪山飞狐》番外篇，大侠胡斐的成长之路。江湖纷争夹杂着三角关系，又热闹又缠绵。无奈大侠终会长大，生死离别是成长的烙印。","thumbnail":"http://jyts-public-oss.longruncloud.com/images/4ab7e00c44f0060f35e7e3ae49ef3eecc481022adc41e330f63c39798c5a2959.jpg?x-oss-process=image/resize,w_256,h_256","cover":"http://jyts-public-oss.longruncloud.com/images/4ab7e00c44f0060f35e7e3ae49ef3eecc481022adc41e330f63c39798c5a2959.jpg","author":{"id":1,"title":"作者","name":"金庸","description":"金庸，本名查良镛，浙江海宁人，一九二四年生。曾任报社记者、翻译、编辑，电影公司编剧、导演等。一九五九年在香港创办明报机构，出版报纸、杂志及书籍，1955年以金庸为笔名在香港《新晚报》副刊连载武侠小说《书剑恩仇录》。由此开始，先后创作武侠小说十五部，开创了中国当代文学新领域，广受读者欢迎，至今已蔚为全世界华人的共同语言，并兴起海内外金学研究风气。其《金庸作品集》已出版中文简体、繁体版，并有英、法、意大利、希腊、日、韩、泰、越、印尼等多种译文。","head":"http://jyts-public-oss.longruncloud.com/images/authors/b4d32d651aa2fac799c3786392c3c408a5a2fb9ab42a06c1ed8a82e6f65033e3.jpg"},"recorder":{"id":3,"title":"演播","name":"袁志伟","description":"从事电台主持人工作至今，曾在多家地方和网络媒体工作，如：厦广音乐台 、北京一听音乐网 、扬州音乐广播等。\r\n\r\n接触有声小说多年，至今已经演播了长短篇小说30余部，如：《狱霸》《叱咤》《红嫁衣》《惊悚集系列》《鬼故事谜系列》《网游之盗版神话》《我一无是处的大学青春》等 。\r\n","head":"http://jyts-public-oss.longruncloud.com/images/recorders/3e799d989f168bf3dd95b2c94dce34266af30281185ec075462c8bdd8c23f736.jpg"},"is_bundle":true,"status_code":0,"status":"完结","section_pages":0}
             */

            private BookBeanXXXXX book;

            public BookBeanXXXXX getBook() {
                return book;
            }

            public void setBook(BookBeanXXXXX book) {
                this.book = book;
            }

            public static class BookBeanXXXXX {
                /**
                 * id : 5
                 * title : 飞狐外传
                 * description : 《雪山飞狐》番外篇，大侠胡斐的成长之路。江湖纷争夹杂着三角关系，又热闹又缠绵。无奈大侠终会长大，生死离别是成长的烙印。
                 * thumbnail : http://jyts-public-oss.longruncloud.com/images/4ab7e00c44f0060f35e7e3ae49ef3eecc481022adc41e330f63c39798c5a2959.jpg?x-oss-process=image/resize,w_256,h_256
                 * cover : http://jyts-public-oss.longruncloud.com/images/4ab7e00c44f0060f35e7e3ae49ef3eecc481022adc41e330f63c39798c5a2959.jpg
                 * author : {"id":1,"title":"作者","name":"金庸","description":"金庸，本名查良镛，浙江海宁人，一九二四年生。曾任报社记者、翻译、编辑，电影公司编剧、导演等。一九五九年在香港创办明报机构，出版报纸、杂志及书籍，1955年以金庸为笔名在香港《新晚报》副刊连载武侠小说《书剑恩仇录》。由此开始，先后创作武侠小说十五部，开创了中国当代文学新领域，广受读者欢迎，至今已蔚为全世界华人的共同语言，并兴起海内外金学研究风气。其《金庸作品集》已出版中文简体、繁体版，并有英、法、意大利、希腊、日、韩、泰、越、印尼等多种译文。","head":"http://jyts-public-oss.longruncloud.com/images/authors/b4d32d651aa2fac799c3786392c3c408a5a2fb9ab42a06c1ed8a82e6f65033e3.jpg"}
                 * recorder : {"id":3,"title":"演播","name":"袁志伟","description":"从事电台主持人工作至今，曾在多家地方和网络媒体工作，如：厦广音乐台 、北京一听音乐网 、扬州音乐广播等。\r\n\r\n接触有声小说多年，至今已经演播了长短篇小说30余部，如：《狱霸》《叱咤》《红嫁衣》《惊悚集系列》《鬼故事谜系列》《网游之盗版神话》《我一无是处的大学青春》等 。\r\n","head":"http://jyts-public-oss.longruncloud.com/images/recorders/3e799d989f168bf3dd95b2c94dce34266af30281185ec075462c8bdd8c23f736.jpg"}
                 * is_bundle : true
                 * status_code : 0
                 * status : 完结
                 * section_pages : 0
                 */

                private int id;
                private String title;
                private String description;
                private String thumbnail;
                private String cover;
                private AuthorBeanXXXXX author;
                private RecorderBeanXXXXXX recorder;
                private boolean is_bundle;
                private int status_code;
                private String status;
                private int section_pages;

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

                public String getThumbnail() {
                    return thumbnail;
                }

                public void setThumbnail(String thumbnail) {
                    this.thumbnail = thumbnail;
                }

                public String getCover() {
                    return cover;
                }

                public void setCover(String cover) {
                    this.cover = cover;
                }

                public AuthorBeanXXXXX getAuthor() {
                    return author;
                }

                public void setAuthor(AuthorBeanXXXXX author) {
                    this.author = author;
                }

                public RecorderBeanXXXXXX getRecorder() {
                    return recorder;
                }

                public void setRecorder(RecorderBeanXXXXXX recorder) {
                    this.recorder = recorder;
                }

                public boolean isIs_bundle() {
                    return is_bundle;
                }

                public void setIs_bundle(boolean is_bundle) {
                    this.is_bundle = is_bundle;
                }

                public int getStatus_code() {
                    return status_code;
                }

                public void setStatus_code(int status_code) {
                    this.status_code = status_code;
                }

                public String getStatus() {
                    return status;
                }

                public void setStatus(String status) {
                    this.status = status;
                }

                public int getSection_pages() {
                    return section_pages;
                }

                public void setSection_pages(int section_pages) {
                    this.section_pages = section_pages;
                }

                public static class AuthorBeanXXXXX {
                    /**
                     * id : 1
                     * title : 作者
                     * name : 金庸
                     * description : 金庸，本名查良镛，浙江海宁人，一九二四年生。曾任报社记者、翻译、编辑，电影公司编剧、导演等。一九五九年在香港创办明报机构，出版报纸、杂志及书籍，1955年以金庸为笔名在香港《新晚报》副刊连载武侠小说《书剑恩仇录》。由此开始，先后创作武侠小说十五部，开创了中国当代文学新领域，广受读者欢迎，至今已蔚为全世界华人的共同语言，并兴起海内外金学研究风气。其《金庸作品集》已出版中文简体、繁体版，并有英、法、意大利、希腊、日、韩、泰、越、印尼等多种译文。
                     * head : http://jyts-public-oss.longruncloud.com/images/authors/b4d32d651aa2fac799c3786392c3c408a5a2fb9ab42a06c1ed8a82e6f65033e3.jpg
                     */

                    private int id;
                    private String title;
                    private String name;
                    private String description;
                    private String head;

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

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getDescription() {
                        return description;
                    }

                    public void setDescription(String description) {
                        this.description = description;
                    }

                    public String getHead() {
                        return head;
                    }

                    public void setHead(String head) {
                        this.head = head;
                    }
                }

                public static class RecorderBeanXXXXXX {
                    /**
                     * id : 3
                     * title : 演播
                     * name : 袁志伟
                     * description : 从事电台主持人工作至今，曾在多家地方和网络媒体工作，如：厦广音乐台 、北京一听音乐网 、扬州音乐广播等。
                     * <p>
                     * 接触有声小说多年，至今已经演播了长短篇小说30余部，如：《狱霸》《叱咤》《红嫁衣》《惊悚集系列》《鬼故事谜系列》《网游之盗版神话》《我一无是处的大学青春》等 。
                     * <p>
                     * head : http://jyts-public-oss.longruncloud.com/images/recorders/3e799d989f168bf3dd95b2c94dce34266af30281185ec075462c8bdd8c23f736.jpg
                     */

                    private int id;
                    private String title;
                    private String name;
                    private String description;
                    private String head;

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

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getDescription() {
                        return description;
                    }

                    public void setDescription(String description) {
                        this.description = description;
                    }

                    public String getHead() {
                        return head;
                    }

                    public void setHead(String head) {
                        this.head = head;
                    }
                }
            }
        }
    }
}
