package Class_work.TempMemory;

public abstract class AbstrClass {
    public abstract int calc(int n);

    public int sum(int start, int end) {
        return calc(start) + calc(end);
    }
}
