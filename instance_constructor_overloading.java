class Base {
    int x = 0;

    Base() {
        System.out.println("Constructor of BASE class");
    }

    Base(int s) {
        System.out.println("Overloaded constructor of base class");
    }
}

class Dervied extends Base {

    Dervied() {
        super(11);
        System.out.println(x);
    }
}

class Main {
    public static void main(String[] dfdg) {
        Dervied d = new Dervied();
    }
}
