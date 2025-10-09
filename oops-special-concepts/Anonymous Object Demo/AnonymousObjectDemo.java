public class AnonymousObjectDemo {
    void display() {
        System.out.println("This method is called using an anonymous object.");
    }

    public static void main(String[] args) {
        // Anonymous object: no variable reference
        new AnonymousObjectDemo().display();
    }
}
