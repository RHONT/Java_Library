package Java_Core_Treuglov_Black_Belt.Tests_lyamda_HW;

import java.util.ArrayList;
import java.util.function.Predicate;

public class TestsEmploye {
    static void print_employe(Employe e1) {
        System.out.println(e1.name + " || " + e1.department + " || " + e1.salary);
    }

    static void filtr_employe(ArrayList<Employe> list_filtr, Predicate<Employe> T) {
        for (Employe R2D2 : list_filtr) {
            if (T.test(R2D2)) print_employe(R2D2);
        }
    }

    static Employe create_employe(String name, String department, double salary) {
        Employe e1 = new Employe(name, department, salary);
        return e1;
    }

    public static void main(String[] args) {

        ArrayList<Employe> spisok_1 = new ArrayList<>();
        spisok_1.add(create_employe("Василий", "Бухгалтерия", 90000));
        spisok_1.add(create_employe("Елена", "Отдел продаж", 55000));
        spisok_1.add(create_employe("Генадий", "Бухгалтерия", 140000));
        spisok_1.add(create_employe("Петр", "Отдел продаж", 200000));
        spisok_1.add(create_employe("Игнат", "Бухгалтерия", 65000));
        spisok_1.add(create_employe("Сергей", "Отдел продаж", 98000));
        spisok_1.add(create_employe("Алексей", "Бухгалтерия", 135000));
        spisok_1.add(create_employe("Мария", "Отдел продаж", 110000));
        spisok_1.add(create_employe("Ангелина", "Ангелина", 110000));

        filtr_employe(spisok_1, Z -> Z.salary > 100000 && Z.department.equals("Отдел продаж"));
        filtr_employe(spisok_1, Z -> Z.department.equals(Z.name));
        filtr_employe(spisok_1, Z -> Z.name.startsWith("А"));


    }

}

class Employe {
    String name;
    String department;
    double salary;

    Employe(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

}
