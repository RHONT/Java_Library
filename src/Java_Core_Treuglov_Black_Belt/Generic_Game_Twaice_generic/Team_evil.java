package Java_Core_Treuglov_Black_Belt.Generic_Game_Twaice_generic;

import java.util.ArrayList;
import java.util.List;

public class Team_evil<T extends Human_evel> {

    String name_team;
    List<T> team_list = new ArrayList<>();

    public Team_evil(String name_team) {
        this.name_team = name_team;
    }

    public void add_Unit_in_team(T a) {
        team_list.add(a);
    }
}
