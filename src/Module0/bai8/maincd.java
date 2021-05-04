package Module0.bai8;

public class maincd {
    public static void main(String[] args) {
        CD cd1 = new CD(1,"minh",10,1000);
        CD cd2 = new CD(2,"minh",12,10020);
        CD cd3 = new CD(1,"minh",12,1020);
        CDList cdList = new CDList();
        cdList.addCD(cd1);
        cdList.addCD(cd2);
        cdList.addCD(cd3);
        System.out.println(cdList);
    }
}
