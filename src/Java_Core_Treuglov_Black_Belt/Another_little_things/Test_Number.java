package Java_Core_Treuglov_Black_Belt.Another_little_things;

public class Test_Number {
    String s = new String("");

    public static void main(String[] args) {
        Test_Number c = new Test_Number();
        char ch = 55;
        c.abc(ch);
        c.abc(false);
        c.abc(3.14f);   // если уберу f, то примет Object
        c.plusstr("*");
        c.plusstr("*");
        c.plusstr("*");
    }

    void abc(char a) {
        System.out.println("Char");
    }  // если это убрать, то int возьмет на себя char

    void abc(short a) {
        System.out.println("Byte");
    }

    void abc(float a) {
        System.out.println("float");
    }

    void abc(int a) {
        System.out.println("int");
    }

    void abc(Object a) {
        System.out.println("Object");
    }

    void plusstr(String str) {
        this.s += str;
        System.out.println(this.s);
    }
}
