package tp5.modele;

public abstract class Voilier {
    protected String nom;
    protected SuivreRoute suivreRoute;

    public String toString() {
        return "Nom du voilier => " + this.nom;
    }
}
