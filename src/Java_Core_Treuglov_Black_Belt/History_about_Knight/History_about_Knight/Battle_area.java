package Java_Core_Treuglov_Black_Belt.History_about_Knight.History_about_Knight;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;

interface Humanoid_ability {

    void Attack(Humanoid a);

    default void Armor(int a, int b, int c, int d) {

    }

}

public class Battle_area {

    static String str(int a) {

        String buf_st;
        buf_st = Integer.toString(a);
        return buf_st;
    }


    static String space(String s, int a) {
        String str = "";
        int buf;
        buf = a - s.length();
        for (int i = 0; i < buf; i++) {
            str = str + " ";
        }
        return str;
    }

    static void print_battle_life(Humanoid a, Humanoid b) {
        int maxlenght = 0;

        String[][] str = {{a.name, b.name},

                {"Шлем:           " + str(a.param_humanoid[0]) + "/" + str(a.copy_param_humanoid[0]) + " [" + str(a.defense[0]) + "]",
                        str(b.param_humanoid[0]) + "/" + str(b.copy_param_humanoid[0]) + " [" + str(b.defense[0]) + "]"},
                {"Нагрудник:      " + str(a.param_humanoid[1]) + "/" + str(a.copy_param_humanoid[1]) + " [" + str(a.defense[1]) + "]",
                        str(b.param_humanoid[1]) + "/" + str(b.copy_param_humanoid[1]) + " [" + str(b.defense[1]) + "]"},
                {"Нарукавники:    " + str(a.param_humanoid[2]) + "/" + str(a.copy_param_humanoid[2]) + " [" + str(a.defense[2]) + "]",
                        str(b.param_humanoid[2]) + "/" + str(b.copy_param_humanoid[2]) + " [" + str(b.defense[2]) + "]"},
                {"Поножи:         " + str(a.param_humanoid[3]) + "/" + str(a.copy_param_humanoid[3]) + " [" + str(a.defense[3]) + "]",
                        str(b.param_humanoid[3]) + "/" + str(b.copy_param_humanoid[3]) + " [" + str(b.defense[3]) + "]"},
                {"Сила орудия:    " + str(a.param_humanoid[4]), str(b.param_humanoid[4])}};


        for (String[] z : str) {
            if (z[0].length() > maxlenght) {
                maxlenght = z[0].length();
            }
            ;
        }

        maxlenght += 4;

        for (int i = 0; i < str.length; i++) {
            str[i][0] = str[i][0] + space(str[i][0], maxlenght) + str[i][1];
            System.out.println(str[i][0]);
        }


    }

