package LV5;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String categoryName;         // 메뉴 카테고리 이름
    private List<MenuItem> menuItems;    // 해당 카테고리의 메뉴 항목들

    public Menu(String categoryName) {
        this.categoryName = categoryName;
        this.menuItems = new ArrayList<>();
    }

    // 메뉴 항목 추가 메서드 (객체 내부에서 MenuItem 생성)
    public void addItem(String name, double price, String description) {
        menuItems.add(new MenuItem(name, price, description));
    }

    // 카테고리 이름 반환
    public String getCategoryName() {
        return categoryName;
    }

    // 메뉴 항목들을 순차적으로 출력
    public void printMenuItems() {
        for (int i = 0; i < menuItems.size(); i++) {
            menuItems.get(i).printItem(i + 1);
        }
    }

    // 메뉴 항목 리스트 반환
    public List<MenuItem> getMenuItems() {
        return menuItems;
    }
}
