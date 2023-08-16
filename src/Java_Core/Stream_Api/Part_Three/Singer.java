package Java_Core.Stream_Api.Part_Three;

import java.util.Arrays;

public class Singer {

    private String name;
    private String[] songs;

    public Singer(String name, String[] songs) {
        super();
        this.name = name;
        this.songs = songs;
    }

    public String[] getSongs() {
        return songs;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Singer [name=" + name + ", songs=" + Arrays.toString(songs) + "]";
    }
}
