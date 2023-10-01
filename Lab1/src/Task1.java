import java.util.Scanner;

public class Task1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Введіть варіант вводу-виводу:");
        System.out.println("1 - Вхідні дані та результат - дійсного типу");
        System.out.println("2 - Вхідні дані цілого типу, результат - дісного");
        System.out.println("3 - Вхідні дані дійсного типу, результат - цілого");
        System.out.print("Enter: ");
        int enter = in.nextInt();

        switch (enter)
        {
            case 1:
            {
                float n, m;

                System.out.print("Введіть n: ");
                n = in.nextFloat();
                System.out.print("Введіть m: ");
                m = in.nextFloat();

                float sum = ((n + 1) / (m + 2) + (5 / (n - m))) * ((n + 1) / (m + 2) + (5 / (n - m))) * (n * m);
                System.out.println(sum);
            }
            case 2:
            {
                int n, m;

                System.out.print("Введіть n: ");
                n = in.nextInt();
                System.out.print("Введіть m: ");
                m = in.nextInt();

                float sum = ((n + 1) / (m + 2) + (5 / (n - m))) * ((n + 1) / (m + 2) + (5 / (n - m))) * (n * m);
                System.out.println(sum);
            }
            case 3:
            {
                float n, m;

                System.out.print("Введіть n: ");
                n = in.nextFloat();
                System.out.print("Введіть m: ");
                m = in.nextFloat();

                int sum = (int) (((n + 1) / (m + 2) + (5 / (n - m))) * ((n + 1) / (m + 2) + (5 / (n - m))) * (n * m));
                System.out.println(sum);
            }
        }

        in.close();
    }
}

