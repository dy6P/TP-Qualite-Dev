package inventory_of_stringed_instruments.tp3;

import inventory_of_stringed_instruments.enumType.*;
import inventory_of_stringed_instruments.tp3.modele.Instrument;
import inventory_of_stringed_instruments.tp3.modele.InstrumentSpec;
import inventory_of_stringed_instruments.tp3.modele.Inventory;
import java.util.Arrays;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        // Set up Rick's inventory
        Inventory inventory = new Inventory();
        initializeInventory(inventory);


        InstrumentSpec whatBryanLikes = new InstrumentSpec(Arrays.asList(
                Specification.INSTRUMENT_TYPE, InstrumentType.MANDOLIN,
                Specification.STYLE, Style.F));

        whatBryanLikes = new InstrumentSpec(Arrays.asList(
                Specification.INSTRUMENT_TYPE, InstrumentType.BANJO));

        List matchingInstruments = inventory.search(whatBryanLikes);
        if (!matchingInstruments.isEmpty())
            System.out.println( "Here's what we have for you:\n" +matchingInstruments);
        else
            System.out.println("Sorry, we have nothing for you.");
    }




    public static void initializeInventory(Inventory inventory) {
        inventory.addInstrument(new Instrument("82765501", 1890.95,
                new InstrumentSpec(Arrays.asList(
                        Specification.INSTRUMENT_TYPE, InstrumentType.GUITAR,
                        Specification.TYPE, Type.ELECTRIC,
                        Specification.MODEL, "SG '61 Reissue",
                        Specification.BACKWOOD, Wood.MAHOGANY,
                        Specification.TOPWOOD, Wood.MAHOGANY))));

        inventory.addInstrument(new Instrument("9019920", 5495.99,
                new InstrumentSpec(Arrays.asList(
                        Specification.INSTRUMENT_TYPE, InstrumentType.MANDOLIN,
                        Specification.TYPE, Type.ACOUSTIC,
                        Specification.MODEL, "DRSM-008 E",
                        Specification.BACKWOOD, Wood.MAPLE,
                        Specification.TOPWOOD, Wood.MAPLE,
                        Specification.BUILDER, Builder.PRS,
                        Specification.STYLE, Style.A
                ))));

        inventory.addInstrument(new Instrument("7819920", 549,
                new InstrumentSpec(Arrays.asList(
                        Specification.INSTRUMENT_TYPE, InstrumentType.MANDOLIN,
                        Specification.TYPE, Type.ACOUSTIC,
                        Specification.MODEL, "F-5G",
                        Specification.BACKWOOD, Wood.MAPLE,
                        Specification.TOPWOOD, Wood.MAPLE,
                        Specification.BUILDER, Builder.GIBSON,
                        Specification.STYLE, Style.F
                ))));
        inventory.addInstrument(new Instrument("8900231", 2945.95,
                new InstrumentSpec(Arrays.asList(
                        Specification.INSTRUMENT_TYPE, InstrumentType.BANJO,
                        Specification.MODEL, "RB-3 Wreath",
                        Specification.YEAR_OF_MANUFACTURE, 1967
                ))));
        inventory.addInstrument(new Instrument("70108276", 2295.95,
                new InstrumentSpec(Arrays.asList(
                        Specification.INSTRUMENT_TYPE, InstrumentType.GUITAR,
                        Specification.BUILDER, Builder.GIBSON,
                        Specification.MODEL, "Les Paul",
                        Specification.BACKWOOD, Wood.MAPLE,
                        Specification.TOPWOOD, Wood.MAPLE
                ))));
        inventory.addInstrument(new Instrument("V95693", 1499.95,
                new InstrumentSpec(Arrays.asList(
                        Specification.INSTRUMENT_TYPE, InstrumentType.GUITAR,
                        Specification.BUILDER, Builder.FENDER,
                        Specification.MODEL, "Stratocastor",
                        Specification.BACKWOOD, Wood.ALDER,
                        Specification.TOPWOOD, Wood.ALDER,
                        Specification.TYPE, Type.ELECTRIC
                ))));
        inventory.addInstrument(new Instrument("V9512", 1549.95,
                new InstrumentSpec(Arrays.asList(
                        Specification.INSTRUMENT_TYPE, InstrumentType.GUITAR,
                        Specification.BUILDER, Builder.FENDER,
                        Specification.MODEL, "Stratocastor",
                        Specification.BACKWOOD, Wood.ALDER,
                        Specification.TOPWOOD, Wood.ALDER,
                        Specification.TYPE, Type.ELECTRIC
                ))));
        inventory.addInstrument(new Instrument("122784", 5495.95,
                new InstrumentSpec(Arrays.asList(
                        Specification.INSTRUMENT_TYPE, InstrumentType.GUITAR,
                        Specification.BUILDER, Builder.MARTIN,
                        Specification.MODEL, "D-18",
                        Specification.BACKWOOD, Wood.MAHOGANY,
                        Specification.TOPWOOD, Wood.ADIRONDACK
                ))));
        inventory.addInstrument(new Instrument("11277", 3999.95,
                new InstrumentSpec(Arrays.asList(
                        Specification.INSTRUMENT_TYPE, InstrumentType.GUITAR,
                        Specification.BUILDER, Builder.COLLINGS,
                        Specification.MODEL, "CJ",
                        Specification.BACKWOOD, Wood.INDIAN_ROSEWOOD,
                        Specification.TOPWOOD, Wood.SITKA,
                        Specification.TYPE, Type.ACOUSTIC,
                        Specification.NUMBER_OF_STRINGS, 6
                ))));
    }
}