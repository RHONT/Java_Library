package Java_Core_Treuglov_Black_Belt.Test_for_game_input_value;

import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Input_Value_in_class {
    public static void main(String[] args) throws IOException {
        Gorgona g1 = new Gorgona();
        g1.print();

    }
}

class Gorgona {
    String name;
    int head, torso, front_pows, back_pows = 0;

    Gorgona() {
        File file_gorgona = new File("C://1.txt");

        try {
            Scanner str_scan = new Scanner(file_gorgona);
            this.name = str_scan.nextLine();
            this.head = Integer.parseInt(str_scan.nextLine());
            this.torso = Integer.parseInt(str_scan.nextLine());
            this.front_pows = Integer.parseInt(str_scan.nextLine());
            this.back_pows = Integer.parseInt(str_scan.nextLine());
            str_scan.close();
        } catch (IOException | NoSuchElementException | NumberFormatException er) {
            name = "Без имени";
            head = 20;
            torso = 20;
            front_pows = 20;
            back_pows = 20;
            System.out.println("Default:");
        }

    }

    void print() {
        System.out.println(name);
        System.out.println(head);
        System.out.println(torso);
        System.out.println(front_pows);
        System.out.println(back_pows);
    }

}
