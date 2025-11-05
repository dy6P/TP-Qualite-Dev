package tp4.DIP.modele;

public class BackEndDeveloper implements Developer {
    public void writeJava() {
        System.out.println("Java");
    }

    @Override
    public void develop() {
        writeJava();
    }
}
