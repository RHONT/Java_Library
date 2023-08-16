package Java_Core_Treuglov_Black_Belt.History_about_Knight.Test_Data_Time;

import java.time.*;
import java.time.format.*;

public class HW_Data_Time {
    public static void main(String[] args) {
        int zp = 0;
//        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("yyyy, MMMM-dd!!HH:mm");
//        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("HH:mm, dd/MMM/yy");
        DateTimeFormatter abr1 = DateTimeFormatter.ofPattern("dd");
        LocalDate d1 = LocalDate.of(2021, Month.NOVEMBER, 06);
        LocalDate d2 = LocalDate.of(2021, Month.DECEMBER, 31);

        Period p_work = Period.ofDays(2);
        Period p_rest = Period.ofDays(2);
        Duration d_work_hours = Duration.ofHours(8);

        System.out.println("Working days of October");

        do {

            System.out.print("__" + d1.format(abr1));
            zp += 4200;
            d1 = d1.plusDays(2);
            System.out.print("__" + d1.format(abr1));
            zp += 4200;
            d1 = d1.plus(p_work);

//            System.out.print("We work from: "+d1.format(f1) + " Until ");
//            d1=d1.plus(p_work);
//            System.out.print( d1.format(f1));
//            System.out.println();
//            d1=d1.plusDays(1);
//            System.out.print("We rest from: "+d1.format(f2) + " Until ");
//            d1=d1.plusDays(1);
//            System.out.print( d1.format(f2));
//            System.out.println();
//            d1=d1.plusDays(1);
//            System.out.println("****************");

        }
        while (d1.isBefore(d2));
        System.out.println();
        System.out.println("Estimated earnings = " + zp + " rub");
    }


}
