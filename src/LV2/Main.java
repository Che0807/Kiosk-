package LV2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Scanner scanner = new Scanner(System.in);

        menu.addMenuItem(new MenuItem(1, "ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menu.addMenuItem(new MenuItem(2, "SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menu.addMenuItem(new MenuItem(3, "Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menu.addMenuItem(new MenuItem(4, "Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        while (true) {
            // 메뉴 출력
            menu.printMenu();
            System.out.println("0. 종료 | 종료");
            // 사용자 입력 받기
            System.out.print("원하는 메뉴 번호를 입력하세요: ");
            int order = scanner.nextInt();

            // 입력된 번호가 0일 경우 종료 처리
            if (order == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            // 예외 처리
            try {
                MenuItem selectedItem = menu.getMenuItem(order);  // 메뉴 항목 찾기
                System.out.println("선택한 메뉴: " + selectedItem.getName());
                System.out.println("가격: " + selectedItem.getPrice() + "W");
                System.out.println("설명: " + selectedItem.getDescription());
            } catch (IllegalStateException e) {
                System.out.println(e.getMessage());  // 예외 메시지 출력
            }
        }
    }
}