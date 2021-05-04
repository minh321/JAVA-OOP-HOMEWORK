package Module0.bai2;

import java.util.Scanner;

public class MainSinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVien sv1 = new SinhVien(1, "Minh", 7, 9);
        SinhVien sv2 = new SinhVien(2, "Huy", 8, 7);
        SinhVien sv3 = new SinhVien();
        System.out.println("Nhap id sv3: ");
        sv3.setMaSV(sc.nextInt());
        System.out.println("Nhap ten sv3: ");
        sv3.setHoTen(sc.nextLine());
        sc.nextLine();
        System.out.println("Nhap diem LT sv3: ");
        sv3.setDiemLT(sc.nextInt());
        System.out.println("Nhap diem TH sv3: ");
        sv3.setDiemTH(sc.nextInt());
        System.out.println(String.format("%-5s %-30s %10s %10s %10s",
                "maSV","HoTen","DiemLT","DiemTH","DiemTB"));
        System.out.println(sv1);
        System.out.println(sv2);
        System.out.println(sv3);
    }
}
