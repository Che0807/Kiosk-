package LV2;

public class MenuItem {
    String name;         // 햄버거 이름
    int price;           // 햄버거 가격
    String description;  // 햄버거 설명

    // 생성자 - MenuItem 객체 만들 때 초기값을 설정
    public MenuItem(String name, int price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }
}

