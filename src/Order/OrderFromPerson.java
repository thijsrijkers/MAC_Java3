package Order;

import MenuItem.Orderable;

public class OrderFromPerson {
    private Orderable orderItem;
    private OrderNumberBoard orderNumberBoard;
    private Table table;

    public OrderFromPerson(OrderNumberBoard orderNumberBoard, Table table) {
        this.orderNumberBoard = orderNumberBoard;
        this.table = table;
    }

    public Orderable getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(Orderable orderItem) {
        this.orderItem = orderItem;
    }
}
