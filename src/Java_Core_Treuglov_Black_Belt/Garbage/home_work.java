package Java_Core_Treuglov_Black_Belt.Garbage;

public class home_work {

    final static double p = 3.14;

    static void dlina(double r) {
        System.out.println("длина окружности: " + 2 * r * p);
    }

    static double umn(int a, int b, int c) {
        return a * b * c;

    }

    void pr2(double r) {
        System.out.println("Площадь окружности: " + r * r * p);
    }

    void dlrad(double r) {
        System.out.println("Площадь окружности: " + r * r * p);
        System.out.println("Длина окружности: " + 2 * r * p);

    }

}

class test {

    public static void main(String[] args) {
        home_work krug1 = new home_work();
        krug1.pr2(10);
        home_work.dlina(10);
        krug1.dlrad(10);

        System.out.println(home_work.umn(1, 2, 3));
    }

}