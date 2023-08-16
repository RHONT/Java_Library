package Java_Core_Treuglov_Black_Belt.The_Area_For_Backlite;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        File f= new File("c:\\Abrams\\area.txt");
        Scanner sc;
        float sum=0;
        int count=0;
        int count_error=0;
        {
            try {
                sc = new Scanner(f);
                while (sc.hasNext()){
//
                    String[] str=sc.next().trim().split("[*х]");
                    try {
                        sum+=(Float.parseFloat(str[0])/1000)*(Float.parseFloat(str[1])/1000);
                        System.out.println(Arrays.toString(str));
                        count++;
                    }
                    catch (NumberFormatException e){
                        //e.printStackTrace();
                        str[0]="Ошибка";
                        str[1]="Ошибка";
                        System.out.println(Arrays.toString(str));
                        count_error++;
                    }

                }
                sc.close();

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            finally {
                System.out.println("Общая площать = " + sum);
                System.out.println("Всего бэклитов = " + count);
                System.out.println("Ошибок = " + count_error);

            }
        }

    }

}
