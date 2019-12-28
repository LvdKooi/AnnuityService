package nl.kooi.domain;

public enum Periodicity {
    MONTHLY(12), QUARTERLY(4), SEMI_ANNUALLY(2), ANNUALLY(1);

    private int divisor;

    Periodicity(int divisor) {
        this.divisor = divisor;
    }

    public int getDivisor() {
        return divisor;
    }
}
