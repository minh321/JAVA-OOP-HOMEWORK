package Module0.bai2;

public class SinhVien {
    int maSV;
    String HoTen;
    int DiemLT, DiemTH;

    public SinhVien(int maSV, String hoTen, int diemLT, int diemTH) {
        if (this.maSV < 0 ) maSV = 0;
        else this.maSV = maSV;
        HoTen = hoTen;
        if(diemLT < 0 || diemLT >10) DiemLT = 0;
        else DiemLT = diemLT;
        if (diemTH < 0 || diemTH >10) DiemTH = 0;
        else DiemTH = diemTH;
    }

    public SinhVien() {
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public int getDiemLT() {
        return DiemLT;
    }

    public void setDiemLT(int diemLT) {
        DiemLT = diemLT;
    }

    public int getDiemTH() {
        return DiemTH;
    }

    public void setDiemTH(int diemTH) {
        DiemTH = diemTH;
    }
    public int DiemTB(){
        return (DiemLT + DiemTH)/2;

    }

    @Override
    public String toString() {
        return String.format("%-5s %-30s %10s %10s %10s",maSV,HoTen,DiemLT,DiemTH,DiemTB() );
    }
}
