package inventory_of_stringed_instruments.modele.tp3;

import inventory_of_stringed_instruments.modele.InstrumentType;
import inventory_of_stringed_instruments.modele.tp2bis.InstrumentSpec;

public class Instrument {
    private String serialNumber;
    private double price;
    private InstrumentType instrumentType;
    private InstrumentSpec spec;

    public Instrument(String serialNumber, double price, InstrumentSpec spec, InstrumentType instrumentType) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.spec = spec;
        this.instrumentType = instrumentType;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public InstrumentSpec getInstrumentSpec() {
        return spec;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public String toString(){
        return "Numéro de série  : " + getSerialNumber() + "\n" + "Prix             : " + getPrice() + " $\n";
    }
}
