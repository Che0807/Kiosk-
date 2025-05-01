package LV6;

public class MenuItem {
    private String name;         // 이름
    private double price;        // 가격
    private String description;  // 설명

    // 생성자
    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    // getter 메서드들
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    // toString 메서드를 오버라이드하여 메뉴 항목을 보기 좋은 형식으로 출력
    @Override
    public String toString() {
        return name + " - " + price + "원: " + description;
    }
}

