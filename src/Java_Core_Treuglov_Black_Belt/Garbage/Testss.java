package Java_Core_Treuglov_Black_Belt.Garbage;

import java.util.Scanner;

public class Testss {
    static int b = 2;
    int a = 1;

    static void abc(final int a) {
        System.out.println(a);
        System.out.println(Testss.b);
    }

    public static void main(String[] args) {
        Testss t1 = new Testss();
        t1.abc(5);
        Scanner r1 = new Scanner(System.in);
        String str = r1.nextLine();
        System.out.println(str);
    }
}
