package tp5.modele;

public abstract class Voilier {
    protected String nom;
    protected SuivreRoute suivreRoute;

    public Voilier(String nom, SuivreRoute suivreRoute) {
        this.nom = nom;
        this.suivreRoute = suivreRoute;
    }

    public void appliquerSuivreRoute() {
        this.suivreRoute.suivreRoute();
    }

    public void setSuivreRoute(SuivreRoute suivreRoute) {
        this.suivreRoute = suivreRoute;
    }

    public String toString() {
        return "NOM   = " + this.nom;
    }
}
