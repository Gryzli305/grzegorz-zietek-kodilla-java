package food2Door;

public class Order {

    private Client client;
    private String product;
    private int quantity;

    public Order(Client client, String product, int quantity) {
        this.client = client;
        this.product = product;
        this.quantity = quantity;
    }

    public Client getClient() {
        return client;
    }
    public String getProduct() {
        return product;
    }
    public int quantity() {
        return quantity;
    }
}