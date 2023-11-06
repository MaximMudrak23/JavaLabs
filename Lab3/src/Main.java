import Task1.Kingdom;
import Task1.Monarchy;
import Task1.Republic;
import Task1.State;
import Task2.Complex;
import Task2.Rational;
import Task3.Money;
import Task3.Complex2;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Lab 3");

        Scanner in = new Scanner(System.in);

        System.out.println("Which one Task?:");
        System.out.println("1 - Task1");
        System.out.println("2 - Task2");
        System.out.println("3 - Task3");
        System.out.print("Enter: ");
        int task = in.nextInt();

        if (task == 1)
        {
            State[] AllObjects = new State[4];
            AllObjects[0] = new State("Ukraine", "Country in Europe");
            AllObjects[1] = new Republic("USA", "Country in America", "Barack Obama");
            AllObjects[2] = new Monarchy("England", "Country in Europe", "Zelensky");
            AllObjects[3] = new Kingdom("Nigeria", "Country in Africa", "Barack Obama", 43);

            for (State x : AllObjects)
            {
                System.out.println("------");
                x.Show();
            }
        }

        if (task == 2)
        {
            // Створюємо екземпляр класу Complex
            Complex complex1 = new Complex(2.0, 3.0);
            Complex complex2 = new Complex(1.0, 2.0);

            // Виконуємо арифметичні операції з комплексними числами
            Complex sumComplex = complex1.add(complex2);
            Complex diffComplex = complex1.subtract(complex2);
            Complex productComplex = complex1.multiply(complex2);

            // Виводимо результати
            System.out.println("Complex Sum: " + sumComplex.getReal() + " + " + sumComplex.getImaginary() + "i");
            System.out.println("Complex Difference: " + diffComplex.getReal() + " - " + diffComplex.getImaginary() + "i");
            System.out.println("Complex Product: " + productComplex.getReal() + " * " + productComplex.getImaginary() + "i");

            // Створюємо екземпляр класу Rational
            Rational rational1 = new Rational(3, 4);
            Rational rational2 = new Rational(1, 3);

            // Виконуємо арифметичні операції з раціональними числами
            Rational sumRational = rational1.add(rational2);
            Rational diffRational = rational1.subtract(rational2);
            Rational productRational = rational1.multiply(rational2);

            // Виводимо результати
            System.out.println("Rational Sum: " + sumRational.getNumerator() + "/" + sumRational.getDenominator());
            System.out.println("Rational Difference: " + diffRational.getNumerator() + "/" + diffRational.getDenominator());
            System.out.println("Rational Product: " + productRational.getNumerator() + "/" + productRational.getDenominator());
        }

        if (task == 3)
        {
            Complex2 complex1 = new Complex2(3.5, 2.0);
            Complex2 complex2 = new Complex2(1.5, 3.0);

            System.out.println("Complex: ");
            System.out.println("The sum " + complex1.sum(complex2).toString());
            System.out.println("The sub " + complex1.sub(complex2).toString());
            System.out.println("The mult to 4: " + complex1.mult(4));
            System.out.println("The div to 2: " + complex1.div(2));

            Money money1 = new Money(10, 50);
            Money money2 = new Money(5, 75);

            System.out.println("Money: ");
            System.out.println("The sum " + money1.sum(money2).toString());
            System.out.println("The sub " + money1.sub(money2).toString());
            System.out.println("The mult to 4: " + money1.mult(4));
            System.out.println("The div to 2: " + money1.div(2));
        }

    }
}

