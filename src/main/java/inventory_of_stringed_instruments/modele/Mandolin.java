package inventory_of_stringed_instruments.modele;

public class Mandolin extends Instrument {

    public Mandolin(String serialNumber, double price, MandolinSpec spec) {
        super(serialNumber, price, spec);
    }

    public String toString() {
        return "\nMANDOLIN\n\nNuméro de série : " + getSerialNumber() + "\n" + "Prix            : " + getPrice() + " $\n" + getInstrumentSpec() + "\n";
    }
}
