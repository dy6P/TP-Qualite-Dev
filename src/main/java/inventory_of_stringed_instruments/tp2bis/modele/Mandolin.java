package inventory_of_stringed_instruments.tp2bis.modele;

public class Mandolin extends Instrument {

    public Mandolin(String serialNumber, double price, MandolinSpec spec) {
        super(serialNumber, price, spec);
    }

    @Override
    public String toString() {
        return "\nMANDOLIN\n\n" + super.toString() + getInstrumentSpec() + "\n";
    }
}
