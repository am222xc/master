import java.util.List;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println("Test");
        System.out.println("Test2");
        price pr = new price(50.0, 3, "A");
        var prices = List.of(new price(50.0, 3, "B"), new price(90, 5, "C"));
        prices.forEach(System.out::println);
    }
}
