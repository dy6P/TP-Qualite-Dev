package inventory_of_stringed_instruments.enumType;

public enum Specification {
    BUILDER, MODEL, TYPE, BACKWOOD, TOPWOOD, STYLE, NUMBER_OF_STRINGS, YEAR_OF_MANUFACTURE, INSTRUMENT_TYPE;

    public String toString() {
        switch (this) {
            case BUILDER: return "Builder";
            case MODEL: return "Model";
            case TYPE: return "Type";
            case BACKWOOD: return "Backwood";
            case TOPWOOD: return "Topwood";
            case STYLE: return "Style";
            case NUMBER_OF_STRINGS: return "NumberOfStrings";
            case YEAR_OF_MANUFACTURE: return "FabricationYear";
            case INSTRUMENT_TYPE: return "InstrumentType";
            default: return "Unspecified";
        }
    }
}
