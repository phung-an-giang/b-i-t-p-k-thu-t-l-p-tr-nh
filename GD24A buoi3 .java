import java.util.Scanner;

public class ThongTinSinhVien {
    public static void main(String[] args) {
        // Phần 1: Thông tin có sẵn trong mã nguồn
        String maSinhVien = "109554";
        String hoTen = "Phùng An Giang";
        String ngaySinh = "01/10/2005";
        int tuoi = 18;
        String gioiTinh = "Nam"; // Nam hoặc Nữ
        String lop = "CNTT1"; // Lớp
        String khoa = "Công Nghệ Thông Tin"; // Khoa
        String diaChi = "123 Đường ABC, TP.HCM"; // Địa chỉ

        // In thông tin sinh viên có sẵn
        System.out.println("Thông tin sinh viên (nhập từ mã nguồn):");
        System.out.println("Mã sinh viên: " + maSinhVien);
        System.out.println("Họ và tên: " + hoTen);
        System.out.println("Ngày sinh: " + ngaySinh);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Giới tính: " + gioiTinh);
        System.out.println("Lớp: " + lop);
        System.out.println("Khoa: " + khoa);
        System.out.println("Địa chỉ: " + diaChi);

        System.out.println("\n=================================\n");

        // Phần 2: Nhập thông tin từ bàn phím
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập mã sinh viên: ");
        maSinhVien = scanner.nextLine();

        System.out.print("Nhập họ và tên: ");
        hoTen = scanner.nextLine();

        System.out.print("Nhập ngày sinh (dd/mm/yyyy): ");
        ngaySinh = scanner.nextLine();

        System.out.print("Nhập tuổi: ");
        tuoi = scanner.nextInt();
       
