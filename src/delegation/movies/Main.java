package delegation.movies;

public class Main {
    public static void main(String[] args) {
        Film f = new Film();
        System.out.printf("Price: %.2f, Bonus: %.2f\n", f.price(4), f.bonus(4));

        f.setType(FilmType.REGULAR);
        System.out.printf("Price: %.2f, Bonus: %.2f\n", f.price(4), f.bonus(4));
    }
}