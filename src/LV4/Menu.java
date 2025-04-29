package LV4;
import java.util.List;

public class Menu {
    private String categoryName; // 메뉴 카테고리 이름 (예: Burgers, Drinks 등)
    private List<MenuItem> menuItems; // 메뉴 항목 리스트

    // 생성자
    public Menu(String categoryName, List<MenuItem> menuItems) {
        this.categoryName = categoryName; // 카테고리 이름 초기화
        this.menuItems = menuItems; // 메뉴 항목 리스트 초기화
    }

    // 메뉴 카테고리 이름 반환
    public String getCategoryName() {
        return categoryName; // 카테고리 이름 반환
    }

    // 메뉴 항목 출력
    public void printMenuItems() {
        // 메뉴 항목들을 순차적으로 출력하는 반복문
        for (int i = 0; i < menuItems.size(); i++) {
            menuItems.get(i).printItem(i + 1); // 각 메뉴 항목을 출력 (1부터 시작)
        }
    }

    // 메뉴 항목 반환
    public List<MenuItem> getMenuItems() {
        return menuItems; // 메뉴 항목 리스트 반환
    }
}
