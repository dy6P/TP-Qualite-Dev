package inventory_of_stringed_instruments.modele.tp3;
import inventory_of_stringed_instruments.modele.*;
import java.util.HashMap;

public class InstrumentSpec {
    private HashMap<Specification, Object> spec;

    public InstrumentSpec(HashMap<Specification, Object> spec) {
        this.spec = spec;
    }

    /**
     * Retourne true quand le dsitionnaire en paramètre est inclus dans celui de l'objet appelant.
     * @param spec, les spécifications (de type InstrumentSpec)
     * @return un boolean
     */
    public boolean matches(InstrumentSpec spec) {
        for ()
        return true;
    }

    public HashMap<Specification, Object> getSpec() {
        return spec;
    }

    public String toString() {
        return  "Builder          : " + getBuilder() + "\n" + "Modèle           : " + getModel() + "\n" + "Type             : " + getType() + "\n" + "BackWood         : " + getBackWood() + "\n" + "TopWood          : " + getTopWood() + "\n";
    }
}
