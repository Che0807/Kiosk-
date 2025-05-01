package LV6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        Cart cart = new Cart();

        while (true) {
            System.out.println("\n메뉴를 선택하세요:");
            menu.printMenu(1);  // 버거 카테고리 메뉴 출력
            menu.printMenu(2);  // 음료 카테고리 메뉴 출력
            menu.printMenu(3);  // 디저트 카테고리 메뉴 출력

            System.out.print("메뉴 번호 입력 (종료: 0): ");
            int categoryNumber = sc.nextInt(); // 카테고리 번호 입력
            if (categoryNumber == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("메뉴 항목 번호 입력: ");
            int menuItemIndex = sc.nextInt(); // 메뉴 항목 번호 입력

            try {
                MenuItem selectedItem = menu.getItem(categoryNumber, menuItemIndex - 1);  // 메뉴 항목 가져오기
                System.out.println("선택한 메뉴: " + selectedItem.getName());

                System.out.print("장바구니에 추가하시겠습니까? (y/n): ");
                String confirm = sc.next();

                if (confirm.equalsIgnoreCase("y")) {
                    cart.addItem(selectedItem);
                    System.out.println("장바구니에 추가되었습니다.");
                }

                System.out.print("장바구니를 확인하시겠습니까? (y/n): ");
                String viewCart = sc.next();
                if (viewCart.equalsIgnoreCase("y")) {
                    cart.printCart();
                }

                System.out.print("주문하시겠습니까? (y/n): ");
                String order = sc.next();
                if (order.equalsIgnoreCase("y")) {
                    if (cart.isEmpty()) {
                        System.out.println("장바구니가 비어 있습니다. 주문할 수 없습니다.");
                    } else {
                        cart.printCart();
                        System.out.println("🧾 주문이 완료되었습니다. 감사합니다!");
                        cart.clear();  // 주문 후 장바구니 초기화
                    }
                }

            } catch (IllegalArgumentException e) {
                System.out.println("잘못된 메뉴 선택입니다.");
            }
        }

        sc.close();
    }
}