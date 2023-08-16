package Java_Core_Treuglov_Black_Belt.Lyamda;

import java.util.List;
import java.util.Random;
import java.util.function.Function;

public class Func {
    static double avg(List<Unit_mag> l1, Function<Unit_mag,Double> f_double) {
        double res=0;
        for (Unit_mag buf:l1) {
            res+=f_double.apply(buf);
        }
        res=res/l1.size();
        System.out.println(res);
        return res;

    }
    public static void main(String[] args) {

        List<Unit_mag> list_1=List.of(new Unit_mag(),new Unit_mag(),new Unit_mag(),new Unit_mag(),new Unit_mag());
        System.out.println(list_1);
        avg(list_1,Mag->(double)Mag.age);
        avg(list_1,Mag->(double)Mag.stupen);


    }

}

class Unit_mag{
    @Override
    public String toString() {
        return "Unit_mag{" +
                "age=" + age +
                ", stupen=" + stupen +
                '}';
    }

    int age=new Random().nextInt(80)+20;
    int stupen= new Random().nextInt(10);

    public Unit_mag() {
    }
}

