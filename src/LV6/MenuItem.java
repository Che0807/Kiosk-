package LV6;

public class MenuItem {
    private String name;         // 메뉴 이름
    private double price;        // 메뉴 가격
    private String description;  // 메뉴 설명

    // 생성자: 메뉴 이름, 가격, 설명을 입력받아 MenuItem 객체를 초기화
    public MenuItem(String name, double price, String description) {
        this.name = name;        // 메뉴 이름을 초기화
        this.price = price;      // 메뉴 가격을 초기화
        this.description = description;  // 메뉴 설명을 초기화
    }

    // getter: 메뉴 이름을 반환하는 메서드
    public String getName() {
        return name;  // 메뉴 이름 반환
    }

    public double getPrice() {
        return price;  // 메뉴 가격 반환
    }

    // 메뉴 항목을 출력할 때의 형식을 정의하는 메서드
    @Override
    public String toString() {
        // 메뉴 이름, 가격, 설명을 출력할 형식으로 반환
        return name + " | W " + price + " | " + description;
    }
}
