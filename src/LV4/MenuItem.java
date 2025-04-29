package LV4;

public class MenuItem {
    private String name;          // 메뉴 이름
    private double price;         // 가격
    private String description;   // 설명

    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    // 메뉴 항목 출력 형식 지정
    public void printItem(int index) {
        System.out.println(index + ". " + name + " | W " + price + " | " + description);
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
}
