package LV6;

import java.util.*;

public class Cart {
    private List<MenuItem> items;  // 장바구니에 담긴 메뉴 항목들을 저장하는 리스트

    // 생성자: 새로운 장바구니 객체를 생성하면서 items 리스트를 초기화
    public Cart() {
        items = new ArrayList<>();  // 장바구니 항목을 저장할 ArrayList 생성
    }

    // 장바구니에 메뉴 항목을 추가하는 메서드
    public void addItem(MenuItem item) {
        items.add(item);  // 입력받은 메뉴 항목을 리스트에 추가
    }

    // 장바구니 내용을 출력하는 메서드
    public void printCart() {
        if (items.isEmpty()) {  // 장바구니가 비어 있으면
            System.out.println("장바구니가 비어 있습니다.");  // 비어 있다는 메시지 출력
        } else {
            for (MenuItem item : items) {  // 장바구니에 담긴 각 메뉴 항목을 출력
                System.out.println(item);  // 메뉴 항목 출력
            }
        }
    }

    // 장바구니가 비어 있는지 확인하는 메서드
    public boolean isEmpty() {
        return items.isEmpty();  // 리스트가 비어 있으면 true 반환, 아니면 false
    }

    // 장바구니 초기화(모든 항목 삭제) 메서드
    public void clear() {
        items.clear();  // 장바구니 항목을 모두 제거
    }

    // 장바구니에 담긴 메뉴 항목들의 총 금액을 계산하는 메서드
    public double calculateTotal() {
        double total = 0;  // 총 금액을 저장할 변수
        for (MenuItem item : items) {  // 장바구니에 담긴 각 메뉴 항목을 순차적으로
            total += item.getPrice();  // 각 항목의 가격을 더함
        }
        return total;  // 총 금액 반환
    }
}
