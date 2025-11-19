package tp5.modele;

public class Monocoque extends Voilier {

    public Monocoque(String nom, SuivreRoute suivreRoute) {
       super(nom, suivreRoute);
    }

    @Override
    public String toString() {
        return super.toString() + "\nTYPE  = Monocoque";
    }
}
