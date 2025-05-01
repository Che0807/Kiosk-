package LV6;

public class CartItem {
    private final MenuItem item;  // 어떤 메뉴인지
    private int quantity;   // 수량

    public CartItem(MenuItem item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    // getter & setter
    public MenuItem getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void addQuantity(int amount) {
        this.quantity += amount;
    }

    public double getTotalPrice() {
        return item.getPrice() * quantity;
    }

    @Override
    public String toString() {
        return item.getName() + " - 수량: " + quantity + "개, 총 가격: " + getTotalPrice() + "원";
    }
}


