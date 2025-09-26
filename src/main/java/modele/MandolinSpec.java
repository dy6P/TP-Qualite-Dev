package modele;

public abstract class MandolinSpec extends InstrumentSpec {

    public MandolinSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood) {
        super(builder, model, type, backWood, topWood);
    }

    public boolean matches(InstrumentSpec spec) {

    }
}
