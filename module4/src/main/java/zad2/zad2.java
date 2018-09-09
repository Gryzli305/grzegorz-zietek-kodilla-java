package zad2;

/*
Tym razem, w ramach zadania utrwalającego wiedzę, zajmiemy się rozwiązaniem istotnego problemu.

Wyobraź sobie sytuację, w której okazuje się, że kod napisany przez dewelopera z innej firmy przechowuje zduplikowane wartości dotyczące zamówień w sklepie internetowym. Przez to wysyłane są czasem 2 produkty zamiast 1.

Z tego co wiadomo developer użył ArrayList do przechowywania numerów zamówienia, czy jest to dobry pomysł?

Twoim zadaniem jest wykonanie własnej implementacji przechowywania numerów zamówień. Pamiętaj, aby sprawdzić, czy Twoje rozwiązanie pozwala na przechowywanie zduplikowanych wartości!
 */
import java.util.*;

class Order{
    private int orderNumber;
    private String shop;


    public Order(int orderNumber, String shop) {
        this.orderNumber = orderNumber;
        this.shop = shop;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return orderNumber == order.orderNumber &&
                Objects.equals(shop, order.shop);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderNumber);
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getShop() {
        return shop;
    }
    public String toString(){
        return orderNumber + " " + shop;
    }
}

class App{
    public static void main (String[] args) {

        Order order1 = new Order(1,"Smartphone");
        Order order2 = new Order(2,"TV");
        Order order3 = new Order(3,"Computer");
        Order order4 = new Order(2,"TV");

        System.out.println("check hash Code " + order2.hashCode());

        Set<Order> arrival = new HashSet<>();
        arrival.add(order1);
        arrival.add(order2);
        arrival.add(order3);
        arrival.add(order4);

        System.out.println(arrival);
    }
}