package LV4;

public class MenuItem {
    // 이름, 가격, 설명 필드 선언하여 관리
    private String name; // 메뉴 항목 이름
    private double price; // 가격
    private String description; // 설명

    // 생성자
    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    // 메뉴 항목 출력 메서드
    public void printItem(int index) {

        System.out.println(index + ". " + name + " | W " + price + " | " + description);
    }

   // 구조에 맞게 함수를 선언해놓고 가져다 사용하세요.
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
