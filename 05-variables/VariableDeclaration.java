package lesson5_variables;

public class VariableDeclaration {
    public static void main(String[] args) {
        //khai báo biến
        int a;
        byte tuoi;
        float diemToan;

        //khai báo nhiều biến cùng kiểu dữ liệu
        int b, c, d;

        //khởi tạo biến
        int tuoiCon = 10;
        float diemVan = 8.5f; // Sử dụng 'f' để chỉ định đây là số thực kiểu float
        double diemLy = 9.5;

        System.out.println("Tuổi con trước thay đổi là: " + tuoiCon);
        tuoiCon = 15; // Gán giá trị mới cho biến tuoiCon
        System.out.println("Tuổi con sau thay đổi là: " + tuoiCon);

        //hang số
        final int SO_NGUOI = 10; // Khai báo hằng số, không thể thay đổi giá trị sau khi đã gán

    }
}
