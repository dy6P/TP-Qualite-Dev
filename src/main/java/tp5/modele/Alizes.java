package tp5.modele;

public class Alizes implements SuivreRoute {

    @Override
    public void suivreRoute() {
        writeAlize();
    }

    public void writeAlize() {
        System.out.println("ROUTE = Alizes\n");
    }
}
