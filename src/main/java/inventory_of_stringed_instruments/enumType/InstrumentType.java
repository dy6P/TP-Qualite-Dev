package inventory_of_stringed_instruments.enumType;

public enum InstrumentType {
    GUITAR, VIOLON, MANDOLIN, BANJO;

    public String toString() {
        switch (this) {
            case GUITAR: return "Guitar";
            case MANDOLIN: return "Mandolin";
            case BANJO: return "Banjo";
            case VIOLON: return "Violon";
            default: return "Unspecified";
        }
    }
}
