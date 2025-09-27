package inventory_of_stringed_instruments.modele;

public abstract class InstrumentFactory {
    public static Instrument createInstrument(String serialNumber, double price, InstrumentSpec spec) {
        Instrument instrument = null;
        if (spec instanceof GuitarSpec) {
            instrument = new Guitar(serialNumber, price, (GuitarSpec) spec);
        }
        if (spec instanceof MandolinSpec) {
            instrument = new Mandolin(serialNumber, price, (MandolinSpec) spec);
        }
        return instrument;
    }
}
