package modele;

public class InstrumentSpec {
    Builder builder;
    String model;
    Type type;
    Wood backwood;
    Wood topWood;

    public InstrumentSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backwood = backWood;
        this.topWood = topWood;
    }

    public boolean matches(InstrumentSpec searchSpec) {
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
}
