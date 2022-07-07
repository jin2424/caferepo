import clerk.Clerk;
import item.Items;

public class Main {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();

        // 커피 가격 요청 -> 커피 가격 획득
                          //객체.메소드
        int coffeePrice = clerk.getPrice("Coffee"); // 메소드 호출
        System.out.println(coffeePrice);
        // 커피 주문 -> 커피 획득
        Items coffee = clerk.order("Coffee", coffeePrice);
        System.out.println("이름: "+coffee.getName()+" "+ "가격: "+coffee.getPrice()+" "+ "유통기한: "+coffee.getExdate());

        // 커피 주문 (돈 부족) -> 예외 발생
        try {
            clerk.order("Coffee", coffeePrice - 1000);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        // 스무디 가격 요청 (판매하지 않는 메뉴) -> 예외 발생
        try {
            clerk.getPrice("Smoothie");
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        // 스무디 가격 요청 (판매하지 않는 메뉴) -> 예외 발생
        try {
            clerk.order("Smoothie", 1000);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            break;
        }finally {
            clerk.shouldBeRun();
        }
    }
}