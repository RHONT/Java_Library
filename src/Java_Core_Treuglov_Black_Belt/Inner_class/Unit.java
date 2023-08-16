package Java_Core_Treuglov_Black_Belt.Inner_class;

public class Unit {

    int a;
    public void setNewDef(Defense set, Defense.Head h1, Defense.Torso t1) {
        this.set = set;
        this.h1=h1;
        this.t1=t1;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "name='" + name + '\'' +
                ", set=" + set +
                ", h1=" + h1 +
                ", t1=" + t1 +
                '}';
    }

    String name;
    Defense set;
    Defense.Head h1;
    Defense.Torso t1;

    public Unit(String name,String name_set, int endur_h, int endur_t) {
        this.set = new Defense(name_set);
        this.name = name;
        this.h1 = this.set.new Head("1",endur_h);
        this.t1 = this.set.new Torso("1",endur_t );
    }

    class Defense {
        String name_set;

        @Override
        public String toString() {
            return "Defense{" +
                    "name_set='" + name_set + '\'' +
                    '}';
        }

        public Defense(String name_set) {
            this.name_set = name_set;
        }

        class Head extends Defense {
            @Override
            public String toString() {
                return "Head{" +
                        "endurance=" + endurance +
                        '}';
            }

            int endurance;

            public Head(String name_set, int endurance) {
                super(name_set);
                this.endurance = endurance;
            }

            public void setEndurance(int endurance) {
                this.endurance = endurance;
            }

            public int getEndurance() {
                return endurance;
            }

            void abc(){
                System.out.println("Шапка заискрилась!");
            }
        }
        class Torso extends Defense {
            @Override
            public String toString() {
                return "Torso{" +
                        "endurance=" + endurance +
                        '}';
            }

            int endurance;

            public Torso(String name_set, int endurance) {
                super(name_set);
                this.endurance = endurance;
            }

            public int getEndurance() {
                return endurance;
            }

            public void setEndurance(int endurance) {
                this.endurance = endurance;
                a+=10;
            }
        }
    }

    public static void main(String[] args) {
        Unit u1= new Unit("Василий","Стремительный",100,200);
        System.out.println(u1);
        u1.set.name_set="Отчаянный";
        System.out.println(u1);
        Defense set_2 = u1.new Defense("Прикованный");
        Defense.Head h2=set_2.new Head("Шапка залупка",5000);
        Defense.Torso t2=set_2.new Torso("Тряпки",10000);

        Defense set_3 = u1.new Defense("Прикованный");
        Defense.Head h3=set_2.new Head("Шапка залупка",5);
        Defense.Torso t3=set_3.new Torso("Тряпки",5);


        u1.setNewDef(set_2,h2,t3);
        System.out.println(u1);
        u1.h1.abc();






        System.out.println(u1.set.name_set);


    }

}
