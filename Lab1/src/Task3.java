import java.util.Scanner;

public class Task3
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Введіть розмір массиву A: ");
        int n = in.nextInt();

        if (n > 20 || n < 3)
        {
            System.out.println("Помилка! розмір матриці A, більше 20, або менше 3, закриваю програму...");
            return;
        }

        int[][] A = new int[n][n];

        // Вписую елементи в кожну ячейку двовимірного масиву
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print("[" + i + "][" + j + "]: ");
                A[i][j] = in.nextInt();
            }
        }

        // Вивожу в консоль массив у вигляді матриці
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

        int left, right, center = n / 2;

        for (int i = 0; i < n; i++)
        {
            left = 0;
            right = n-1;

            for (int j = 0; j < n; j++)
            {
                if (left > right)
                {
                    System.out.println("[" + i + "]");
                    break;
                }

                if (A[i][left] != A[i][right])
                    break;

                left++; right--;
            }
        }

    }
}

