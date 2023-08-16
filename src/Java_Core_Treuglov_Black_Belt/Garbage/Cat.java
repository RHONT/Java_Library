package Java_Core_Treuglov_Black_Belt.Garbage;

import java.util.Arrays;

public class Cat {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Томас");
        cats[1] = new Cat("Бегемот");
        cats[2] = new Cat("Филипп Маркович");

        cats[1] = null;


        System.out.println(Arrays.toString(cats));
    }


//
//        ArrayList<Cat> cats = new ArrayList<>();
//        Cat thomas = new Cat("Томас");
//        Cat behemoth = new Cat("Бегемот");
//        Cat philipp = new Cat("Филипп Маркович");
//        Cat pushok = new Cat("Пушок");
//
//        cats.add(thomas);
//        cats.add(behemoth);
//        cats.add(philipp);
//        cats.add(pushok);
//
//        Cat secondCat = cats.get(1);
//
//        System.out.println(secondCat.name);
//    }

    @Override
    public String toString() {
        return "Кошка номер" + name;
    }
}