package Java_Core_Treuglov_Black_Belt.Test_OOP_Associalish_2_Hous;

public class House {
    private static int count_room;

    public static void main(String[] args) {
        House h1 = new House();
        Room r1 = new Room(h1);
        r1.room_in_door(new Door());
        r1.room_in_door(new Door());
        r1.room_in_door(new Door());
        r1.room_in_door(new Door(50, 30, "Красная"));
        r1.shownumberdoorinroom();

        Room r2 = new Room(h1);
        r2.room_in_door(new Door());
        r2.shownumberdoorinroom();

        h1.show_count_room();


    }

    public void uproom() {
        count_room++;
    }

    void show_count_room() {
        System.out.println("Количество комнат в доме:");
        System.out.println(count_room);
    }

}
