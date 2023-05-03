public class HelloInt {
    public static void main(String[] args) {
//        myFirstInt();
        systemDigits();
    }

    public static void myFirstInt() {
        int a = 10;
        int b = 15;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        int c = a + b;
        System.out.println("c: " + c);
        int sumIncomeMonth = 2305434;
        System.out.println("Доход за месяц: " + sumIncomeMonth + "€");
    }

    public static void declaration() {
        int var1;
        var1 = 1;
    }

    public static void systemDigits() {
        int hexValue = 0x100; // Шестнадцатеричная система счисления #ffffff
        int binary = 0B10_01_10_01; // Двоичная система счисления
        int octal = 0757;  // восьмеричная система счисления
        System.out.println(hexValue);
    }
}
