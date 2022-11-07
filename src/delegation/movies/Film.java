package delegation.movies;

public class Film {
    private FilmType type = FilmType.NEW_FILM;

    public void setType(FilmType type) {
        this.type = type;
    }

    public double price(int days){
        return type.getPrice(days);
    }

    public double bonus(int days){
        return type.getBonus(days);
    }
}
