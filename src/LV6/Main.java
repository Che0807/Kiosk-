package LV6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // 사용자 입력을 받기 위한 스캐너 객체
        Menu menu = new Menu();  // 메뉴 객체 생성
        Cart cart = new Cart();  // 장바구니 객체 생성
        boolean isRunning = true;  // 프로그램 실행 여부를 나타내는 변수

        while (isRunning) {
            // 첫 번째 메뉴 출력: 카테고리 선택 (버거, 음료, 디저트, 종료)
            System.out.println("\n[ MAIN MENU ]");
            System.out.println("1. Burgers");
            System.out.println("2. Drinks");
            System.out.println("3. Desserts");
            System.out.println("0. 종료");

            // 카테고리 번호 입력 받기
            System.out.print("카테고리 번호 입력 (종료: 0): ");
            int categoryNumber = sc.nextInt();  // 카테고리 번호 입력
            if (categoryNumber == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;  // 종료 조건
            }

            // 선택한 카테고리 출력
            menu.printMenu(categoryNumber);

            // 메뉴 항목 번호 입력 받기
            System.out.print("메뉴 항목 번호 입력: ");
            int menuItemIndex = sc.nextInt();  // 메뉴 항목 번호 입력

            try {
                // 선택한 메뉴 항목을 가져오기
                MenuItem selectedItem = menu.getItem(categoryNumber, menuItemIndex - 1);  // 메뉴 항목 가져오기
                System.out.println("선택한 메뉴: " + selectedItem.getName());

                // 장바구니에 추가할 것인지 묻기
                System.out.print("장바구니에 추가하시겠습니까? (y/n): ");
                String confirm = sc.next();  // y/n 입력 받기

                if (confirm.equalsIgnoreCase("y")) {
                    cart.addItem(selectedItem);  // 장바구니에 메뉴 항목 추가
                    System.out.println("장바구니에 추가되었습니다.");
                }

                // 장바구니가 비어 있지 않으면 주문 메뉴를 출력
                if (!cart.isEmpty()) {
                    System.out.println("\n[ ORDER MENU ]");
                    System.out.println("4. Orders       | 장바구니를 확인 후 주문합니다.");
                    System.out.println("5. Cancel       | 진행중인 주문을 취소합니다.");
                    System.out.print("메뉴 번호 입력: ");
                    int orderOption = sc.nextInt();  // 주문 옵션 선택

                    switch (orderOption) {
                        case 4:
                            // 주문하기
                            System.out.println("\n[ Orders ]");
                            cart.printCart();  // 장바구니 내용 출력
                            System.out.println("[ Total ]");
                            System.out.println("W " + cart.calculateTotal() + "\n");  // 총 금액 계산하여 출력

                            System.out.print("1. 주문      2. 메뉴판\n");
                            int confirmOrder = sc.nextInt();  // 주문 확인 또는 메뉴판으로 돌아가기
                            if (confirmOrder == 1) {
                                System.out.println("주문이 완료되었습니다. 금액은 W " + cart.calculateTotal() + " 입니다.");
                                cart.clear();  // 주문 후 장바구니 초기화
                            }
                            break;

                        case 5:
                            // 주문 취소
                            System.out.println("진행 중인 주문이 취소되었습니다.");
                            cart.clear();  // 취소 시 장바구니 초기화
                            break;

                        default:
                            System.out.println("잘못된 선택입니다.");
                            break;
                    }
                }

            } catch (IllegalArgumentException e) {
                // 잘못된 메뉴 선택 시 예외 처리
                System.out.println("잘못된 메뉴 선택입니다.");
            }
        }

        sc.close();  // 스캐너 객체 닫기
    }
}
