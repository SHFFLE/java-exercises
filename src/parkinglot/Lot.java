package parkinglot;

import utilities.OOValidator;

public class Lot {
    public static void main(String[] args) {
        if(OOValidator.continueDoing("Make a new Level?")){
            do{
                if(OOValidator.continueDoing("Make a new Row?")){
                    do{
                        int motospots = OOValidator.getInt("How many Motorcycle Spots should this row have?");
                        for (int i = 0; i < motospots; i++) {
                            new MotorcycleSpot();
                        }
                        int compactspots = OOValidator.getInt("How many Compact Spots should this row have?");
                        for (int i = 0; i < compactspots; i++) {
                            new CompactSpot();
                        }
                        int largespots = OOValidator.getInt("How many Large Spots should this row have?");
                        for (int i = 0; i < largespots; i++) {
                            new LargeSpot();
                        }
                    }while(OOValidator.continueDoing("Make another Row?"));
                }
            }while(OOValidator.continueDoing("Make another Level?"));
        }
    }

    private static void listOptions(String[] arrayOfOptions) {
        for (int i = 0; i < arrayOfOptions.length; i++) {
            System.out.println("[" + (i+1) + "] " + arrayOfOptions[i]);
        }
    }
}
