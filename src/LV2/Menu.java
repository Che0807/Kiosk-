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
            System.out.println(item.getNum() + "." + item.getName() + "|" + " W " + item.getPrice() + "|" + item.getDescription());
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