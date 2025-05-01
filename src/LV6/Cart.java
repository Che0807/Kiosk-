package LV6;

import java.util.*;

public class Cart {
    private List<CartItem> items;

    public Cart() {
        this.items = new ArrayList<>();
    }

    public void addItem(MenuItem menuItem) {
        for (CartItem item : items) {
            if (item.getItem().getName().equals(menuItem.getName())) {
                item.addQuantity(1); // 수량만 증가
                return;
            }
        }
        items.add(new CartItem(menuItem, 1)); // 새로운 항목 추가
    }

    public void printCart() {
        if (items.isEmpty()) {
            System.out.println("장바구니가 비어 있습니다.");
            return;
        }

        System.out.println("현재 장바구니:");
        for (CartItem item : items) {
            System.out.println("- " + item);
        }
        System.out.println("총합: " + getTotalPrice() + "원");
    }

    public double getTotalPrice() {
        double total = 0;
        for (CartItem item : items) {
            total += item.getTotalPrice();
        }
        return total;
    }

    public void clear() {
        items.clear();
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }
}
