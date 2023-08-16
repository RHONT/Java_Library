package Java_Core_Treuglov_Black_Belt.Lyamda;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Consumer_ {

    static void burn_old_trees_and_change_name_test(ArrayList<tree> tr, Predicate<tree> pred_tree, Consumer<tree> cons_tre) {

        for (int i = 0; i < tr.size(); i++) {
            if (!pred_tree.test(tr.get(i))) {
                tr.removeIf(pred_tree.negate());
                break;
            }
        }
        tr.forEach(cons_tre);

    }

static void burn_old_trees_and_change_name(ArrayList<tree> tr, Predicate<tree> pred_tree, Consumer<tree> cons_tre) {
    for (int i=0;i<tr.size();i++) {
        if (pred_tree.test(tr.get(i)))
            cons_tre.accept(tr.get(i));
    }
}

    static void up_age_one(tree tr_tree, Consumer<tree> cons_tree){
        cons_tree.accept(tr_tree);

    }

    static void up_age_one_for_list(ArrayList <tree> array, Consumer<tree> cons_tree){
        for (int i=0;i<array.size();i++)
            cons_tree.accept(array.get(i));


    }

    static ArrayList<tree> add(tree...a) {
        ArrayList<tree> local_1=new ArrayList<>();
//        for (int i=0;i<a.length;i++)         // Тоже работает, но неудобней.
//        local_1.add(a[i]);
        for(tree f:a) local_1.add(f);
        return local_1;

    }

    public static void main(String[] args) {
        ArrayList<tree> list_1=new ArrayList<tree>();
        tree t1 = new tree(10,"a");
        tree t2 = new tree(5,"b");
        tree t3 = new tree(20,"c");
        tree t4 = new tree(1,"d");



        list_1=add(t1,t2,t3,t4);
        up_age_one(list_1.get(0),(f)->f.name="Липа");  // точечное применение консьюмера

        System.out.println(list_1);
//        for (int i=0;i<list_1.size();i++) up_age_one(list_1.get(i), (g) -> g.age++); // Прямое применение консьюмера через перебор
        up_age_one_for_list(list_1,(f)->f.age++);         // тоже работает, решил работать над всем списком сразу
        System.out.println(list_1);
//        burn_old_trees_and_change_name(list_1,((f)->f.age>10),((f)->f.name=f.name.concat("+")));  // совместил предикат для проверки и консьюмер для изменения.
//        System.out.println(list_1);
//        list_1.removeIf(f->f.age<=10);   /// удаление с предикатом
//        System.out.println(list_1);

//        burn_old_trees_and_change_name_test(list_1,((f)->f.age>10),((f)->f.name=f.name.concat("+")));  // Дерево младше возраста - сжечь и вырезать плюсик на стволе!
//        System.out.println(list_1);
        list_1.forEach(f->f.age+=10);   /// сука даже класс создавать не надо!!! То что выше делал с одним коснумером, этого можно не делать с форичем!
        System.out.println(list_1);

        // Закоментированный код рабочий.


    }
}

class tree{
    @Override
    public String toString() {
        return "tree{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    int age;
    String name;

    public tree(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
