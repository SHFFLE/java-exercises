public class Taunts extends Thread{
    public void run(){
        sleep((int) Math.floor(Math.random()*20000) + 2000);
        double randomTaunt = Math.random();
        if(randomTaunt < 0.2){
            System.err.println("At least you'll know you fell to the best");
        }else if (randomTaunt >= 0.2 && randomTaunt < 0.4){
            System.err.println("I'm gonna kill you, your family, then your dog");
        }else if (randomTaunt >= 0.4 && randomTaunt < 0.6){
            System.err.println("Holy Christ! I didn't think I could feel this much pain");
        }else if (randomTaunt >= 0.6 && randomTaunt < 0.8){
            System.err.println("Do you feel lucky?");
        }else if (randomTaunt >= 0.8 && randomTaunt <= 1.0){
            System.err.println("I'm sorry I have to do this. Just kidding");
        }
        run();
    }
    public static void sleep(int time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
