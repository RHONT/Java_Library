package Java_Core.Stream_Api;

// проверка на простое число
// делиться либо на один, либо только на само себя
public class Part_Tens {
    public static void main(String[] args) {
        System.out.println(checkSimple(9));

    }

    static boolean checkSimple(int numb) {
        for (int i = 1; i < numb; i++) {
            if (numb % i == 0) return false;
        }
        return true;
    }
}
