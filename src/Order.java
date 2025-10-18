
import java.util.Arrays;

public class Order {
    private String customer;
    private Product [] basket;
    public Order(String customer, Product [] basket ) {
        this.customer = customer;
        this.basket = basket;
    }

    public String getCustomer() {
        return this.customer;
    }

    public Product[] getBasket() {
        return this.basket;
    }

    @Override
    public String toString() {
        return "Order{customer=" + this.customer + ", basket=" + Arrays.toString(this.basket) + '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }

        // Сравниваем, приведение к классу Order не надо, так как выше отсеяли все другие,
        // но приходится делать чтобы не было замечаний
        Order order = (Order) o;
        if (!this.customer.equals(order.getCustomer())) {
            return false;
        }

        if (this.basket.length != order.getBasket().length) {
            return false;
        }

        // При несовпадении возвращаем false
        //1 способ - городим огород чтобы по условиям проверки выполнения задания был break,
        // хотя можно сразу вернуть false при несовпадении заказов
        boolean res = true;
        for (int i = 0; i < this.basket.length; i++) {
            if (!this.basket[i].equals(order.getBasket()[i])) {
                res = false;
                break;
            }
        }
        return res;

        //2  способ
        //  return Arrays.equals(this.basket, order.getBasket());
    }


}
