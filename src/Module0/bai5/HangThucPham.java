package Module0.bai5;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class HangThucPham {
    private String maHang;
    private String tenHang;
    private int donGia;
    private LocalDate ngaySX;
    private LocalDate ngayHH;

    public HangThucPham(String maHang, String tenHang, int donGia, LocalDate ngaySX, LocalDate ngayHH) {
        this.maHang = maHang;
        if (tenHang==null) System.out.println("xxx");
        else this.tenHang = tenHang;
        if(donGia<0) donGia=0;
        else this.donGia = donGia;
        if(ngaySX.isAfter(LocalDate.now())){
            ngaySX = LocalDate.now();
        }else this.ngaySX = ngaySX;
        if(ngayHH.isBefore(ngaySX)){
            ngayHH = ngaySX;
        }else this.ngayHH = ngayHH;
    }


    public String getMaHang() {
        return maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        if(tenHang==null) System.out.println("xxx");
        else this.tenHang = tenHang;

    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        if(donGia <0) donGia =0;
        else this.donGia = donGia;
    }

    public LocalDate getNgaySX() {
        return ngaySX;
    }

    public void setNgaySX(LocalDate ngaySX) {
        this.ngaySX = ngaySX;
    }

    public LocalDate getNgayHH() {
        return ngayHH;
    }

    public void setNgayHH(LocalDate ngayHH) {
        this.ngayHH = ngayHH;
    }

    private void setMaHang(String maHang) throws Exception{
        if(!maHang.trim().equals(""))
            this.maHang=maHang;
        else
            throw new Exception("Loi: Ma hang trong!");
    }
    public String hetHan(){
        if( ngayHH.isBefore(LocalDate.now())) {
            return "Het han";
        }else return "con han";
    }


   public String toString(){
       Locale local = new Locale("vi","vn");
       DecimalFormat df = new DecimalFormat("#,##0.00");

       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
       NumberFormat nf = NumberFormat.getCurrencyInstance(local);
       //String strDonGia = donGia.format(nf);
       String strngaySX = formatter.format(getNgaySX());
       String strngayHH = formatter.format(getNgayHH());
       return String.format("%3s %-5s %15s %10s %10s %-20s",maHang,tenHang,donGia,strngaySX,
               strngayHH,hetHan());
   }
}
