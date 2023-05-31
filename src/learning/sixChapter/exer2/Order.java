package learning.sixChapter.exer2;

import com.sun.org.apache.xpath.internal.operations.Equals;

import java.util.Objects;

public class Order {
    private int orderId;
    private String orderName;

    public Order(int orderId, String orderName) {
        this.orderId = orderId;
        this.orderName = orderName;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    @Override
    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Order order = (Order) o;
//        return orderId == order.orderId && Objects.equals(orderName, order.orderName);
        if(this == o){
            return true;
        }
        if(o instanceof Order){
            Order o1 = (Order)o;
            return orderId == o1.orderId && this.orderName.equals(o1.orderName);
        }
        return false;
    }

    public static void main(String[] args) {
        Order o1 = new Order(11, "A");
        Order o2 = new Order(11, "A");
        System.out.println(o1.equals(o2));
    }
}
