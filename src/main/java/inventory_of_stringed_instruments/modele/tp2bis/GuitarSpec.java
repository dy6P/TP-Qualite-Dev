package inventory_of_stringed_instruments.modele.tp2bis;

import inventory_of_stringed_instruments.modele.Builder;
import inventory_of_stringed_instruments.modele.Type;
import inventory_of_stringed_instruments.modele.Wood;

public class GuitarSpec extends InstrumentSpec {
    private int numStrings;

    public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, int numStrings) {
        super(builder, model, type, backWood, topWood);
        this.numStrings = numStrings;
    }

    /**
     * Vérifie si les spécifications en paramètre sont les mêmes que celles de l'objet appelant
     * @param spec, les spécifications (de type InstrumentSpec)
     * @return un boolean
     */
    @Override
    public boolean matches(InstrumentSpec spec) {
        if (!(spec instanceof GuitarSpec)) {
            return false;
        }
        if (this.getNumStrings() != ((GuitarSpec) spec).getNumStrings()) {
            return false;
        }
        return super.matches(spec);
    }

    public int getNumStrings() {
        return numStrings;
    }

    @Override
    public String toString() {
         return super.toString() + "Nombre de cordes : " + getNumStrings();    }
    }

