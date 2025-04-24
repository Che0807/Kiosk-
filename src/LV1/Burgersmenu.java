package LV1;

import java.util.Scanner;

public class Burgersmenu {
    public void burgersMenu(String order) {

        switch (order) {
            case "1":
                System.out.println("ShackBurger | 토마토, 양상추, 쉑소스");
                break;
            case "2":
                System.out.println("SmokeShack | 베이컨, 체리 페퍼, 쉑소스");
                break;
            case "3":
                System.out.println("Cheeseburger | 포테이토 번, 비프패티, 치즈");
                break;
            case "4":
                System.out.println("Hamburger | 비프패티와 야채");
                break;
            default:
                throw new IllegalStateException("번호를 다시 입력해주세요: " + order);
        }
    }
}
