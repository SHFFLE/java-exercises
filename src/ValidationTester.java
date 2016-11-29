import utilities.OOValidator;

public class ValidationTester {
    public static void main(String[] args) {
        System.out.println(OOValidator.getInt("Int Pls"));
        System.out.println(OOValidator.getIntWithinRange("Int between 0 and 100 pls", 0, 100));
        System.out.println(OOValidator.getDouble("double pls"));
        System.out.println(OOValidator.getDoubleWithinRange("double between 0 and 100 pls", 0, 100));
    }
}
