package inventory_of_stringed_instruments.tp2bis.modele;

import inventory_of_stringed_instruments.enumType.Builder;
import inventory_of_stringed_instruments.enumType.Type;
import inventory_of_stringed_instruments.enumType.Wood;

public abstract class InstrumentSpec {
    protected Builder builder;
    protected String model;
    protected Type type;
    protected Wood backwood;
    protected Wood topWood;

    public InstrumentSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backwood = backWood;
        this.topWood = topWood;
    }

    /**
     * Vérifie si les spécifications en paramètre sont les mêmes que celles de l'objet appelant
     * @param spec, les spécifications (de type InstrumentSpec)
     * @return un boolean
     */
    public boolean matches(InstrumentSpec spec) {
        if (this.getBuilder() != spec.getBuilder()) {
            return false;
        }
        if (!this.getModel().equalsIgnoreCase(spec.getModel())) {
            return false;
        }
        if (this.getType() != spec.getType()) {
            return false;
        }
        if (this.getBackWood() != spec.getBackWood()) {
            return false;
        }
        if (this.getTopWood() != spec.getTopWood()) {
            return false;
        }
        return true;
    }

    public Builder getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public Type getType() {
        return type;
    }

    public Wood getBackWood() {
        return backwood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public String toString() {
        return  "Builder          : " + getBuilder() + "\n" + "Modèle           : " + getModel() + "\n" + "Type             : " + getType() + "\n" + "BackWood         : " + getBackWood() + "\n" + "TopWood          : " + getTopWood() + "\n";
    }
}
