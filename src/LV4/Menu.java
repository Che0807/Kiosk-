package LV4;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    // MenuItem 클래스를 List로 관리하는 변수
    private String name; // 메뉴 이름 (예: "Burgers", "Drinks" 등)
    private List<MenuItem> items; // MenuItem 객체들을 저장하는 리스트

    // 생성자: 메뉴 이름을 받아서 초기화하고 items 리스트를 생성
    public Menu(String name) {
        this.name = name;
        this.items = new ArrayList<>(); // 메뉴 항목을 담을 빈 리스트를 생성
    }

    // 메뉴 이름을 반환하는 getter 메서드
    public String getName() {
        return name;
    }

    // MenuItem을 items 리스트에 추가하는 메서드
    public void addItem(MenuItem item) {
        items.add(item); // 전달받은 MenuItem 객체를 리스트에 추가
    }

    // items 리스트를 반환하는 메서드
    // 메뉴에 포함된 모든 MenuItem 객체들을 반환
    public List<MenuItem> getItems() {
        return items; // MenuItem 객체들이 담긴 리스트를 반환
    }

    // List에 들어있는 MenuItem을 순차적으로 보여주는 메서드
    // 각 MenuItem에 대해 printItem 메서드를 호출하여 출력
    public void printItems() {
        for (int i = 0; i < items.size(); i++) { // items 리스트의 크기만큼 반복
            // 각 MenuItem 객체의 printItem 메서드를 호출하고, 번호(index + 1)와 함께 출력
            items.get(i).printItem(i + 1);
        }
        // "0. 뒤로가기"를 출력하여 사용자에게 메뉴로 돌아갈 수 있는 선택지를 제공
        System.out.println("0. 뒤로가기");
    }
}
