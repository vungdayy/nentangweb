import java.util.Scanner;

public class QuanLyDiem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập thông tin
        System.out.print("Nhập tên sinh viên: ");
        String ten = sc.nextLine();

        System.out.print("Nhập điểm Toán: ");
        double toan = sc.nextDouble();

        System.out.print("Nhập điểm Lý: ");
        double ly = sc.nextDouble();

        System.out.print("Nhập điểm Hóa: ");
        double hoa = sc.nextDouble();

        // Tính điểm trung bình
        double dtb = (toan + ly + hoa) / 3;

        // Xếp loại
        String xepLoai;
        if (dtb >= 8) {
            xepLoai = "Giỏi";
        } else if (dtb >= 6.5) {
            xepLoai = "Khá";
        } else if (dtb >= 5) {
            xepLoai = "Trung bình";
        } else {
            xepLoai = "Yếu";
        }

        // Xuất kết quả
        System.out.println("\n--- KẾT QUẢ ---");
        System.out.println("Sinh viên: " + ten);
        System.out.println("Điểm trung bình: " + dtb);
        System.out.println("Xếp loại: " + xepLoai);

        sc.close();
    }
}
