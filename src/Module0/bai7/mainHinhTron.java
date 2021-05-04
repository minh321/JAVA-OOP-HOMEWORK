package Module0.bai7;

public class mainHinhTron {
    public static void main(String[] args) {
        ToaDo td1 = new ToaDo(5,5);
        HinhTron O = new HinhTron(td1,10.5);
        O.tinhChuVi();
        O.tinhDienTich();
        System.out.println(O);
    }
}
