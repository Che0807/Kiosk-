package LV5;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        // 각 카테고리별 Menu 객체 생성 후 MenuItem 추가
        Menu burgerMenu = new Menu("Burgers");
        burgerMenu.addItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        burgerMenu.addItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        burgerMenu.addItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        burgerMenu.addItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거");

        Menu drinksMenu = new Menu("Drinks");
        drinksMenu.addItem("콜라", 2.0, "시원한 탄산음료");
        drinksMenu.addItem("레몬에이드", 2.5, "새콤달콤한 레몬에이드");

        Menu dessertsMenu = new Menu("Desserts");
        dessertsMenu.addItem("아이스크림", 3.0, "바닐라 맛 아이스크림");

        // 메인 메뉴 리스트에 모든 카테고리 추가
        List<Menu> mainMenu = new ArrayList<>();
        mainMenu.add(burgerMenu);
        mainMenu.add(drinksMenu);
        mainMenu.add(dessertsMenu);

        // Kiosk 객체 생성 및 메인 메뉴 전달하여 시작
        Kiosk kiosk = new Kiosk();
        kiosk.start(mainMenu);
    }
}
