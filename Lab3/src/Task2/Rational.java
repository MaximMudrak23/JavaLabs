package Task2;

public class Rational extends Pair {
    private int numerator;
    private int denominator;

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    @Override
    public Rational add(Pair other)
    {
        if (other instanceof Rational)
        {
            Rational otherRational = (Rational) other;
            int newNumerator = this.numerator * otherRational.denominator + otherRational.numerator * this.denominator;
            int newDenominator = this.denominator * otherRational.denominator;
            return new Rational(newNumerator, newDenominator);
        }
        else
        {
            throw new IllegalArgumentException("Неможливо додати до раціонального числа інший тип.");
        }
    }

    @Override
    public Rational subtract(Pair other)
    {
        if (other instanceof Rational)
        {
            Rational otherRational = (Rational) other;
            int newNumerator = this.numerator * otherRational.denominator - otherRational.numerator * this.denominator;
            int newDenominator = this.denominator * otherRational.denominator;
            return new Rational(newNumerator, newDenominator);
        }
        else
        {
            throw new IllegalArgumentException("Неможливо відняти від раціонального числа інший тип.");
        }
    }

    @Override
    public Rational multiply(Pair other)
    {
        if (other instanceof Rational)
        {
            Rational otherRational = (Rational) other;
            int newNumerator = this.numerator * otherRational.numerator;
            int newDenominator = this.denominator * otherRational.denominator;
            return new Rational(newNumerator, newDenominator);
        }
        else
        {
            throw new IllegalArgumentException("Неможливо помножити раціональне число на інший тип.");
        }
    }
}
