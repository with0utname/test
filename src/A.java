import java.util.ArrayList;
import java.util.List;

//有赞晴川卡关系对应表

public class A {
    public static void main(String[] args) {
        String alias = new String("Y3nvgw8oxw0qr0");
        RelationBO youzanBO = RelationBO.getDisByAlias(alias);
        System.out.println(youzanBO.getName());
    }
    //有赞alias
    private String alias;
    //晴川卡类型
    private String qcType;
    //卡名称
    private String name;
    //折扣
    private double dis;
    //结束时间
    private String endDate;

    private  static List<RelationBO> relationBOList;

    static {
        //初始化卡
        relationBOList = new ArrayList<RelationBO>();



        //承让卡
        RelationBO relationBO1 = new RelationBO();
        relationBO1.setAlias("Y2ovd2stla88os");
        relationBO1.setDis(0.79);
        relationBO1.setEndDate(null);
        relationBO1.setQcType("31");
        relationBO1.setName("承让卡");

        //久仰卡
        RelationBO relationBO2 = new RelationBO();
        relationBO2.setAlias("Y3ne7q9ph1q73g");
        relationBO2.setDis(0.79);
        relationBO2.setEndDate(null);
        relationBO2.setQcType("32");
        relationBO2.setName("久仰卡");

        //基础积分卡
        RelationBO relationBO3 = new RelationBO();
        relationBO3.setAlias("Y3nvgw8oxw0qr0");
        relationBO3.setDis(1.0);
        relationBO3.setEndDate("2050-11-30");
        relationBO3.setQcType("15");
        relationBO3.setName("基础积分卡");

        //幸会12exp
        RelationBO relationBO4 = new RelationBO();
        relationBO4.setAlias("Y2g1jkp88dnlt8");
        relationBO4.setDis(0.95);
        relationBO4.setEndDate("2020-12-31");
        relationBO4.setQcType("30");
        relationBO4.setName("幸会12exp");

        //幸会06exp
        RelationBO relationBO5 = new RelationBO();
        relationBO5.setAlias("Y36bm7idqe1fmk");
        relationBO5.setDis(0.95);
        relationBO5.setEndDate("2020-06-30");
        relationBO5.setQcType("30");
        relationBO5.setName("幸会06exp");

        //幸会exp
        RelationBO relationBO6 = new RelationBO();
        relationBO6.setAlias("Y2oqgegqy7c6p8");
        relationBO6.setDis(0.95);
        relationBO6.setEndDate("2019-12-31");
        relationBO6.setQcType("30");
        relationBO6.setName("幸会exp");



        //广购黑金会员
        RelationBO relationBO7 = new RelationBO();
        relationBO7.setAlias("Y270ey321bbx3g");
        relationBO7.setDis(0.8);
        relationBO7.setEndDate("2050-11-30");
        relationBO7.setQcType("08");
        relationBO7.setName("广购黑金会员");

        //广购员工卡
        RelationBO relationBO8 = new RelationBO();
        relationBO8.setAlias("Y2xhrbbua64mzg");
        relationBO8.setDis(0.8);
        relationBO8.setEndDate("2050-11-30");
        relationBO8.setQcType("08");
        relationBO8.setName("广购员工卡");

        //幸会卡
        RelationBO relationBO9 = new RelationBO();
        relationBO9.setAlias("Y3nfglkdcc9nn0");
        relationBO9.setDis(0.95);
        relationBO9.setEndDate(null);
        relationBO9.setQcType("30");
        relationBO9.setName("幸会卡");

        //久仰卡exp
        RelationBO relationBO10 = new RelationBO();
        relationBO10.setAlias("Y3et3eqsx9afq4");
        relationBO10.setDis(0.88);
        relationBO10.setEndDate("2020-12-31");
        relationBO10.setQcType("32");
        relationBO10.setName("久仰卡exp");

        //承让卡exp
        RelationBO relationBO11 = new RelationBO();
        relationBO11.setAlias("Y2g0csgfp3a164");
        relationBO11.setDis(0.9);
        relationBO11.setEndDate("2020-12-31");
        relationBO11.setQcType("31");
        relationBO11.setName("承让卡exp");

        //久仰权益卡
        RelationBO relationBO12 = new RelationBO();
        relationBO12.setAlias("Y3erv28agkk8gc");
        relationBO12.setDis(0.88);
        relationBO12.setEndDate(null);
        relationBO12.setQcType("32");
        relationBO12.setName("久仰权益卡");

        //承让权益卡
        RelationBO relationBO13 = new RelationBO();
        relationBO13.setAlias("Y3ewrehdvhp9vw");
        relationBO13.setDis(0.9);
        relationBO13.setEndDate(null);
        relationBO13.setQcType("31");
        relationBO13.setName("承让权益卡");

        //幸会权益卡
        RelationBO relationBO14 = new RelationBO();
        relationBO14.setAlias("Y2fwn8khxeclvw");
        relationBO14.setDis(0.95);
        relationBO14.setEndDate(null);
        relationBO14.setQcType("30");
        relationBO14.setName("幸会权益卡");

        //基础积分卡
        RelationBO relationBO15 = new RelationBO();
        relationBO15.setAlias("");
        relationBO15.setDis(1.0);
        relationBO15.setEndDate("2050-11-30");
        relationBO15.setQcType("36");
        relationBO15.setName("积分幸会卡");

        //基础积分卡
        RelationBO relationBO16 = new RelationBO();
        relationBO16.setAlias("");
        relationBO16.setDis(1.0);
        relationBO16.setEndDate("2050-11-30");
        relationBO16.setQcType("37");
        relationBO16.setName("积分承让卡");

        //基础积分卡
        RelationBO relationBO17 = new RelationBO();
        relationBO17.setAlias("");
        relationBO17.setDis(1.0);
        relationBO17.setEndDate("2050-11-30");
        relationBO17.setQcType("38");
        relationBO17.setName("积分久仰卡");

        //幸会权益体验卡
        RelationBO relationBO18 = new RelationBO();
        relationBO18.setAlias("Y2xcu3r0rgf9v0");
        relationBO18.setDis(0.95);
        relationBO18.setEndDate(null);
        relationBO18.setQcType("30");
        relationBO18.setName("幸会权益体验卡");

        //久仰卡-积分兑换
        RelationBO relationBO19 = new RelationBO();
        relationBO19.setAlias("Y3nmvvdmv091i4");
        relationBO19.setDis(0.88);
        relationBO19.setEndDate(null);
        relationBO19.setQcType("32");
        relationBO19.setName("久仰卡-积分兑换");

        //承让卡-积分兑换
        RelationBO relationBO20 = new RelationBO();
        relationBO20.setAlias("Y3emwh4m8dxpbg");
        relationBO20.setDis(0.9);
        relationBO20.setEndDate(null);
        relationBO20.setQcType("31");
        relationBO20.setName("承让卡-积分兑换");

        RelationBO relationBO21 = new RelationBO();
        relationBO21.setAlias("");
        relationBO21.setDis(0.95);
        relationBO21.setEndDate(null);
        relationBO21.setQcType("10");
        relationBO21.setName("08会员卡");

        RelationBO relationBO22 = new RelationBO();
        relationBO22.setAlias("");
        relationBO22.setDis(0.88);
        relationBO22.setEndDate(null);
        relationBO22.setQcType("11");
        relationBO22.setName("08贵宾卡");

        RelationBO relationBO23 = new RelationBO();
        relationBO23.setAlias("");
        relationBO23.setDis(0.88);
        relationBO23.setEndDate(null);
        relationBO23.setQcType("13");
        relationBO23.setName("08老人卡");

        RelationBO relationBO24 = new RelationBO();
        relationBO24.setAlias("Y1ycqziq52s18c");
        relationBO24.setDis(0.95);
        relationBO24.setEndDate(null);
        relationBO24.setQcType("30");
        relationBO24.setName("幸会卡-学习强国");

        RelationBO relationBO25 = new RelationBO();
        relationBO25.setAlias("Y35z9dh2wkz5po");
        relationBO25.setDis(0.95);
        relationBO25.setEndDate(null);
        relationBO25.setQcType("30");
        relationBO25.setName("7天会员体验卡");

        RelationBO relationBO26 = new RelationBO();
        relationBO26.setAlias("Y1ylefrbrqbsos");
        relationBO26.setDis(0.9);
        relationBO26.setEndDate(null);
        relationBO26.setQcType("34");
        relationBO26.setName("广东志愿者专享卡");

        RelationBO relationBO27 = new RelationBO();
        relationBO27.setAlias("Y3ngpmsyvrbm58");
        relationBO27.setDis(0.95);
        relationBO27.setEndDate(null);
        relationBO27.setQcType("30");
        relationBO27.setName("广东志愿者专享卡");


        relationBOList.add(relationBO1);
        relationBOList.add(relationBO2);
        relationBOList.add(relationBO3);
        relationBOList.add(relationBO4);
        relationBOList.add(relationBO5);
        relationBOList.add(relationBO6);
        relationBOList.add(relationBO7);
        relationBOList.add(relationBO8);
        relationBOList.add(relationBO9);
        relationBOList.add(relationBO10);
        relationBOList.add(relationBO11);
        relationBOList.add(relationBO12);
        relationBOList.add(relationBO13);
        relationBOList.add(relationBO14);
        relationBOList.add(relationBO15);
        relationBOList.add(relationBO16);
        relationBOList.add(relationBO17);
        relationBOList.add(relationBO18);
        relationBOList.add(relationBO19);
        relationBOList.add(relationBO20);
        relationBOList.add(relationBO21);

        relationBOList.add(relationBO22);
        relationBOList.add(relationBO23);
        relationBOList.add(relationBO24);
        relationBOList.add(relationBO25);
        relationBOList.add(relationBO26);

    }
    //通过有赞卡alias得到对应晴川折扣
    public static RelationBO getDisByAlias(String alias){
        for(RelationBO r:relationBOList){
            if(alias.equals(r.getAlias())){
                return r;
            }
        }
        return null;
    }
    //通过有晴川card_type得到对应晴川折扣
    public static RelationBO getDisByQCType(String qcType){
        for(RelationBO r:relationBOList){
            if(qcType.equals(r.getQcType())){
                return r;
            }
        }
        return null;
    }

}
