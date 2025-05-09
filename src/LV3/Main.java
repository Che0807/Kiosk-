package LV3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 메뉴 항목들을 저장할 ArrayList
        ArrayList<MenuItem> menuItems = new ArrayList<>();

        // 메뉴 항목 추가
        menuItems.add(new MenuItem(1, "ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem(2, "SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem(3, "Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem(4, "Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        // Kiosk 객체 생성
        Kiosk kiosk = new Kiosk(menuItems);

        // Kiosk 프로그램 시작
        kiosk.start();
    }
}
