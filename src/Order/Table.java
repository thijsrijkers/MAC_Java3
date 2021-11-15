package Order;

public class Table {
    private int tableNumber;
    private TablePosition tablePosition;

    public Table(int tableNumber, TablePosition tablePosition) {
        this.tableNumber = tableNumber;
        this.tablePosition = tablePosition;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public TablePosition getTablePosition() {
        return tablePosition;
    }
}
