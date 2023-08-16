package Java_Core_Treuglov_Black_Belt.Test_OOP_Associalish_2_Hous;

public class Door {
    private static int count;
    private int height;
    private int width;
    private String color;

    Door() {
        this.height = 100;
        this.width = 100;
        this.color = new String("Blue");
        count++;
    }

    Door(int h, int w, String str) {
        this.height = h;
        this.width = w;
        this.color = new String(str);
        count++;
    }

    void show_count_door() {
        System.out.println(count);
    }
}
