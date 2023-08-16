package Java_Core_Treuglov_Black_Belt.Exception;

public class HW {
    public static void main(String[] args) {
        Tiger t1 = new Tiger();

        try {
            t1.eat("Meat");
        } catch (RuntimeException r) {
            System.out.println(r.getMessage());
        } finally {
            System.out.println("Fed the tiger?");
        }

        System.out.println("***********");

        try {
            t1.drink("Water");
            try {
                t1.drink("Pivo");
            } catch (NeVoda e) {
                System.out.println(e.getMessage());
            }
        } catch (Exception e1) {
            System.out.println(e1.getMessage());
        } finally {
            System.out.println("This is inner finally block");
        }
    }
}

class NeMyaso extends RuntimeException {
    NeMyaso(String str) {
        super(str);
    }

}

class NeVoda extends Exception {
    NeVoda(String str) {
        super(str);
    }

}

class Tiger {
    void eat(String str) throws NeMyaso {
        if (!str.equals("Meat")) {
            throw new NeMyaso("Tigr not eat " + str);
        } else {
            System.out.println("Tiger eat " + str);
        }
    }

    void drink(String str) throws NeVoda {
        if (!str.equals("Water")) {
            throw new NeVoda("Tigr not drink " + str);
        } else {
            System.out.println("Tiger drink " + str);
        }
    }
}
