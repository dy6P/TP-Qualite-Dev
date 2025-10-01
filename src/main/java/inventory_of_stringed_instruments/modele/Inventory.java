package inventory_of_stringed_instruments.modele;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List<Instrument> instruments;

    public Inventory() {
        instruments = new LinkedList();
    }

    /**
     * Ajoute un instrument grâce à son numéro de série, à son prix, et à ses spécifications
     * @param serialNumber, le numéro de série (de type String)
     * @param price, le prix (de type double)
     * @param spec, les spécicifications (de type InstrumentSpec)
     */
    public void addInstrument(String serialNumber, double price, InstrumentSpec spec) {
        instruments.add(InstrumentFactory.createInstrument(serialNumber, price, spec));
    }

    /**
     * Renvoie l'instrument avec le même numéro de série
     * @param serialNumber, le numéro de série (de type String)
     * @return un objet de type Instrument
     */
    public Instrument getInstrument(String serialNumber) {
        for (Iterator i = instruments.iterator(); i.hasNext(); ) {
            Instrument instrument = (Instrument) i.next();
            if (instrument.getSerialNumber().equals(serialNumber)) {
                return instrument;
            }
        }
        return null;
    }

    /**
     * Recherche d'un instrument en fonction de ses spécifications
     * @param searchSpec, un objet (de type InstrumentSpec)
     * @return une liste chaînée
     */
    public List search(InstrumentSpec searchSpec) {
        List matchingInstruments = new LinkedList();
        for (Iterator i = instruments.iterator(); i.hasNext(); ) {
            Instrument instrument = (Instrument) i.next();
            InstrumentSpec instruSpec = instrument.getInstrumentSpec();
            if (instruSpec.matches(searchSpec)) {
                matchingInstruments.add(instrument);
            }
        }
        return matchingInstruments;
    }
}
