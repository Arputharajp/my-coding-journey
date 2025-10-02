public class PrintWithoutMain {
    static {
        System.out.println("Printed without main method using static block.");
        System.exit(0); // stop program so it doesn't look for main()
    }
}
