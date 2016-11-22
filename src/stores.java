import java.util.*;

public class stores {
    public static ArrayList<double[]> results = new ArrayList<double[]>();

    public static void main(String[] args) {
        String[] stores = {"Skechers", "Champs", "Lids", "TX Sporting", "Dunham's"};
        String[] sports = {"Badminton", "Motor Sports", "Wrestling", "Golf", "Tennis", "Soccer", "Ice Hockey", "Basketball", "Baseball", "Football"};
        boolean doContinue = false;
        Scanner sc = new Scanner(System.in);
        do{
            results.add(getResults(stores, sports));
            System.out.println(results);
            System.out.println("Is this the last entry?");
            if (sc.next().equalsIgnoreCase("y")) {
                System.out.println("Stopping");
                doContinue = false;
            } else {
                System.out.println("Continuing");
                doContinue = true;
            }
        }while(doContinue);
        calcSalesPerStore(stores);
        calcSalesPerSport(sports);
        calcTotalSales();
    }

    public static double[] getResults(String[] stores, String[] sports){
        System.out.println("Stores:");
        for (int i = 0; i < stores.length; i++) {
            System.out.println("[" + (i+1) + "]: " + stores[i]);
        }
        double storeInput = (double) OOValidator.getIntWithinRange("Which store was this for?", 1, stores.length);
        storeInput --;
        System.out.println("Sports:");
        for (int i = 0; i < sports.length; i++) {
            System.out.println("[" + (i+1) + "]: " + sports[i]);
        }
        double sportInput = (double) OOValidator.getIntWithinRange("Which sport?", 1, sports.length);
        sportInput --;
        double spent = OOValidator.getDoubleWithinRange("How much was spent?", 0, 200);
        double[] toBeReturned = {storeInput, sportInput, spent};
        return toBeReturned;
    }

    public static void calcSalesPerStore(String[] stores){
        double[] storeSales = new double[stores.length];

        for (int i = 0; i < results.size(); i++) {
            for (int j = 0; j < stores.length; j++) {
                if(results.get(i)[0] == j){
                    storeSales[j] = (results.get(i)[2]);
                }
            }
        }
        for (int i = 0; i < stores.length; i++) {
            System.out.println(stores[i] + " had $" + storeSales[i] + " in sales.");
        }
    }

    public static void calcSalesPerSport(String[] sports){
        double[] sportSales = new double[sports.length];

        for (int i = 0; i < results.size(); i++) {
            for (int j = 0; j < sports.length; j++) {
                if(results.get(i)[0] == j){
                    sportSales[j] = (results.get(i)[2]);
                }
            }
        }
        for (int i = 0; i < sports.length; i++) {
            System.out.println(sports[i] + " had $" + sportSales[i] + " in sales.");
        }
    }

    public static void calcTotalSales(){
        double total = 0;
        for(int i = 0; i < results.size(); i++){
            total += (results.get(i)[2]);
        }
        System.out.println("$"+ total + " total sales!");
    }
}
