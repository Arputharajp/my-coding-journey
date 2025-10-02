public class NamelessBlockDemo {
    // Instance initializer block (nameless block)
    {
        System.out.println("This is a nameless block (runs before constructor).");
    }

    NamelessBlockDemo() {
        System.out.println("Constructor executed.");
    }

    public static void main(String[] args) {
        new NamelessBlockDemo();
    }
}