    static void print_battle_life(Humanoid a, Humanoid b, Humanoid c) {
        int maxlenght = 0;

        String[][] str = {{a.name, b.name, c.name},

                {"Шлем:           " + str(a.param_humanoid[0]) + "/" + str(a.copy_param_humanoid[0]) + " [" + str(a.defense[0]) + "]",
                        str(b.param_humanoid[0]) + "/" + str(b.copy_param_humanoid[0]) + " [" + str(b.defense[0]) + "]",
                        str(c.param_humanoid[0]) + "/" + str(c.copy_param_humanoid[0]) + " [" + str(c.defense[0]) + "]"},
                {"Нагрудник:      " + str(a.param_humanoid[1]) + "/" + str(a.copy_param_humanoid[1]) + " [" + str(a.defense[1]) + "]",
                        str(b.param_humanoid[1]) + "/" + str(b.copy_param_humanoid[1]) + " [" + str(b.defense[1]) + "]",
                        str(c.param_humanoid[1]) + "/" + str(c.copy_param_humanoid[1]) + " [" + str(c.defense[1]) + "]"},
                {"Нарукавники:    " + str(a.param_humanoid[2]) + "/" + str(a.copy_param_humanoid[2]) + " [" + str(a.defense[2]) + "]",
                        str(b.param_humanoid[2]) + "/" + str(b.copy_param_humanoid[2]) + " [" + str(b.defense[2]) + "]",
                        str(c.param_humanoid[2]) + "/" + str(c.copy_param_humanoid[2]) + " [" + str(c.defense[2]) + "]"},
                {"Поножи:         " + str(a.param_humanoid[3]) + "/" + str(a.copy_param_humanoid[3]) + " [" + str(a.defense[3]) + "]",
                        str(b.param_humanoid[3]) + "/" + str(b.copy_param_humanoid[3]) + " [" + str(b.defense[3]) + "]",
                        str(c.param_humanoid[3]) + "/" + str(c.copy_param_humanoid[3]) + " [" + str(c.defense[3]) + "]"},
                {"Сила орудия:    " + str(a.param_humanoid[4]), str(b.param_humanoid[4]), str(c.param_humanoid[4])}};


        for (String[] z : str) {
            if (z[0].length() > maxlenght) {
                maxlenght = z[0].length();
            }
            ;
        }

        maxlenght += 4;

        for (int i = 0; i < str.length; i++) {
            str[i][0] = str[i][0] + space(str[i][0], maxlenght) + str[i][1];
        }

        for (String[] z : str) {
            if (z[0].length() > maxlenght) {
                maxlenght = z[0].length();
            }
            ;
        }

        maxlenght += 4;

        for (int i = 0; i < str.length; i++) {
            str[i][0] = str[i][0] + space(str[i][0], maxlenght) + str[i][2];
            System.out.println(str[i][0]);
        }


    }


    static void read_file(String str) {
        File buf_read = new File(str);
        String path = buf_read.getAbsolutePath(); // показывает где лежит файл(нужно понять как переназначить корневую папку.)
        System.out.println(path);
        try {
            Scanner scan_for_read = new Scanner(buf_read);
            while (scan_for_read.hasNext()) {
                System.out.println(scan_for_read.nextLine());
            }
            scan_for_read.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Часть истории не найдена");

        }


    }

    static void market_place(Humanoid buf) {
        System.out.println("Вас встречает трактирщик. На его прилавке скучают вещи, вы внимательно смотрите на них.");
        System.out.println(market.SHIELD.numb_for_tovar + " Щит | Цена: " + market.SHIELD.coast);
        System.out.println(market.POITIO_OF_HEALTH.numb_for_tovar + " Зелье здоровья | Цена: " + market.POITIO_OF_HEALTH.coast);
        System.out.println(market.MOLOTOV.numb_for_tovar + " Коктейль молотова | Цена: " + market.MOLOTOV.coast);
        System.out.println("0 Выход из трактира");

        while (!buf.market_exit) {
            String for_market_scanner;
            Scanner scan_market = new Scanner(System.in);
            for_market_scanner = scan_market.nextLine();
            switch (for_market_scanner) {
                case ("1"):
                    if (market.SHIELD.coast <= buf.money) {
                        buf.money -= market.SHIELD.coast;
                        buf.param_inventory[1] += 2;
                        System.out.println("Вы купили щит!");
                        break;
                    } else {
                        System.out.println("Невозможно купить щит. Вам не хватает " + (market.SHIELD.coast - buf.money));
                        break;
                    }
                case ("2"):
                    if (market.POITIO_OF_HEALTH.coast <= buf.money) {
                        buf.money -= market.POITIO_OF_HEALTH.coast;
                        buf.param_inventory[3] += 1;
                        System.out.println("Вы купили зелье!");
                        break;
                    } else {
                        System.out.println("Невозможно купить зелье. Вам не хватает " + (market.POITIO_OF_HEALTH.coast - buf.money));
                        break;
                    }

                case ("3"):
                    if (market.MOLOTOV.coast <= buf.money) {
                        buf.money -= market.MOLOTOV.coast;
                        buf.param_inventory[2] += 1;
                        System.out.println("Вы купили молотов");
                        break;
                    } else {
                        System.out.println("Невозможно купить коктейль молотова. Вам не хватает " + (market.MOLOTOV.coast - buf.money));
                        break;
                    }

                case ("0"): {
                    buf.market_exit = true;
                    break;
                }

                default:
                    System.out.println("Значение введено неправильно");
            }
        }
        buf.market_exit = false;

    }

