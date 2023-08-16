package Java_Core_Treuglov_Black_Belt.Generic_Game_Twaice_generic;

import java.util.ArrayList;
import java.util.List;

public class Team_good<T extends Human_good> {
    String name_team;
    List<T> team_list = new ArrayList<>();

    public Team_good(String name_team) {
        this.name_team = name_team;
    }

    public void add_Unit_in_team(T a) {
        team_list.add(a);
    }

    public void team_war(Team_evil opponent_team) {
        int sum_health_1 = 0;
        int sum_attack_2 = 0;

        int sum_health_3 = 0;
        int sum_attack_4 = 0;

        for (T a : team_list) {
            sum_health_1 += a.health + (a.defense * 2);
            sum_attack_2 += a.weapon;
        }

        for (Object a : opponent_team.team_list) {
            sum_health_3 += ((Human_evel) a).health + (((Human_evel) a).defense * 2);
            sum_attack_4 += ((Human_evel) a).weapon;
        }

        if ((sum_attack_2 > sum_health_3) && (sum_attack_4 < sum_health_1)) {
            System.out.println("Team " + this.name_team + " Winner!");
        } else {
            if ((sum_attack_4 > sum_health_1) && (sum_attack_2 < sum_health_3)) {
                System.out.println("Team " + opponent_team.name_team + " Winner!");
            } else System.out.println("Draw!");
        }
    }

    @Override
    public String toString() {
        return "Team: " + name_team + "\n" + team_list;
    }
}
