import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Java Lab 2 ");

        Scanner in = new Scanner(System.in);

        System.out.println("Which one Task?:");
        System.out.println("1 - Goods");
        System.out.println("2 - Rectangle");
        System.out.println("3 - Baloon");
        System.out.print("Enter: ");
        int task = in.nextInt();

        if (task == 1)
        {
            ArrayList<Goods> AllGoods = new ArrayList<>();

            LocalDate date1 = LocalDate.of(2000, 4, 20);
            Goods game1 = new Goods("Team Fortress 2", date1, 150, 1000, "00001");
            AllGoods.add(game1);

            LocalDate date2 = LocalDate.of(2012, 7, 13);
            Goods game2 = new Goods("Last of Us", date2, 250, 5000, "00002");
            AllGoods.add(game2);

            LocalDate date3 = LocalDate.of(2077, 10, 30);
            Goods game3 = new Goods("Cyberpunk 2077", date3, 500, 10000, "00003");
            AllGoods.add(game3);

            while (true)
            {
                System.out.println("Which one?:");
                int index = 0;
                for (Goods goods : AllGoods)
                {
                    System.out.println(index + " " + goods.getName());
                    index++;
                }
                System.out.print("Enter: ");
                int indexGoods = in.nextInt();

                System.out.println("You now work with: " + AllGoods.get(indexGoods).getName());
                System.out.println("1 - Set new price");
                System.out.println("2 - Set new quantity");
                System.out.println("3 - Get price");
                System.out.println("4 - Get quantity");
                System.out.println("5 - Calculate price");
                System.out.println("6 - Print");
                System.out.println("7 - Quit");
                System.out.print("Enter: ");
                int enter = in.nextInt();

                System.out.println("---");
                if (enter == 1)
                {
                    for (Goods neededGoods : AllGoods)
                    {
                        if (neededGoods.getName().equals(AllGoods.get(indexGoods).getName()))
                        {
                            System.out.print("Set new price: ");
                            int newPrice = in.nextInt();
                            AllGoods.get(indexGoods).setPrice(newPrice);
                        }
                    }
                }

                if (enter == 2)
                {
                    for (Goods neededGoods : AllGoods)
                    {
                        if (neededGoods.getName().equals(AllGoods.get(indexGoods).getName()))
                        {
                            System.out.print("Set new quantity: ");
                            int newQuantity = in.nextInt();
                            AllGoods.get(indexGoods).setQuantity(newQuantity);
                        }
                    }
                }

                if (enter == 3)
                {
                    System.out.println(AllGoods.get(indexGoods).getPrice());
                }
                if (enter == 4)
                {
                    System.out.println(AllGoods.get(indexGoods).getQuantity());
                }

                if (enter == 5)
                {
                    for (Goods neededGoods : AllGoods)
                    {
                        if (neededGoods.getName().equals(AllGoods.get(indexGoods).getName()))
                        {
                            AllGoods.get(indexGoods).CalculatePrice();
                        }
                    }
                }

                if (enter == 6)
                {
                    for (Goods neededGoods : AllGoods)
                    {
                        if (neededGoods.getName().equals(AllGoods.get(indexGoods).getName()))
                        {
                            System.out.println(AllGoods.get(indexGoods));
                        }
                    }
                }

                if (enter == 7)
                    break;
                System.out.println("---");
            }
        }

        if (task == 2)
        {
            Rectangle rectangle1 = new Rectangle(10, 5);
            Rectangle rectangle2 = new Rectangle(10,5);

            System.out.println("Rectangle perimeter: " + rectangle1.perimeterOfRectangle());
            System.out.println("Rectangle area: " + rectangle1.rectangleArea());
            System.out.println("Rectangle equals: " + rectangle1.equals(rectangle2));
            System.out.println("Similar triangles: " + rectangle1.similarRectangles(rectangle2));
        }

        if (task == 3)
        {
            Baloon balloon1 = new Baloon(5,5,5,5);
            Baloon balloon2 = new Baloon(8,8,8,3);

            System.out.println("Об'єм об'єднання: " + balloon1.unionVolume(balloon2));
            System.out.println("Об'єм перетину: " + balloon1.intersectionVolume(balloon2));
        }
    }
}