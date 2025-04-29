package LV4;

public class MenuItem {

    // 이름, 가격, 설명 필드 선언하여 관리

    private String name;
    private int price;
    private String description;

    public MenuItem(String name, int price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    // 구조에 맞게 함수를 선언해놓고 가져다 사용하세요.

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
