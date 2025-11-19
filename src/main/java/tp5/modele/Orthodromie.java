package tp5.modele;

public class Orthodromie implements SuivreRoute {

    @Override
    public void suivreRoute() {
        writeOrthodomie();
    }

    public void writeOrthodomie() {
        System.out.println("ROUTE = Orthodomie\n");
    }
}
