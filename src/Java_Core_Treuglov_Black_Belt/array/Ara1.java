package Java_Core_Treuglov_Black_Belt.array;

public class Ara1 {

    public static void main(String[] args) {
        int array1[][];
        array1 = new int[2][2];

        int array2[];
        array2 = new int[2];

        array2[0] = 30;
        array2[1] = 50;

        int a = array2[0];
        int b = array2[1];
        array1[1][0] = a;
        array1[1][1] = b;

        System.out.println(array1[1][0] + " " + array1[1][1]);
        System.out.println("*********");
        array2[0] = 100;
        array2[1] = 500;
        System.out.println(array1[1][0] + " " + array1[1][1]);
        System.out.println("*********");
        System.out.println(array2[0] + " " + array2[1]);
        System.out.println();
    }
}
