package LV6;

import java.util.*;

public class Menu {
    private List<MenuItem> burgers;
    private List<MenuItem> drinks;
    private List<MenuItem> desserts;

    public Menu() {
        burgers = new ArrayList<>();
        drinks = new ArrayList<>();
        desserts = new ArrayList<>();

        // 메뉴 추가
        burgers.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgers.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgers.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgers.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
        drinks.add(new MenuItem("콜라", 1500, "톡 쏘는 청량감"));
        drinks.add(new MenuItem("레몬에이드", 2.5, "새콤달콤한 레몬에이드"));
        desserts.add(new MenuItem("아이스크림", 2000, "달콤한 바닐라 아이스크림"));
    }

    public void printMenu(int categoryNumber) {
        List<MenuItem> items = getMenuListByCategory(categoryNumber);
        if (items == null) {
            System.out.println("잘못된 메뉴 카테고리입니다.");
            return;
        }

        System.out.println("[ MENU ]");
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ". " + items.get(i));
        }
    }

    public MenuItem getItem(int categoryNumber, int index) {
        List<MenuItem> items = getMenuListByCategory(categoryNumber);
        if (items == null || index < 0 || index >= items.size()) {
            throw new IllegalArgumentException("유효하지 않은 메뉴 선택입니다.");
        }
        return items.get(index);
    }

    private List<MenuItem> getMenuListByCategory(int categoryNumber) {
        if (categoryNumber == 1) return burgers;
        else if (categoryNumber == 2) return drinks;
        else if (categoryNumber == 3) return desserts;
        else return null;
    }
}
