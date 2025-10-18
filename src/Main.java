//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//1
        Product product1 = new Product(1, "Первый продукт", 100, "Автозапчасти");
        Product product2 = new Product(2, "Второй продукт", 200, "Товары для рыбалки");
        Product product3 = new Product(3, "Третий продукт", 300, "Автозапчасти");


        String msg = "Продукты " + product1.getName() + "," + product2.getName() + " ";
        msg += product1.equals(product2) ? "равны" : "не равны";
        System.out.println(msg);

        msg = "Продукты " + product1.getName() + "," + product3.getName() + " ";
        msg += product1.equals(product3) ? "равны" : "не равны";
        System.out.println(msg);

        msg = "Продукты " + product2.getName() + "," + product3.getName() + " ";
        msg += product2.equals(product3) ? "равны" : "не равны";
        System.out.println(msg);

//2
        Product[] basket1 = {product1, product2};
        Product[] basket2 = {product2, product3};
        Product[] basket3 = {product2, product3};
        Order order1 = new Order("Первый покупатель", basket1);
        Order order2 = new Order("Второй покупатель", basket2);
        Order order3 = new Order("Второй покупатель", basket3);

       // boolean m = Arrays.equals(basket2, basket3);
       // System.out.println(m);

        System.out.println("Первый заказ " + order1.toString());
        System.out.println("Второй заказ " + order2.toString());
        System.out.println("Третий заказ " + order3.toString());

        msg = "Заказы первый и второй ";
        msg += order1.equals(order2) ? "равны" : "не равны";
        System.out.println(msg);

        msg = "Заказы первый и третий ";
        msg += order1.equals(order3) ? "равны" : "не равны";
        System.out.println(msg);

        msg = "Заказы второй и третий ";
        msg += order2.equals(order3) ? "равны" : "не равны";
        System.out.println(msg);

    }
}