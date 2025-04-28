package LV3;

import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private List<MenuItem> menuItems;  // 메뉴 항목들을 저장할 리스트

    // 생성자 - 메뉴 아이템 리스트를 초기화
    public Kiosk(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    // 프로그램 시작 메서드
    public void start() {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            // 메뉴 출력
            System.out.println("[ SHAKESHACK MENU ]");
            for (MenuItem item : menuItems) {
                System.out.println(item.getNum() + ". " + item.getName() + " | W " + item.getPrice() + " | " + item.getDescription());
            }
            System.out.println("0. 종료");

            // 사용자 입력
            System.out.print("원하는 메뉴 번호를 입력하세요: ");
            int order = scanner.nextInt();

            if (order == 0) {
                System.out.println("프로그램을 종료합니다.");
                isRunning = false;
            } else {
                try {
                    // 입력한 번호에 해당하는 메뉴 찾기
                    MenuItem selectedItem = findMenuItem(order);
                    System.out.println("선택한 메뉴: " + selectedItem.getName());
                    System.out.println("가격: " + selectedItem.getPrice() + "W");
                    System.out.println("설명: " + selectedItem.getDescription());
                } catch (IllegalStateException e) {
                    System.out.println(e.getMessage());  // 잘못된 메뉴 번호일 경우 예외 메시지 출력
                }
            }
        }
    }
}

