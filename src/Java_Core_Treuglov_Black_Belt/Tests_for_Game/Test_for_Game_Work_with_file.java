package Java_Core_Treuglov_Black_Belt.Tests_for_Game;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Test_for_Game_Work_with_file {
    public static void main(String[] args) throws IOException {
        // Читаем файл заносим в билдер с изменением, а потом добавляем без перезаписи в конец файла копии.
        File file_enemy = new File("C://1.txt");
        Scanner str_scan = new Scanner(file_enemy);
        StringBuilder[] enemy_str_builder = new StringBuilder[5];
        int count = 0;
        System.out.println(enemy_str_builder.length);

        while (str_scan.hasNext()) {
            enemy_str_builder[count++] = new StringBuilder(str_scan.nextLine() + " +");
            if (count == 5) break;
        }
        str_scan.close();
        System.out.println(Arrays.toString(enemy_str_builder));

        PrintWriter pw = new PrintWriter(new FileWriter(file_enemy, true));
        pw.println();
        for (StringBuilder b1 : enemy_str_builder) {
            if (!(b1 == null)) {
                pw.println(b1);
            }
        }

        pw.append("This is new file");
        pw.flush();
        pw.close();

    }


}



