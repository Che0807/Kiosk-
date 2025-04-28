package LV2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Scanner scanner = new Scanner(System.in);

        boolean isRunning = true;

        // 첫 번째 루프에서만 메뉴 출력과 입력 처리
        while (isRunning) {
            menu.printMenu();
            System.out.println("0. 종료 | 종료");
            System.out.print("원하는 메뉴 번호를 입력하세요: ");
            int order = scanner.nextInt();

            // 종료 처리
            if (order == 0) {
                System.out.println("프로그램을 종료합니다.");
                isRunning = false;
            } else {
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
}
