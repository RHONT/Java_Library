package Java_Core_Treuglov_Black_Belt.Test_OOP_1_Home_Work.TestStudent;

import Java_Core_Treuglov_Black_Belt.Test_OOP_1_Home_Work.Student.Student;

public class Student_Test extends Student {
    public static void main(String[] args) {
        //Student st1 = new Student();
        //st1.showInfo();

        //Student st2 = new Student();
        //st2.showInfo();

        Student st3 = new Student();
        st3.setName("Ви");
        st3.setCourse(50);
        st3.setGrade(5);
        st3.showInfo();

        st3.setName("Виа");
        st3.setCourse(2);
        st3.setGrade(10);
        st3.showInfo();


    }
}
