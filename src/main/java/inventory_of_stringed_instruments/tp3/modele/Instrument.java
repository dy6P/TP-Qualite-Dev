package inventory_of_stringed_instruments.tp3.modele;

import inventory_of_stringed_instruments.tp3.modele.InstrumentSpec;

public class Instrument {
    private String serialNumber;
    private double price;
    private InstrumentSpec spec;

    public Instrument(String serialNumber, double price, InstrumentSpec spec) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.spec = spec;
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

    public String toString(){
        return "\nNuméro de série  : " + getSerialNumber() + "\n" + "Prix             : " + getPrice() + " $\n" + spec.toString();
    }
}
