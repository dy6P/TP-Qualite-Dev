package inventory_of_stringed_instruments.tp3.modele;
import inventory_of_stringed_instruments.enumType.Specification;

import java.util.HashMap;
import java.util.List;

public class InstrumentSpec {
    private HashMap<Specification, Object> specifications;

    public InstrumentSpec(List specifications) {
        this.specifications = new HashMap<>();
        for (int i = 0; i < specifications.size(); i += 2) {
            Specification specification = (Specification) specifications.get(i);
            this.specifications.put(specification, specifications.get(i + 1));
        }
    }

    /**
     * Retourne true quand le dsitionnaire du paramètre est inclus dans celui de l'objet appelant.
     * @param otherSpecification, les spécifications (de type InstrumentSpec)
     * @return un boolean
     */
    public boolean matches(InstrumentSpec otherSpecification) {
        for (Specification cle : otherSpecification.specifications.keySet()) {
                if (!(otherSpecification.specifications.get(cle).equals(this.getSpecifications().get(cle)))) {
                    return false;
            }
        }
        return true;
    }

    public HashMap<Specification, Object> getSpecifications() {
        return specifications;
    }

    public String toString() {
        return specifications.toString() +  specifications.toString();
    }
}
