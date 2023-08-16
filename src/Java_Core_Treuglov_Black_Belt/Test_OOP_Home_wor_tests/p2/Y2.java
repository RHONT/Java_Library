package Java_Core_Treuglov_Black_Belt.Test_OOP_Home_wor_tests.p2;


import Java_Core_Treuglov_Black_Belt.Test_OOP_Home_wor_tests.p1.X2;

public class Y2 extends X2 {
    public static void main(String[] args) {
        Y2 a = new Y2();
        a.abc();
        a.def();
    }

    public void abc() {
        System.out.println("Y");
    }

    public void def() {
        Y2 y2 = new Y2();
        y2.abc();

    }

    public void ghi() {
        X2 x = new X2();
        //x.abc();
    }
}
