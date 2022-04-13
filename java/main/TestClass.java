package main;

public class TestClass {
    public static void main(String[] args) {

        System.out.println("Hello world");
        System.out.println(pow());
        System.out.println(min(5, 8));
        System.out.println(min(6, 3));
    }

    public static int pow() {
        return 10;
    }

    public static int min(int a, int b) {
        return Math.min(a, b);
    }
}
