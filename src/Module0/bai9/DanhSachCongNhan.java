package Module0.bai9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachCongNhan {
    ArrayList<CongNhan> CNlist = new ArrayList<>();
    public void addCongNhan(CongNhan congNhan){
            CNlist.add(congNhan);
    }
    public void print(){
        for (CongNhan congNhan : CNlist){
            System.out.println(congNhan.toString());
        }
    }
    public void printSize(){
        System.out.println(CNlist.size());
    }
    public void print200(){
        for (CongNhan congNhan: CNlist) {
            if(congNhan.getmSoSP()>=200){
                System.out.println(congNhan.toString());
            }
        }
    }
    public ArrayList<CongNhan> sortDescending(){
        Collections.sort(this.CNlist, new Comparator<CongNhan>() {
            @Override
            public int compare(CongNhan o1, CongNhan o2) {
                if(o1.getmSoSP()>o2.getmSoSP()) return -1;
                else if ((o1.getmSoSP()<o2.getmSoSP())) return 1;
                else
                return 0;
            }
        });
        return this.CNlist;
    }
}
