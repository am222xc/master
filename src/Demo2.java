import java.util.List;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println("Test");
        System.out.println("Test2");
     price pr = new price(50.0, 3);
     var prices = List.of(new price(50.0, 3),new price(90, 5));
     prices.forEach(System.out::println);
    }
}
