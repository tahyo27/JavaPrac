package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[5];
        orders[0] = ProductOrder.createOrder("새우깡", 1000, 1);
        orders[0].printOrder();
    }
}
