public class StaticBlockDemo {
    static {
        System.out.println("Static block executed first when class loads.");
    }

    public static void main(String[] args) {
        System.out.println("Main method executed.");
    }
}
