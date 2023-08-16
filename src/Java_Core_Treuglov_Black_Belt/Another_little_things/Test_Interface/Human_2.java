package Java_Core_Treuglov_Black_Belt.Another_little_things.Test_Interface;

public class Human_2 implements AnotherSong {
    private Song song;

    @Override
    public void abc() {
        Song song=new Human();
        song.abc();
    }

    public static void main(String[] args) {
        Human_2 dd=new Human_2();
        dd.abc();
    }
}
