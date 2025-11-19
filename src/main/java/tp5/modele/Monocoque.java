package tp5.modele;

public class Monocoque extends Voilier {
    private String nom;
    private SuivreRoute suivreRoute;

    public Monocoque(String nom, SuivreRoute suivreRoute) {
        this.nom = nom;
        this.suivreRoute = suivreRoute;
    }

    @Override
    public String toString() {
        return super.toString() + "\nType du voilier => Monocoque";
    }
}
