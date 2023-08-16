package Java_Core_Treuglov_Black_Belt.Test_OOP_1_Home_Work.Student;

public class Student {

    private StringBuilder name;
    private int grade;
    private int course;

    public Student() {
        this.name = new StringBuilder("Имя не указано");
        this.grade = 0;
        this.course = 0;
    }

    public void getName() {
        StringBuilder tempstr = new StringBuilder(this.name);
        System.out.println(tempstr);
    }

    public void setName(String name) {
        if (name.length() > 2) {
            this.name = new StringBuilder(name);
        } else {
            this.name = new StringBuilder("Имя должно содержать более 2 симоволов");
        }
    }

    public void getGrade() {
        int tempgrade = this.grade;
        System.out.println(tempgrade);
    }

    public void setGrade(int grade) {
        if ((grade > 0) && (grade < 11)) {
            this.grade = grade;
        }
    }

    public void getCourse() {
        int tempcourse = this.course;
        System.out.println(tempcourse);
    }

    public void setCourse(int course) {
        if (course > 0 && course < 5) {
            this.course = course;
        }

    }

    public void showInfo() {
        getName();
        if (this.course == 0) {
            System.out.println("Курс не указан");
        } else {
            getCourse();
        }
        if (this.grade == 0) {
            System.out.println("Средний бал не указан");
        } else {
            getGrade();
        }
        System.out.println();

    }

}

