package com.example.m6.bean;

import com.example.m6.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "百搭初秋卫衣", "复古港风卫衣", "秋冬加绒卫衣", "日系小众卫衣", "韩版加绒卫衣", "连帽卫衣", "动漫二次元卫衣","大码卫衣"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "双11连帽卫衣女2020年新款宽松韩版百搭春秋薄款初秋季上衣潮insD",
            "复古港风2020冬季漫画少女卡通印花宽松加绒加厚连帽双11卫衣潮女",
            "漫画少女秋冬加绒加厚卡通印花2020复古港风套头连帽双11卫衣潮",
            "双十一秋冬季男友风炸街日系上衣设计感小众chic港风卫衣女潮ins",
            "双11卫衣女2020年秋冬季新款潮ins宽松韩版薄款小熊学生圆领上衣D",
            "连帽卫衣女2020年新款秋冬双11冬季秋季白色宽松韩版加绒加厚外套",
            "双十一11圆领套头卫衣女韩版动漫二次元学生宽松长袖T恤上衣ins潮",
            "女士橙色双11卫衣2020年新款宽松韩版大码秋冬ins潮加绒加厚连帽"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {188, 399, 290, 275, 198, 598,34,54};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.nklm_x, R.drawable.wbkl_x, R.drawable.bxzzy_x,
            R.drawable.nklm_x, R.drawable.mtgh_x, R.drawable.waxd_x,
            R.drawable.xxfn_x,R.drawable.cskl_x
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.nklm, R.drawable.wbkl, R.drawable.bxzzy,
            R.drawable.nklm, R.drawable.mtgh, R.drawable.waxd,
            R.drawable.xxfn,R.drawable.cskl
    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}
