package Java_Core_Treuglov_Black_Belt.array;

import java.util.Arrays;

public class MaxMin {

    static void minmaxfun(int arr[]) {
        System.out.println("Старое значение массива: ");
        System.out.println(Arrays.toString(arr));
       // Arrays.stream(arr).forEach(e->System.out.print(e+" " ));  // лямбда подход
       // for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");  // старый подход
        Arrays.sort(arr);
        System.out.println("Новое значение массива: ");
        System.out.println(Arrays.toString(arr));
        //for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");  // единственное тут скобок нет
    }

    static void ShowArray(String arr[][]) {
        StringBuilder stroka = new StringBuilder();
        int i = 0;
        int j = 0;
        stroka.append("{ ");

        for (i = 0; i < arr.length; i++) {
            stroka.append("{ ");
            for (j = 0; j < arr[i].length; j++) {
                stroka.append(" " + arr[i][j] + " ");
            }
            stroka.append("} | ");
        }

        stroka.append("}");
        StringBuilder zvezda = new StringBuilder();
        for (int l = 0; l < stroka.length() - 2; l++) zvezda.append("*");

        System.out.println();
        stroka.delete(stroka.length() - 3, stroka.length() - 1);
        System.out.println(zvezda);
        System.out.println(stroka);
        System.out.println(zvezda);

    }

    static int[] sort(int[] arr) {
        int vspomoga = 0;

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] > arr[i + 1]) {
                vspomoga = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = vspomoga;
            }

        }


        return arr;
    }


    public static void main(String[] args) {
        int[] arr1 = new int[]{5, 30, 1, 100, 5, 90, 45};
        String[][] arrest = {{"n", "n", "1"}, {"3", "4", "3", "4", "3", "4"}, {"3", "f", "h"}, {"a", "e", "g", "e", "h", "d", "a", "f", "d"}};

        minmaxfun(arr1);
        ShowArray(arrest);

        Arrays.sort(arr1);
        System.out.println("Максимальный элемент массива: "+ arr1[arr1.length-1]);
        System.out.println("Минимальный элемент массива: " + arr1[0]);

    }
}
