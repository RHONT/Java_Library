package Java_Core_Treuglov_Black_Belt.Test_OOP_Home_wor_tests.p1;

public class XX {
    public XX() {
        System.out.println("X");
    }

    public XX(int i) {
        System.out.println("X" + i);
    }

    public static void main(String[] args) {
        XX x = new YY(35);
        System.out.println(x.abc());
    }

    private boolean abc() {
        return false;
    }
}

class YY extends XX {
    public YY(int i) {
        System.out.println("Y");
    }

    public boolean abc() {
        return true;
    }

}


