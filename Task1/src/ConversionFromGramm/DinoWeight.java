package ConversionFromGramm;

public class DinoWeight {
    private static final int GRAM_INTO_KILO = 1_000;
    private static final int GRAM_INTO_TONNE = 1_000_000;

    public double intoKg(Double weight) {
        return weight / GRAM_INTO_KILO;
    }

    public double intoTon(Double weight) {
        return weight / GRAM_INTO_TONNE;
    }
}
