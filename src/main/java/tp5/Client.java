package tp5;

import tp5.modele.*;

public class Client {
    public static void main(String[] args) {
        Voilier v1 = new Monocoque("v1", new Orthodromie());
        Voilier v2 = new Multicoque("v2", new Alizes());

        System.out.println(v1);
        v1.appliquerSuivreRoute();
        System.out.println(v2);
        v2.appliquerSuivreRoute();

        v1.setSuivreRoute(new Alizes());
        v2.setSuivreRoute(new Orthodromie());

        System.out.println(v1);
        v1.appliquerSuivreRoute();
        System.out.println(v2);
        v2.appliquerSuivreRoute();
    }
}
