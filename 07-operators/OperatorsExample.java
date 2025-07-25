package lesson07_operators;

public class OperatorsExample {
    public static void main(String[] args) {
        int a = 11;
        int b = 5;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Phép cộng
        System.out.println("a + b = " + (a + b));

        // Gán biến
        int tong = a + b;
        System.out.println("Tổng của a và b là: " + tong);

        // Phép trừ
        System.out.println("a - b = " + (a - b));
        // Phép nhân
        System.out.println("a * b = " + (a * b));
        // Phép chia
        System.out.println("a / b = " + ((double) a / b));
        // Phép chia lấy phần dư
        System.out.println("a % b = " + (a % b));


        //Khoi tao bien
        int i1 = 2;
        int i2 = 5;
        int i3 = -3;
        double d1 = 2.0f;
        double d2 = 5.0f;
        double d3 = -0.5f;

        //Ket qua cua cac phep toan
        System.out.println("a). i1 + (i2 * i3) = " + (i1 + (i2 * i3)));
        System.out.println("b). i1 * (i2 + i3) = " + (i1 * (i2 + i3)));
        System.out.println("c). i1 / (i2 + i3) = " + ((double) i1 / (i2 + i3)));
        System.out.println("e). i1 / i2 + i3 = " + ((double) i1 / i2 + i3));
        ;
        System.out.println("g). 3 + 4 + 5 / 3 =  " + (3 + 4 + ((double) 5 / 3)));
        System.out.println("i). (3 + 4 + 5) / 3 =" + ((3 + 4 + 5) / 3));
        System.out.println("k). d1 + (d2 * d3) = " + (d1 + (d2 * d3)));
        System.out.println("l). d1 + d2 * d3 = " + (d1 + d2 * d3));
        System.out.println("m). d1 / d2 - d3 =" + (d1 / d2 - d3));
        System.out.println("n). d1 / (d2 - d3) = " + (d1 / (d2 - d3)));
        System.out.println("o). d1 + d2 + d3 /3 = " + (d1 + d2 + d3 / 3));
        System.out.println("p). (d1 + d2 + d3) /3 =" + ((d1 + d2 + d3) / 3));
        System.out.println("q). d1 + d2 + (d3 / 3) =" + (d1 + d2 + (d3 / 3)));
        System.out.println("r). 3 * (d1 + d2) * (d1 - d3) = " + ((3 * (d1 + d2) * (d1 - d3))));
    }
}
