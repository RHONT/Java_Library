package Class_work.TempMemory;

public class General {

    private class Func1 extends AbstrClass {

        public int calc(int n) {
            return n * n;
        }
    }

    private class Func2 extends AbstrClass {

        public int calc(int n) {
            return n * n * n;
        }
    }

    public AbstrClass getFunc1() {
        return new Func1();
    }

    public AbstrClass getFunc2() {
        return new Func2();
    }

}
