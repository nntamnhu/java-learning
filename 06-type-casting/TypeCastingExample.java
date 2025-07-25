package lesson06_type_casting;

public class TypeCastingExample {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        double kq = (double) a/b; // Ép kiểu rộng từ int sang double
        System.out.println("Kết quả ép kiểu từ int sang double: " + kq);

        // Ép kiểu hẹp từ int sang byte
        int soNguyen = 128;
        byte soByte = (byte) soNguyen; // Ép kiểu hẹp, có thể mất dữ liệu nếu giá trị vượt quá phạm vi của byte
        System.out.println(soNguyen);
        System.out.println(soByte);

        int soNguyen2 = 15;
        byte soByte2 = (byte) soNguyen2; // Ép kiểu hẹp, không mất dữ liệu vì giá trị nằm trong phạm vi của byte
        System.out.println(soNguyen2);
        System.out.println(soByte2);



    }
}
