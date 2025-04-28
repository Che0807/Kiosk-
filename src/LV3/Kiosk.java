package LV3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private List<MenuItem> menuItems;

    public Kiosk(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            // 메뉴 출력
            System.out.println("[ SHAKE SHACK MENU ]");
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
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    // 메뉴 번호로 메뉴 항목을 찾는 메서드
    private MenuItem findMenuItem(int order) {
        for (MenuItem item : menuItems) {
            if (item.getNum() == order) {
                return item;  // 해당 메뉴를 찾으면 반환
            }
        }
        throw new IllegalStateException("잘못된 메뉴 번호입니다.");
    }
}