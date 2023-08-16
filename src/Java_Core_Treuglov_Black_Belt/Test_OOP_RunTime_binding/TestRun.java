package Java_Core_Treuglov_Black_Belt.Test_OOP_RunTime_binding;

public class TestRun {
    public static void main(String[] args) {
        A c1 = new C();
        c1.abc(new B());

    }
}

class A {
    void abc(A a) {
        System.out.println("A");
    }
}

class B extends A {

    void abc(B b) {
        System.out.println("B");
    }
}

class C extends B {

    void abc(B b2) {
        System.out.println("C");
    }
}