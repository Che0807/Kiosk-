package LV2;

public class MenuItem {
    private final int num;
    private final String name;         // 햄버거 이름
    private final double price;        // 햄버거 가격 (숫자로 변경)
    private final String description;  // 햄버거 설명

    // 생성자 - MenuItem 객체 만들 때 초기값을 설정
    public MenuItem(int num, String name, double price, String description) {
        this.num = num;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    // Getter 메서드
    public int getNum() {
        return num;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
    public String getName() {
        return name;
    }
}
