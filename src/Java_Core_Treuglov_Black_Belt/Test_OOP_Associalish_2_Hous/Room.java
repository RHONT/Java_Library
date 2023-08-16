package Java_Core_Treuglov_Black_Belt.Test_OOP_Associalish_2_Hous;

public class Room {
    private int count_door;

    Room(House a) {
        a.uproom();

    }

    void room_in_door(Door d1) {
        count_door++;
    }

    void shownumberdoorinroom() {
        System.out.println("Количество дверей в комнате:");
        System.out.println(count_door);

    }

}
