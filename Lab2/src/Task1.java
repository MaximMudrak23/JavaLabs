import java.util.Scanner;
class Goods
{
    String Name;
    int CreateData;
    int Price;
    int Count;
    int ID;
    Goods()
    {
        Name = "Empty";
        CreateData = 0;
        Price = 0;
        Count = 0;
        ID = 0;
    }
    void GoodsInfo()
    {
        System.out.println("Name: " + Name);
        System.out.println("CreateData: " + CreateData);
        System.out.println("Price: " + Price);
        System.out.println("Count: " + Count);
        System.out.println("ID: " + ID);
    }
    void Deploy()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Name: ");
        Name = in.nextLine();
        System.out.print("CreateData: ");
        CreateData = in.nextInt();
        System.out.print("Price: ");
        Price = in.nextInt();
        System.out.print("Count: ");
        Count = in.nextInt();
        System.out.print("ID: ");
        ID = in.nextInt();
    }
    void ChangePrice()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("New price: ");
        Price = in.nextInt();
    }
    void ChangeCount()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("New count: ");
        Count = in.nextInt();
    }
    void CalculatePrice()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("How much you want to buy: ");
        int Cart = in.nextInt();
        int Sum = 0;
        for (int i = 0; i < Cart; i++)
        {
            Sum += Price;
        }
        System.out.print("Price is: " + Sum);
    }
}

public class Task1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("How many goods: ");
        int HowManyGoods = in.nextInt();

        Goods[] AllGoods = new Goods[HowManyGoods];

        for (int i = 0; i < HowManyGoods; i++)
        {
            AllGoods[i] = new Goods();
            AllGoods[i].Deploy();
        }

        while (true)
        {
            System.out.println("Which one goods you want to see:");
            for (int i = 0; i < HowManyGoods; i++)
            {
                System.out.println(i + " " + AllGoods[i].Name);
            }
            System.out.print("Enter: ");
            int index = in.nextInt();

            System.out.println("What you want to do:");
            System.out.println("1 - Watch");
            System.out.println("2 - Change Price");
            System.out.println("3 - Change Count");
            System.out.println("4 - Buy this one");
            System.out.println("5 - Exit");
            System.out.print("Enter: ");
            int enter = in.nextInt();

            if (enter == 1)
            {
                AllGoods[index].GoodsInfo();
            }
            if (enter == 2)
            {
                AllGoods[index].ChangePrice();
            }
            if (enter == 3)
            {
                AllGoods[index].ChangeCount();
            }
            if (enter == 4)
            {
                AllGoods[index].CalculatePrice();
            }
            if (enter == 5)
            {
                break;
            }
        }
    }
}
