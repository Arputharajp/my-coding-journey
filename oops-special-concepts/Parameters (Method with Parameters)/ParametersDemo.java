public class ParametersDemo {
    void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        ParametersDemo obj = new ParametersDemo();
        obj.greet("Arjun");
    }
}