    static void fight(Humanoid first, Humanoid second) {
        while (first.Humanoid_is_alife() && second.Humanoid_is_alife()) {
            first.Attack(second);
            //second.print_health_info();
            second.Attack(first);
            //first.print_health_info();
            print_battle_life(first, second);
            System.out.println();
            first.print_info_fight();
            second.print_info_fight();
            System.out.println();
        }
    }

    static void fight(Humanoid first, Humanoid second, Humanoid third) {
        while (first.Humanoid_is_alife() && (second.Humanoid_is_alife() || third.Humanoid_is_alife())) {
            if (second.Humanoid_is_alife()) {
                first.Attack(second);
                second.Attack(first);
                third.Attack(first);
                print_battle_life(first, second, third);
                first.print_info_fight();
                second.print_info_fight();
                third.print_info_fight();
            } else {
                first.Attack(third);
                //second.print_health_info();
                third.Attack(first);
                //first.print_health_info();
                print_battle_life(first, second, third);
                System.out.println();
                first.print_info_fight();
                third.print_info_fight();
                System.out.println();
            }

        }
    }

    public static void main(String[] args) {
        Scanner history_stop = new Scanner(System.in);

        Zombie second = new Zombie("Zombie.txt");
        second.setDefense(0, 20, 0, 30);
        Knight first = new Knight("Knight.txt");
        first.setDefense(20, 20, 40, 20);
        Zombie third = new Zombie("Zombie.txt");
        third.setDefense(20, 50, 50, 50);

//        hello_market();
        first.print_inv_and_money();

        market_place(first);
        read_file("Thief_1.txt");
        first.bufer_string = history_stop.nextLine();
        first.thief_1 = (first.bufer_string.equals("1") ? true : false);
        System.out.println(first.thief_1);
        System.out.println("Нажмиет Enter для продолжения");

        read_file("Beginning.txt");
        System.out.println();
        System.out.println("Нажмиет Enter для продолжения");
        history_stop.nextLine();

        for (int i = 0; i < 3; i++) {
            System.out.println("Из под болотной мути неторопливо поднялся мертвец. Неуверенная поступь резко меняется и он уже бежит на вас! К бою!");
            fight(first, second);
            if (first.Humanoid_is_alife() == false) {
                System.out.println("Сэр Томас погиб. Его натура не выдержала вызова судьбы.");
                break;
            }
            System.out.println("Враг пал");
            first.money += second.money;
            System.out.println();
            second.reborn();
        }
        first.down_health();

        System.out.println("Нажмиет Enter для продолжения");
        history_stop.nextLine();
        first.halt();    // привал

        first.level_up();

        System.out.println("Нажмиет Enter для продолжения");
        history_stop.nextLine();

        first.halt();

        System.out.println("Нажмиет Enter для продолжения");
        history_stop.nextLine();

        System.out.println("Перед вами мертвый рыцарь!");
        fight(first, third);
    }

    enum market {
        SHIELD(1, 200),
        POITIO_OF_HEALTH(2, 100),
        MOLOTOV(3, 150);

        private int numb_for_tovar;
        private int coast;

        market(int buf_number, int buf_coast) {

            this.numb_for_tovar = buf_number;
            this.coast = buf_coast;
        }

        public int getNumb_for_tovar() {
            return numb_for_tovar;
        }

        public int getCoast() {
            return coast;
        }
    }
}

class Humanoid implements Humanoid_ability {

    boolean i_am_fire = false;
    boolean thief_1 = false;
    String bufer_string;

