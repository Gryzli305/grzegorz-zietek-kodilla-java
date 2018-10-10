package patterns.challenges;

public class Application {

    public static void main(String[] args) {
        OrderRequestRetriver orderRequestRetriver = new OrderRequestRetriver();
        OrderRequest orderRequest = orderRequestRetriver.order();

        ProductOrderService productOrderService = new ProductOrderService(new MailService(), new OrderService(), new OrderRespository());
    }
}
