package class1.ex;

public class ProductOrder {
    String productName;
    int price;
    int quantity;

    public static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }
    public void printOrder()
    {
        System.out.println("상품명: " + productName + ", 가격: " + price + ", 수량: " + quantity);
    }
}
