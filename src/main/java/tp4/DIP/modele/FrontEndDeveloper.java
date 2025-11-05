package tp4.DIP.modele;

public class FrontEndDeveloper implements Developer {
    public void writeJavascript() {
        System.out.println("Javascript");
    }

    @Override
    public void develop() {
        writeJavascript();
    }


}
