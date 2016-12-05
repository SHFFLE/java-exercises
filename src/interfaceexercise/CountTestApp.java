package interfaceexercise;

public class CountTestApp {
    public static void main(String[] args) {
        CountUtil.count(new Alligator(), 5);
        Sheep dolly = new Sheep();
        dolly.setName("Dolly");
        CountUtil.count(dolly, 6);
        Sheep Clonie = dolly.clone();
        Clonie.setName("Clonie");
        CountUtil.count(Clonie, 7);
        CountUtil.count(dolly, 2);
    }
}
