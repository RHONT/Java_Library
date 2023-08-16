package Java_Core_Treuglov_Black_Belt.Generic_Game_Twaice_generic;

public class Battle_area_for_generic {

    public static void main(String[] args) {

        Team_good<Human_good> human_like = new Team_good("Добрые люди");
        Team_good<Human_good> human_like_2 = new Team_good("Замечательные люди");
        Team_evil<Human_evel> human_evil = new Team_evil<>("Злодеи");

        human_like_2.add_Unit_in_team(new Magic());
        human_like_2.add_Unit_in_team(new Knight());
        human_like_2.add_Unit_in_team(new Magic());

        human_like.add_Unit_in_team(new Knight());

        human_evil.add_Unit_in_team(new Orcs());

        int i = 0;
        for (Object a : human_like_2.team_list) {
            System.out.println(human_like_2.team_list.get(i++));
        }

        System.out.println();

        i = 0;

        for (Object a : human_evil.team_list) {
            System.out.println(human_evil.team_list.get(i++));
        }

        System.out.println();

        human_like_2.team_war(human_evil);


    }
}
