package LV6;

public class CartItem {
    private final MenuItem item;  // 어떤 메뉴 항목이 장바구니에 담겼는지를 나타내는 MenuItem 객체
    private int quantity;         // 해당 메뉴 항목의 수량

    // 생성자: MenuItem 객체와 수량을 입력받아 장바구니 항목을 초기화
    public CartItem(MenuItem item, int quantity) {
        this.item = item;  // 메뉴 항목을 초기화
        this.quantity = quantity;  // 수량을 초기화
    }

    // getter: MenuItem 객체를 반환하는 메서드
    public MenuItem getItem() {
        return item;  // 장바구니 항목의 메뉴 정보를 반환
    }

    // getter: 수량을 반환하는 메서드
    public int getQuantity() {
        return quantity;  // 장바구니 항목의 수량 반환
    }

    // 수량을 추가하는 메서드: 특정 수량만큼 장바구니 항목의 수량을 증가시킴
    public void addQuantity(int amount) {
        this.quantity += amount;  // 수량에 amount만큼 더함
    }

    // 해당 항목의 총 가격을 계산하는 메서드: 수량 * 메뉴 가격
    public double getTotalPrice() {
        return item.getPrice() * quantity;  // 메뉴 항목의 가격 * 수량
    }

    // CartItem 객체를 출력할 때의 형식을 정의하는 메서드
    @Override
    public String toString() {
        // 장바구니 항목의 이름, 수량, 총 가격을 출력할 형식으로 반환
        return item.getName() + " - 수량: " + quantity + "개, 총 가격: " + getTotalPrice() + "원";
    }
}
