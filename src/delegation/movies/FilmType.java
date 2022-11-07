package delegation.movies;

public enum FilmType {
    CHILDREN(1.0, 0.0), // 1 USD per day, no bonus
    REGULAR(2.0, 0.4), // 2 USD per day, 40% bonus
    NEW_FILM(3.0, 0.1); // 3 USD per day, 10% bonus

    private final double dayPrice;
    private final double dayBonus;

    FilmType(double dayPrice, double dayBonus) {
        this.dayBonus = dayBonus;
        this.dayPrice = dayPrice;
    }

    double getPrice(int days) {
        return days * dayPrice;
    }

    double getBonus(int days) {
        return days * dayPrice * dayBonus;
    }
}
