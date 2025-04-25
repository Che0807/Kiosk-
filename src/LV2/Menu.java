package LV2;

import java.util.*;

public class Menu {
    private List<MenuItem> menuItems;  // 메뉴 항목을 저장할 리스트

    // 생성자 - 메뉴 항목 리스트 초기화
    public Menu() {
        menuItems = new ArrayList<>();  // 메뉴 항목 리스트 초기화
    }

    // 메뉴 항목 추가 메서드
    public void addMenuItem(MenuItem item) {
        menuItems.add(item);
    }

    // 메뉴 항목 출력 메서드
    public void printMenu() {
        System.out.println("[ SHAKESHACK MENU ]");
        for (MenuItem item : menuItems) {
            System.out.println(item.getNum() + "." + item.getName() + "|" + item.getPrice() + "|" + item.getDescription());
        }
        System.out.println("=================");
    }
}
