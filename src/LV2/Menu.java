package LV2;

import java.util.*;

public class Menu {
    private List<MenuItem> menuItems;  // 메뉴 항목을 저장할 리스트

    // 생성자 - 메뉴 항목 리스트 초기화 + 메뉴 아이템 추가
    public Menu() {
        menuItems = new ArrayList<>();  // 리스트 초기화

        menuItems.add(new MenuItem(1, "ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem(2, "SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem(3, "Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem(4, "Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
    }

    // 메뉴 항목 추가 메서드 (추가적인 메뉴 삽입용)
    public void addMenuItem(MenuItem item) {
        menuItems.add(item);
    }

    // 메뉴 항목 출력 메서드
    public void printMenu() {
        System.out.println("[ SHAKESHACK MENU ]");
        for (MenuItem item : menuItems) {
            System.out.println(item.getNum() + "." + item.getName() + " | W " + item.getPrice() + " | " + item.getDescription());
        }
    }

    // 메뉴 번호에 해당하는 항목을 가져오는 메서드
    public MenuItem getMenuItem(int order) {
        for (MenuItem item : menuItems) {
            if (item.getNum() == order) {
                return item;  // 해당 메뉴를 찾으면 반환
            }
        }
        throw new IllegalStateException("잘못된 메뉴 번호입니다.");
    }
}
