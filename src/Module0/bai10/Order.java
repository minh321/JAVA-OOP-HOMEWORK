package Module0.bai10;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;

public class Order {
    private int orderID;
    private LocalDate orderDate;
    private ArrayList<OrderDetail> lineItems;
    private int count;
    public void addLineItem(Product p,int x){
        lineItems.add(new OrderDetail(p,x));
    }
    public double calcTotalCharge(){
        double total =0;
        for (OrderDetail order: getLineItems()){
            double subTotal = order.getQuantity()*order.getProduct().getPrice();
            total += subTotal;
        }
        return total;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderID=" + orderID +
                ", orderDate=" + orderDate +
                ", lineItems=" + lineItems +
                ", count=" + count +
                '}';
    }

    public Order(int orderID, LocalDate orderDate) {
        this.orderID = orderID;
        this.orderDate = orderDate;
    }

    public int getOrderID() {
        return orderID;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public ArrayList<OrderDetail> getLineItems() {
        return lineItems;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }
}