    String name;
    int chance_to_attack = 80;
    int chance_to_attack_in_fire = chance_to_attack - 15;  ////!!!!! Исправить!!
    boolean market_exit = false;                 // 0 - do in market, 1 - not do in market
    boolean halt_param = false;
    boolean halt_craft = false;
    boolean level_up_param = false;
    int[] param_humanoid = {1, 1, 1, 1, 1}; // {head:Torso:Hand:lags; Attack}
    int[] defense = {0, 0, 0, 0};        // Armor HTHL
    int[] param_inventory = {0, 2, 1, 1}; //{shield_buf, shield_in_inventory,molotov,poition_of_health}
    String info_str_figth;
    int[] copy_param_humanoid = Arrays.copyOfRange(param_humanoid, 0, param_humanoid.length);
    int money = 100;
    //int burn_damage=Math.round(param_humanoid[4]/2);

    Humanoid(String str_file) {
        String path = new File(str_file).getAbsolutePath(); // показывает где лежит файл(нужно понять как переназначить корневую папку.)
        System.out.println(path);
        File file_humanoid = new File(str_file);

        try {
            Scanner str_scan = new Scanner(file_humanoid);
            this.name = str_scan.nextLine();
            this.param_humanoid[0] = Integer.parseInt(str_scan.nextLine());
            this.param_humanoid[1] = Integer.parseInt(str_scan.nextLine());
            this.param_humanoid[2] = Integer.parseInt(str_scan.nextLine());
            this.param_humanoid[3] = Integer.parseInt(str_scan.nextLine());
            this.param_humanoid[4] = Integer.parseInt(str_scan.nextLine());
            this.copy_param_humanoid = Arrays.copyOfRange(this.param_humanoid, 0, 8);
            str_scan.close();
        } catch (IOException | NoSuchElementException | NumberFormatException er) {
            this.name = "No name";
            this.param_humanoid[0] = 20;
            this.param_humanoid[1] = 20;
            this.param_humanoid[2] = 20;
            this.param_humanoid[3] = 20;
            this.param_humanoid[4] = 1;
            this.copy_param_humanoid = Arrays.copyOfRange(this.param_humanoid, 0, 5);
            System.out.println("Default:");
        }
    }

    void swith_for_halt() {
        Scanner scan_halt = new Scanner(System.in);
        String buf_str = scan_halt.nextLine();
        switch (buf_str) {
            case "1":
                if (param_inventory[3] > 0) {
                    for (int i = 0; i < param_inventory.length; i++) {
                        param_humanoid[i] += 70;
                    }
                    param_inventory[3] -= 1;
                    System.out.println("Вы выпили зелье! Теперь ваше здовровье");
                    down_health();
                    print_health_info();
                    System.out.println("Что еще хотите сделать?");
                    break;
                } else {
                    System.out.println("У вас нет зелья!");
                    break;
                }

            case "2":
                if (param_inventory[0] == 0) {

                    if (this.param_inventory[1] >= 2) {
                        this.param_inventory[0] += 2;
                        this.param_inventory[1] -= 2;
                        System.out.println("Вы приготовили щит к следующему бою");
                        break;
                    } else {
                        System.out.println("У вас нет щитов");
                        break;
                    }
                } else {
                    System.out.println("Ваш щит уже приготовлен, его прочность: " + param_inventory[0]);
                    break;
                }

            case "3":
                if (!halt_craft) {
                    System.out.println("Что будем чинить? 1-2-3-4? Прочность элемента повышаеться на 30");
                    Scanner str_craft = new Scanner(System.in);
                    String buf_str_for_craft = str_craft.nextLine();
                    switch (buf_str_for_craft) {
                        case "1": {
                            defense[0] += 30;
                            halt_craft = true;
                            System.out.println("Доспех починен! Что выберете еще?");
                            print_defense();
                            break;
                        }
                        case "2": {
                            defense[1] += 30;
                            halt_craft = true;
                            System.out.println("Доспех починен! Что выберете еще?");
                            print_defense();
                            break;
                        }
                        case "3": {
                            defense[2] += 30;
                            halt_craft = true;
                            System.out.println("Доспех починен! Что выберете еще?");
                            print_defense();
                            break;
                        }
                        case "4": {
                            defense[3] += 30;
                            halt_craft = true;
                            System.out.println("Доспех починен! Что выберете еще?");
                            print_defense();
                            break;
                        }
                        default:
                            System.out.println("Введено недопустимое значение");
                    }
                    break;
                } else {
                    System.out.println("На привале можно починить лишь один элемент брони. Вы уже этим воспользовались");
                    break;
                }

            case "0": {
                halt_param = true;
                break;
            }

            default:
                System.out.println("Введено недопустимое значение");
        }

    }

