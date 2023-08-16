package Algoritm.Algoritm.NOD;

// Часто имеет аббривиатуру gcd
// Наибольший общий делитель
// Работает если хотя бы один из них не 0


public class Main {
    public static void main(String[] args) {
        // Скучный метод
        System.out.println(gcd(30, 18));
        // Прикольный метод через рекурсию
        // На нули проверку делать не надо, не хватает только приведения к модулю.
        System.out.println(RecursiveGcd(0, 30));

    }

    private static int gcd(int first, int second) {

        first = Math.abs(first);
        second = Math.abs(second);

        if (second > first) {
            second = second + first;
            first = second - first;
            second = second - first;
        }

        int resultCheck = checkGcdOnZeroAndOne(first, second);

        if (resultCheck == -1) {
            return calcGcd(first, second);

        } else {
            return resultCheck;
        }
    }

    private static int calcGcd(int first, int second) {
        int remains = first % second;

        for (; remains != 0; ) {
            first = second;
            second = remains;
            remains = first % second;
        }

        return second;
    }

    private static int checkGcdOnZeroAndOne(int first, int second) {
        if (first == 1 || second == 1) {
            return 1;
        }

        if (first == 0 && second == 0) {
            return 0;
        }

        if (first == 0 || second == 0) {
            return (first == 0 ? second : first);
        }

        return -1;
    }

    private static int RecursiveGcd(int first, int second) {
        if (second == 0) {
            return first;
        } else
            return RecursiveGcd(second, first % second);
    }


}
