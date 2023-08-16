package Java_Core_Treuglov_Black_Belt.Garbage;

public class test3 {
    static int b = 2;
    int a = 1;

    public static void main(String[] args) {
        test3 t = new test3();
        t.abc(4);
    }

    void abc(int a) {
        System.out.println(b);
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(test3.b);
    }
}
