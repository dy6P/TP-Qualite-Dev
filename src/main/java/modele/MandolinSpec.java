package modele;

public class MandolinSpec extends InstrumentSpec {
    private Style style;

    public MandolinSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, Style style) {
        super(builder, model, type, backWood, topWood);
        this.style = style;
    }

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
}
