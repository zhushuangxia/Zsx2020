package com.example.m7.bean;

import com.example.m7.R;

import java.util.ArrayList;

public class Planet {

    public int image;
    public String name;
    public String desc;

    public Planet(int image, String name, String desc) {
        this.image = image;
        this.name = name;
        this.desc = desc;
    }

    private static int[] iconArray = {R.drawable.nklm, R.drawable.wbkl, R.drawable.bxzzy,
            R.drawable.nklm, R.drawable.mtgh, R.drawable.waxd,
            R.drawable.xxfn,R.drawable.cskl};
    private static String[] nameArray = {  "百搭初秋卫衣", "复古港风卫衣", "秋冬加绒卫衣", "日系小众卫衣", "韩版加绒卫衣", "连帽卫衣", "动漫二次元卫衣","大码卫衣"};
    private static String[] descArray = {
            "双11连帽卫衣女2020年新款宽松韩版百搭春秋薄款初秋季上衣潮insD",
            "复古港风2020冬季漫画少女卡通印花宽松加绒加厚连帽双11卫衣潮女",
            "漫画少女秋冬加绒加厚卡通印花2020复古港风套头连帽双11卫衣潮",
            "双十一秋冬季男友风炸街日系上衣设计感小众chic港风卫衣女潮ins",
            "双11卫衣女2020年秋冬季新款潮ins宽松韩版薄款小熊学生圆领上衣D",
            "连帽卫衣女2020年新款秋冬双11冬季秋季白色宽松韩版加绒加厚外套",
            "双十一11圆领套头卫衣女韩版动漫二次元学生宽松长袖T恤上衣ins潮",
            "女士橙色双11卫衣2020年新款宽松韩版大码秋冬ins潮加绒加厚连帽"


    };

    public static ArrayList<Planet> getDefaultList() {
        ArrayList<Planet> planetList = new ArrayList<Planet>();
        for (int i = 0; i < iconArray.length; i++) {
            planetList.add(new Planet(iconArray[i], nameArray[i], descArray[i]));
        }
        return planetList;
    }
}
