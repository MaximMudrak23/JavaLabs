import java.time.LocalDate;
import java.util.Scanner;

public class Goods {
    private String name;
    private LocalDate release;
    private int price;
    private int quantity;
    private String ID;

    public Goods() {
        name = "Empty";
        release = LocalDate.parse("0000-00-00");
        price = 0;
        quantity = 0;
        ID = "Empty";
    }
    public Goods(String sName, LocalDate sRelease, int sPrice, int sQuantity, String sID) {
        name = sName;
        release = sRelease;
        price = sPrice;
        quantity = sQuantity;
        ID = sID;
    }

    public void setPrice(int newPrice) {
        price = newPrice;
    }
    public void setQuantity(int newQuantity) {
        quantity = newQuantity;
    }

    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }

    public void CalculatePrice()
    {
        System.out.println(price * quantity);
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", release=" + release +
                ", price=" + price +
                ", quantity=" + quantity +
                ", ID='" + ID + '\'' +
                '}';
    }
}