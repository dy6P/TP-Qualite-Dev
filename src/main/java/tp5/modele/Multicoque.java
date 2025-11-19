package tp5.modele;

public class Multicoque extends Voilier {

    public Multicoque(String nom, SuivreRoute suivreRoute) {
        super(nom, suivreRoute);
    }

    @Override
    public String toString() {
        return super.toString() + "\nTYPE  = Multicoque";
    }
}
