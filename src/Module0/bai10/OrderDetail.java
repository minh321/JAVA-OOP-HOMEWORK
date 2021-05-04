package Module0.bai10;

public class OrderDetail {
    private int quantity;
    private Product product;

    public OrderDetail(Product p, int x) {
        this.quantity = x;
        this.product = p;
    }

    public double calcTotalPrice(){
        return quantity*product.getPrice();
    }

    public int getQuantity() {
        return quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

