package tp5.modele;

public class Multicoque extends Voilier {
    private String nom;
    private SuivreRoute suivreRoute;

    public Multicoque(String nom, SuivreRoute suivreRoute) {
        this.nom = nom;
        this.suivreRoute = suivreRoute;
    }

    @Override
    public String toString() {
        return super.toString() + "\nType du voilier => Multicoque";
    }
}
