package Module0.bai9;

import java.util.Iterator;

public class mainCongNhan {
    public static void main(String[] args) {
        CongNhan cn1= new CongNhan(1,"Dang","Minh",100);
        CongNhan cn2= new CongNhan(2,"Dang","Minh",200);
        CongNhan cn3= new CongNhan(3,"Dang","Minh",500);
        CongNhan cn4= new CongNhan(4,"Dang","Minh",700);
        DanhSachCongNhan list = new DanhSachCongNhan();
        list.addCongNhan(cn1);
        list.addCongNhan(cn2);
        list.addCongNhan(cn3);
        list.addCongNhan(cn4);
        list.sortDescending();
        list.print();



    }
}
