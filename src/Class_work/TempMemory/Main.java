package Class_work.TempMemory;

public class Main {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass(10);
        System.out.println(outer);
        ChilClass child = new ChilClass(outer, "Name");
        System.out.println(child);

        General general = new General();
        System.out.println(general.getFunc1().calc(10));
        System.out.println(general.getFunc2().calc(10));
        System.out.println("=".repeat(10));

        System.out.println(general.getFunc1().sum(10, 20));
        System.out.println(general.getFunc2().sum(10, 20));

    }
}
