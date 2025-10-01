package inventory_of_stringed_instruments.modele;

public class Guitar extends Instrument {

    public Guitar(String serialNumber, double price, GuitarSpec spec) {
        super(serialNumber, price, spec);
    }

    @Override
    public String toString() {
        return "\nGUITAR\n\n" + super.toString() + getInstrumentSpec() + "\n";
    }
}