    void halt() {
        System.out.println();
        System.out.println("После битвы вы решили устроить короткий привал");
        print_health_info();
        print_inv_and_money();
        System.out.println();
        System.out.println("Что будете делать?\n" +
                "1 - Выпить зелье\n" +
                "2 - Приготовить щит\n" +
                "3 - Отремонтировать на выбор один элемент брони\n" +
                "0 - Продолжить путешествие\n");
        while (!halt_param) {
            swith_for_halt();
        }
        halt_param = false;
        System.out.println("Вы продолжили путешествие.");
        System.out.println();

    }

    void print_info_fight() {
        System.out.println(info_str_figth);
        info_str_figth = "";
    }

    void print_inv_and_money() {
        System.out.println();
        System.out.println("Золота у вас: " + money +
                "\nПрочность щита в руке: " + param_inventory[0] + "\nКоличество щитов: " + param_inventory[1] + "\nКоктейля молотова: " + param_inventory[2] + "\nЦелебного зелья: " + param_inventory[3]);
        System.out.println();
    }

    void print_defense() {
        System.out.println("Состояние брони: " +
                "\nШлем: " + defense[0] + " Нагрудник: " + defense[1] + " Нарукавники: " + defense[2] + " Поножи: " + defense[3]);
    }

    void reborn() {
        this.param_humanoid = Arrays.copyOfRange(copy_param_humanoid, 0, 5);
        this.i_am_fire = false;
        this.chance_to_attack = 80;
    }

    void down_health() {
        for (int i = 0; i < 4; i++) {
            if (copy_param_humanoid[i] < param_humanoid[i]) param_humanoid[i] = copy_param_humanoid[i];
        }
    }

    void print_health_info() {
        String info_str;
        String spec_char = "";


        info_str = ("Голова: " + param_humanoid[0] + "/" + copy_param_humanoid[0] + " [" + defense[0] + "]" +
                " Тело: " + param_humanoid[1] + "/" + copy_param_humanoid[1] + " [" + defense[1] + "]" +
                " Руки: " + param_humanoid[2] + "/" + copy_param_humanoid[2] + " [" + defense[2] + "]" +
                " Ноги: " + param_humanoid[3] + "/" + copy_param_humanoid[3] + " [" + defense[3] + "]" +
                " Сила оружия: " + param_humanoid[4]);
        for (int i = 0; i < info_str.length(); i++) {
            spec_char += "-";
        }
        System.out.println(spec_char);
        System.out.println(this.name);
        System.out.println(info_str);
    }

    void setDefense(int a, int b, int c, int d) {
        defense = new int[]{a, b, c, d};
    }

    boolean Humanoid_is_alife() {
        boolean b = false;
        for (int a : param_humanoid) {
            if (a <= 0) {
                b = false;
                break;
            } else b = true;
        }
        return b;
    }

    void level_up() {
        System.out.println();
        System.out.println("Сэр Томас отдышался. Оглядел поле боя и решил задуматься, точнее некоторые мысли " +
                "\nназойливые как комары заставляли его это сделать. Не в силах сражаться с самим собой он впустил к себе одну из них." +
                "\n1 - Как сильно бьеться мое сердце, словно удары молота о наковальню. Мое тело идеальный механизм!" +
                "\n2 - А ведь не так быстро двигался враг, был момент даже когда мне показалось, что время замедлилось." +
                "\n3 - Я несколько иначе ощущал свой меч, словно он стал моим продолжением");
        while (!level_up_param) {
            swith_for_level_up();
        }
        level_up_param = false;
        System.out.println();
    }

