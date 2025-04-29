package LV4;

import java.util.List;
import java.util.Scanner;

public class Kiosk {
    public void start(List<Menu> mainMenu) {
        Scanner scanner = new Scanner(System.in);  // 사용자 입력을 위한 Scanner 생성
        boolean isRunning = true;

        // 프로그램 루프 시작
        while (isRunning) {
            System.out.println("[ MAIN MENU ]");
            // 카테고리 리스트 출력
            for (int i = 0; i < mainMenu.size(); i++) {
                System.out.println((i + 1) + ". " + mainMenu.get(i).getCategoryName());
            }
            System.out.println("0. 종료");

            System.out.print("메뉴를 선택하세요: ");
            int choice = scanner.nextInt();  // 사용자 입력 받기

            if (choice == 0) {
                // 0번 선택 시 프로그램 종료
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            if (choice < 1 || choice > mainMenu.size()) {
                // 범위를 벗어난 숫자 처리
                System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
                continue;
            }

            // 선택한 Menu 가져오기
            Menu selectedMenu = mainMenu.get(choice - 1);
            System.out.println("\n[ " + selectedMenu.getCategoryName() + " MENU ]");

            // 해당 카테고리의 항목 출력
            selectedMenu.printMenuItems();
            System.out.println("0. 뒤로가기");

            System.out.print("메뉴 항목을 선택하세요: ");
            int menuItemChoice = scanner.nextInt();

            if (menuItemChoice == 0) continue;  // 뒤로가기 처리

            List<MenuItem> items = selectedMenu.getMenuItems();
            if (menuItemChoice < 1 || menuItemChoice > items.size()) {
                System.out.println("잘못된 입력입니다.");
                continue;
            }

            // 메뉴 항목 선택 및 정보 출력
            MenuItem selectedItem = items.get(menuItemChoice - 1);
            System.out.println("선택한 메뉴: " + selectedItem.getName() + " | W " + selectedItem.getPrice() + " | " + selectedItem.getDescription());
        }
    }
}
