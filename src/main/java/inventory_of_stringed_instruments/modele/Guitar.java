package inventory_of_stringed_instruments.modele;

public class Guitar extends Instrument {

    public Guitar(String serialNumber, double price, GuitarSpec spec) {
        super(serialNumber, price, spec);
    }

    public String toString() {
        return "\nGUITAR\n\nNuméro de série  : " + getSerialNumber() + "\n" + "Prix             : " + getPrice() + " $\n" + getInstrumentSpec() + "\n";
    }
}
