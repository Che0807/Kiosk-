package LV6;

import java.util.*;

public class Menu {
    private List<MenuItem> burgers;   // 버거 메뉴 리스트
    private List<MenuItem> drinks;    // 음료 메뉴 리스트
    private List<MenuItem> desserts;  // 디저트 메뉴 리스트

    // 생성자: 메뉴 항목들을 초기화하고 예시 메뉴 항목을 추가
    public Menu() {
        burgers = new ArrayList<>();
        drinks = new ArrayList<>();
        desserts = new ArrayList<>();

        // 예시 메뉴 항목 추가
        burgers.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgers.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgers.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgers.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        drinks.add(new MenuItem("Coca Cola", 1.5, "청량감 넘치는 콜라"));
        drinks.add(new MenuItem("Sprite", 1.5, "상큼한 스프라이트"));

        desserts.add(new MenuItem("Ice Cream", 2.0, "달콤한 바닐라 아이스크림"));
        desserts.add(new MenuItem("Apple Pie", 2.5, "따뜻한 애플파이"));
    }

    // 메뉴 출력 메서드: 카테고리에 맞는 메뉴 항목 출력
    public void printMenu(int category) {
        switch (category) {
            case 1:
                System.out.println("\n[ Burgers MENU ]");
                for (int i = 0; i < burgers.size(); i++) {
                    System.out.println((i + 1) + ". " + burgers.get(i));
                }
                break;
            case 2:
                System.out.println("\n[ Drinks MENU ]");
                for (int i = 0; i < drinks.size(); i++) {
                    System.out.println((i + 1) + ". " + drinks.get(i));
                }
                break;
            case 3:
                System.out.println("\n[ Desserts MENU ]");
                for (int i = 0; i < desserts.size(); i++) {
                    System.out.println((i + 1) + ". " + desserts.get(i));
                }
                break;
            default:
                System.out.println("잘못된 카테고리입니다.");
                break;
        }
        System.out.println("0. 뒤로가기");
    }

    // 메뉴 항목 가져오기: 카테고리와 인덱스를 통해 메뉴 항목 반환
    public MenuItem getItem(int category, int index) {
        switch (category) {
            case 1:
                return burgers.get(index);
            case 2:
                return drinks.get(index);
            case 3:
                return desserts.get(index);
            default:
                throw new IllegalArgumentException("유효하지 않은 메뉴 번호입니다.");
        }
    }
}
