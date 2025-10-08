package inventory_of_stringed_instruments.modele;

public enum Specification {
    BUILDER, MODEL, TYPE, BACKWOOD, TOPWOOD, STYLE, NUMBEROFSTRINGS, FABRICATIONYEAR;

    public String toString() {
        switch (this) {
            case BUILDER: return "Builder";
            case MODEL: return "Model";
            case TYPE: return "Type";
            case BACKWOOD: return "Backwood";
            case TOPWOOD: return "Topwood";
            case STYLE: return "Style";
            case NUMBEROFSTRINGS: return "NumberOfStrings";
            case FABRICATIONYEAR: return "FabricationYear";
            default: return "Unspecified";
        }
    }
}
