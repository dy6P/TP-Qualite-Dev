package inventory_of_stringed_instruments.modele.tp2bis;

import inventory_of_stringed_instruments.modele.Builder;
import inventory_of_stringed_instruments.modele.Style;
import inventory_of_stringed_instruments.modele.Type;
import inventory_of_stringed_instruments.modele.Wood;

public class MandolinSpec extends InstrumentSpec {
    private Style style;

    public MandolinSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, Style style) {
        super(builder, model, type, backWood, topWood);
        this.style = style;
    }

    /**
     * Vérifie si les spécifications en paramètre sont les mêmes que celles de l'objet appelant
     * @param spec, les spécifications (de type InstrumentSpec)
     * @return un boolean
     */
    @Override
    public boolean matches(InstrumentSpec spec) {
        if (!(spec instanceof MandolinSpec)) {
            return false;
        }
        if (this.getStyle() != ((MandolinSpec) spec).getStyle()) {
            return false;
        }
        return super.matches(spec);
    }

    public Style getStyle() {
        return style;
    }

    @Override
    public String toString() {
        return  super.toString() + "Style            : " + getStyle();    }
}
