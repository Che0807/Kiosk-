package LV3;

public class MenuItem {
    private int num;  // 메뉴 번호
    private String name;  // 메뉴 이름
    private double price;  // 가격
    private String description;  // 메뉴 설명

    // 생성자
    public MenuItem(int num, String name, double price, String description) {
        this.num = num;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    // getter 메서드들 (필드에 접근하기 위해 필요)
    public int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
