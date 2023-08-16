package Class_work.TempMemory;

public class OuterClass {
    private int id;

    public OuterClass(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "[" + id + "]";
    }

    public class InnerClass {
        private String name;

        public InnerClass(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "(" + name + ")" + " and id=" + OuterClass.this;
        }
    }

    public class AnotherClass {
        private int anotherId;

        public AnotherClass(int anotherId) {
            this.anotherId = anotherId;
        }

        public String toString() {
            return "(" + anotherId + ")" + " and id=" + OuterClass.this;
        }
    }
}
