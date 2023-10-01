import java.util.Scanner;

public class Task2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Введіть розмір массиву A: ");
        int n = in.nextInt();

        int [] A = new int [n];

        for (int i = 0; i < n; i++)
        {
            System.out.print("[" + i + "]: ");
            A[i] = in.nextInt();
        }

        int MinusElements = 0;
        for (int i = 0; i < n; i++)
        {
            if (A[i] < 0)
                MinusElements++;
        }

        if (MinusElements <= 1)
        {
            System.out.println("Помилка! один або менше негативних елементів, закриваю програму...");
            return;
        }

        int left = 0, right = 0;
        int lindex = 0, rindex = 0;

        // Left
        for (int i = 0; i < n; i++)
        {
            if (A[i] < 0)
            {
                left = A[i];
                lindex = i;
                break;
            }
        }

        // Right
        for (int i = n-1; i >= 0; i--)
        {
            if (A[i] < 0)
            {
                right = A[i];
                rindex = i;
                break;
            }
        }

        System.out.println("Left: [" + lindex + "]" + left);
        System.out.println("Right: [" + rindex + "]" + right);

        int sum = 0;

        for (int i = lindex + 1; i < rindex; i++)
            sum += A[i];

        System.out.print("Sum: " + sum);
    }
}