    void swith_for_level_up() {
        Scanner scan_level_up = new Scanner(System.in);
        String buf_str = scan_level_up.nextLine();
        switch (buf_str) {
            case "1":
                for (int i = 0; i < 4; i++) {
                    param_humanoid[i] += 10;
                    copy_param_humanoid[i] += 10;
                }
                System.out.println("Ваше здоровье увеличено на 10 едениц по каждому пунку.");
                print_health_info();
                level_up_param = true;
                break;
            case "2":
                chance_to_attack += 5;
                System.out.println("Ваша меткость увеличилась на 5 едениц, теперь она состовляет:" + chance_to_attack);
                level_up_param = true;
                break;
            case "3":
                param_humanoid[4] += 7;
                copy_param_humanoid[4] += 7;
                System.out.println("Ваш меч острее не стал, но мастерство увеличило наносимый урон:" + param_humanoid[4]);
                print_health_info();
                level_up_param = true;
                break;
            default:
                System.out.println("Сэр Томас немного отвлекся, но смог с легкостью сосредоточиться вновь.");
        }

    }

    @Override
    public void Attack(Humanoid a) {

    }
}

class Zombie extends Humanoid implements Humanoid_ability {
    int money = 150;

    Zombie(String str_file) {
        super(str_file);
    }

    public void Attack(Humanoid a) {

        int multiplier;
        int buf_rnd_critical = new Random().nextInt(101) + 1;
        int rnd = new Random().nextInt(4);

        if (i_am_fire) {
            param_humanoid[4] = Math.round(copy_param_humanoid[4] / 2);
            chance_to_attack = chance_to_attack_in_fire;
            for (int i = 0; i <= 3; i++) {
                param_humanoid[i] -= 10;
            }
            System.out.println(this.name + " теряет здоровье. Каждый ход - 10 очков здовровья. Меткость снижена до " + this.chance_to_attack);
        }

        if (a.param_inventory[0] > 0) {
            a.param_inventory[0] -= 1;
            info_str_figth = "Удар пришелся по щиту! Состояние щита: " + a.param_inventory[0];
        } else {
            if (buf_rnd_critical < this.chance_to_attack) {

                if (a.defense[rnd] > 0) {
                    a.defense[rnd] -= Math.round(this.param_humanoid[4] * 0.33);
                    a.param_humanoid[rnd] -= Math.round(this.param_humanoid[4] * 0.25);
                    a.defense[rnd] = ((a.defense[rnd] < 0) ? 0 : (a.defense[rnd]));
                    info_str_figth = "Доспех снизил урон, вы получили " + Math.round(this.param_humanoid[4] * 0.25) + " Урона | " + " Доспех повредился на " + Math.round(this.param_humanoid[4] * 0.33);
                } else {
                    a.param_humanoid[rnd] -= this.param_humanoid[4];
                    info_str_figth = "Вы  получили урон:" + this.param_humanoid[4];
                }
            } else {
                info_str_figth = "Враг промахнулся!";
            }
        }
    }
}

class Knight extends Humanoid implements Humanoid_ability {


    Knight(String str_file) {
        super(str_file);
    }

