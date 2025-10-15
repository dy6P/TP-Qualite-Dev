package inventory_of_stringed_instruments.tp3.modele;

import inventory_of_stringed_instruments.tp3.modele.Instrument;
import inventory_of_stringed_instruments.tp3.modele.InstrumentSpec;

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
     * @param instrument, l'instrument de type Instrsument à ajouter
     */
    public void addInstrument(Instrument instrument) {
        instruments.add(instrument);
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
