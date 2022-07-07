package item;

import javax.swing.plaf.PanelUI;

public class Items {

    // 이름, 유통기한, 가격의 객체 변수
    private String name;
    private int price;
    private String exdate;

    public Items(String name, int price,String exdate){
        this.name = name;
        this.price = price;
        this.exdate = exdate;
    }
    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
    public String getExdate(){
        return exdate;
    }
}
