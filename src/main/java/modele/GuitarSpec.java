package modele;

public class GuitarSpec extends InstrumentSpec {
    private int numStrings;

    public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, int numStrings) {
        super(builder, model, type, backWood, topWood);
        this.numStrings = numStrings;
    }

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
}
