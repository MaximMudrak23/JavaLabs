package Task2;

public class Complex extends Pair {
    private double real;
    private double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    @Override
    public Complex add(Pair other)
    {
        if (other instanceof Complex)
        {
            Complex otherComplex = (Complex) other;
            return new Complex(this.real + otherComplex.real, this.imaginary + otherComplex.imaginary);
        }
        else
        {
            throw new IllegalArgumentException("Неможливо додати до комплексного числа інший тип.");
        }
    }

    @Override
    public Complex subtract(Pair other)
    {
        if (other instanceof Complex)
        {
            Complex otherComplex = (Complex) other;
            return new Complex(this.real - otherComplex.real, this.imaginary - otherComplex.imaginary);
        }
        else
        {
            throw new IllegalArgumentException("Неможливо відняти від комплексного числа інший тип.");
        }
    }

    @Override
    public Complex multiply(Pair other)
    {
        if (other instanceof Complex)
        {
            Complex otherComplex = (Complex) other;
            return new Complex(this.real * otherComplex.real - this.imaginary * otherComplex.imaginary,
                    this.real * otherComplex.imaginary + this.imaginary * otherComplex.real);
        }
        else
        {
            throw new IllegalArgumentException("Неможливо помножити комплексне число на інший тип.");
        }
    }
}