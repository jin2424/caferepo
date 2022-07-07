package clerk;

import item.Items;

import java.util.HashMap;
import java.util.Map;

public class Clerk {

    public void shouldBeRun(){
        System.out.println("괜찮습니다");
    }
                     //key , value 제네릭스 사용
    private final Map<String, Items> items = new HashMap<>();
    public Clerk() {
        items.put("Coffee", new Items("Coffee",3000,"6월31일"));
        items.put("Ade", new Items("Ade",5000,"7월1일"));
        items.put("Cake", new Items("Cake",10000,"7월2일"));
    }
    public int getPrice(String food){
        if(!items.containsKey(food)){
            throw new IllegalArgumentException("없는 메뉴");
        }
        return items.get(food).getPrice();
    }

                            //int 값 없으면 error발생 ㅡ> Map을 사용해서 그런가
    public Items order(String food,int Price) {
        if(getPrice(food)!= Price){
            throw new IllegalArgumentException("주문 불가능");
        }
        if(!items.containsKey("Smoothie")){
            throw new IllegalArgumentException("판매하지 않음");
        }
        return items.get(food);
    }
}