package Java_Core_Treuglov_Black_Belt.Parametrized_class;

import java.util.Arrays;

public class Work_1 {
    public static void main(String[] args) {
        Integer[] arra = new Integer[4];
        Unit_parametr<Integer> g1 = new Unit_parametr<>(12, 22, 22, 33);
        Unit_parametr<String> g2 = new Unit_parametr<>("1", "2", "3", "4");
        System.out.println(g1);
        System.out.println(g2);
        arra[0] = g1.first;
        arra[1] = g1.second;
        arra[2] = g1.third;
        arra[3] = g1.four;
        System.out.println(Arrays.toString(arra));


    }
}

class Unit_parametr<T> {
    T first, second, third, four;

    public Unit_parametr(T first, T second, T third, T four) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.four = four;
    }

    @Override
    public String toString() {
        return "Параметр юнита таковы: [" + "first=" + first + ", second=" + second + ", third=" + third + ", four=" + four + ']';
    }
}
