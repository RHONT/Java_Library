package Java_Core_Treuglov_Black_Belt.Lesson_for;

public class LesFor {

    static void looptest() {

        OUTER:
        for (int hour = 0; hour < 6; hour++) {
            INNER:
            for (int min = 0; min < 60; min++) {
                if (min % 10 != 0) {
                    continue INNER;
                }
                if (min == 0) {
                } else {
                    System.out.println("=============");
                }
                INNER_2:
                for (int sec = 0; sec < 60; sec++) {
                    if (sec % 10 != 0) {
                        continue INNER_2;
                    }
                    System.out.println(hour + " : " + min + " : " + sec);
                }
            }
            System.out.println("**************");
        }
    }

    static void whiletest() {

        int h = 0;

        LEVEL_1:
        while (h < 2) {
            int m = 0;

            LEVEL_2:
            do {
                int sec = 0;

                if (m % 3 != 0) {
                    m++;
                    continue LEVEL_2;
                }

                LEVEL_3:
                do {
                    if (sec % 10 != 0) {
                        sec++;
                        continue LEVEL_3;
                    }
                    System.out.println(h + " : " + m + " : " + sec++);
                }
                while (sec < 60);
                m++;

            }
            while (m < 60);


            System.out.println("**************");
            h++;
        }


        /*OUTER:
        for (int hour = 0; hour < 6; hour++) {
            INNER:
            for (int min = 0; min < 60; min++) {
                if (min % 10 != 0) {
                    continue INNER;
                }
                if (min==0) {
                }
                else {
                    System.out.println("=============");
                }
                INNER_2:
                for (int sec = 0; sec<60; sec++) {
                    if (sec % 10 != 0) {
                        continue INNER_2;
                    }
                    System.out.println(hour + " : " + min + " : " + sec);
                }
            }
            System.out.println("**************");
        }*/
    }

    static void proverka() {
        for (int i = 0; i < 100; i++) {

            if (i % 10 == 0) {
                System.out.println(i + "Кратно 10");
            }

            //System.out.println(i);

        }
    }

    public static void main(String[] args) {
        whiletest();
        //looptest();
        //System.out.println("Пора домой!");
        //proverka();
    }
}