    public void Attack(Humanoid a) {
        String str_info = "Вы нанесли урон: ";
        int buf_war = 0;
        String checking_the_str = new String();
        boolean checking_the_str_swith = false;
        int buf_critical_damage = 0;
        int buf_X = 1;
        System.out.println("Атакуй! 1 - голова " + (chance_to_attack - 10) + "% | 2 -тело " + (chance_to_attack) + "% | 3 - руки " + (chance_to_attack - 20) + "% | 4 - ноги " + (chance_to_attack - 20) + "% | Слово - Щит (защита) или Молотов (атака)");
        while (!checking_the_str_swith) {
            Scanner str_war = new Scanner(System.in);
            checking_the_str = str_war.nextLine();
            switch (checking_the_str) {
                case ("Щит"):
                    if (this.param_inventory[1] >= 2) {
                        this.param_inventory[0] += 2;
                        this.param_inventory[1] -= 2;
                        info_str_figth = "Вы достали щит!";
                        checking_the_str_swith = true;
                        break;
                    } else {
                        System.out.println("У вас нет щитов");
                        break;
                    }
                case ("Молотов"):
                    if (param_inventory[2] > 0) {
                        for (int i = 0; i < (a.param_humanoid.length - 1); i++) {
                            a.param_humanoid[i] -= 30;
                        }
                        info_str_figth = "Противник в огне!";
                        a.i_am_fire = true;
                        param_inventory[2] -= 1;
                        checking_the_str_swith = true;
                        break;
                    } else {
                        System.out.println("У вас нет Молотова");
                        break;
                    }
                case ("Зелье"):
                    if (this.param_inventory[3] > 0) {
                        for (int i = 0; i < this.param_inventory.length; i++) {
                            this.param_humanoid[i] += 70;
                        }
                        this.param_inventory[3] -= 1;
                        info_str_figth = "Вы ицелились на 70 очков";
                        checking_the_str_swith = true;
                        break;
                    } else {
                        System.out.println("У вас нет зелья!");
                        break;
                    }

                case ("1"):
                case ("2"):
                case ("3"):
                case ("4"):


                    buf_war = Integer.valueOf(checking_the_str);
                    int buf_chance;
                    buf_chance = this.chance_to_attack;
                    switch (buf_war) {
                        case 1: {
                            buf_chance -= 10;
                            break;
                        }
                        case 2: {
                            buf_chance -= 0;
                            break;
                        }
                        case 3: {
                            buf_chance -= 20;
                            break;
                        }
                        default: {
                            buf_chance -= 20;
                            break;
                        }
                    }

                    checking_the_str_swith = true;
                    buf_critical_damage = new Random().nextInt(100);
                    buf_X = 1;

                    if (buf_critical_damage < 20) {
                        buf_X = 2;
                    }


                    if (buf_critical_damage <= buf_chance) {
                        int damage_to_enemy;
                        String str_damage_defense;
                        damage_to_enemy = (int) (Math.round((this.param_humanoid[4] * buf_X) * (a.defense[buf_war - 1] > 0 ? 0.25 : 1)));
                        a.param_humanoid[buf_war - 1] -= damage_to_enemy;
                        str_damage_defense = String.valueOf(Math.round(a.defense[buf_war - 1] > 0 ? this.param_humanoid[4] - this.param_humanoid[4] * 0.33 : 0));
                        a.defense[buf_war - 1] -= Math.round(a.defense[buf_war - 1] > 0 ? this.param_humanoid[4] * 0.33 : 0);
                        a.defense[buf_war - 1] = (a.defense[buf_war - 1] < 0 ? 0 : a.defense[buf_war - 1]);
                        info_str_figth = "Вы нанесли урон: " + damage_to_enemy + (buf_X == 2 ? " Критический удар!" : "") + " Противник смог отразить " + str_damage_defense + " урона";
//                            str_info=str_info.concat(" " +damage_to_enemy);
//                            str_info=str_info.concat((buf_X==2?" Критический удар!":""));
//                            str_info=str_info.concat(" Противник смог отразить " +str_damage_defense + " урона");
//                            System.out.println(str_info);
                        //System.out.println("Точность: " + buf_chance);
                    } else
                        info_str_figth = "Вы промахнулись!";


                    break;

                default:
                    System.out.println("Введено неправильное значение.\nАтакуйте часть тела (1-4) \nИли совершите действие (Щит, Молотов, Зелье)");

            }

        }
        checking_the_str_swith = false;

    }
}
