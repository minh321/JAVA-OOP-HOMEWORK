package Module0.bai3;

import java.text.DecimalFormat;

public class tamGiac {
    int ma, mb, mc;

    public tamGiac() {
    }

    public tamGiac(int ma, int mb, int mc) {
        if(ma < 0 || mb <0 || mc<0){
            this.ma = this.mb = this.mc =0;
        }else if(ma+mb<mc || mb+mc<ma||ma+mc<mb){
            this.ma=this.mb=this.mc=0;
        }else
        this.ma = ma;
        this.mb = mb;
        this.mc = mc;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public int getMb() {
        return mb;
    }

    public void setMb(int mb) {
        this.mb = mb;
    }

    public int getMc() {
        return mc;
    }

    public void setMc(int mc) {
        this.mc = mc;
    }

    public int tinChuVi() {
        return ma + mb + mc;
    }

    public double nuaChuVi() {
        return (ma + mb + mc) / 2;
    }

    public double dienTich() {
        return Math.sqrt(nuaChuVi() * (nuaChuVi() - ma) * (nuaChuVi() - mb)
                * (nuaChuVi() - mc));
    }

    public String kieuTamGiac() {
            if ((ma == mb && ma == mc && mc == mb)) {
                if(ma==0){
                   return "tam giac";
                }else
                return "Tam giac deu";
            } else if (ma == mb || ma == mc || mb == mc)
                return "tam giac can";
            else return "Tam giac thuong";
    }

    @Override
    public String toString() {
        return String.format("%-5s %-5s %-5s %-20s %10s %10s",ma,mb,mc,kieuTamGiac(),dienTich(),tinChuVi());
    }

}