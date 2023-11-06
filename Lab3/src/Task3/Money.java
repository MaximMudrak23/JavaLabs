package Task3;

public class Money implements Pair<Integer> {
    private final int dollars;
    private final int cents;

    public Money(int dollars, int cents) {
        this.dollars = dollars;
        this.cents = cents;
    }

    @Override
    public Integer getFirst() {
        return dollars;
    }

    @Override
    public Integer getSecond() {
        return cents;
    }

    @Override
    public Pair<Integer> sum(Pair<Integer> other) {
        int sumDollars = this.dollars + other.getFirst();
        int sumCents = this.cents + other.getSecond();
        if (sumCents >= 100) {
            sumDollars += sumCents / 100;
            sumCents %= 100;
        }
        return new Money(sumDollars, sumCents);
    }

    @Override
    public Pair<Integer> sub(Pair<Integer> other) {
        int subDollars = this.dollars - other.getFirst();
        int subCents = this.cents - other.getSecond();
        if (subCents < 0) {
            subDollars -= 1;
            subCents += 100;
        }
        return new Money(subDollars, subCents);
    }

    @Override
    public Pair<Integer> mult(int number) {
        int multDollars = this.dollars * number;
        int multCents = this.cents * number;
        if (multCents >= 100) {
            multDollars += multCents / 100;
            multCents %= 100;
        }
        return new Money(multDollars, multCents);
    }

    @Override
    public Pair<Integer> div(int number) {
        int divDollars = this.dollars / number;
        int divCents = this.cents / number;
        return new Money(divDollars, divCents);
    }

    @Override
    public String toString() {
        return "$" + dollars + "." + cents;
    }
}