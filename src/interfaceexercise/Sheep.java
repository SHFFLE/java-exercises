package interfaceexercise;

public class Sheep implements Countable, Cloneable{
    private int count = 0;
    private String name = "";

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    @Override
    public Sheep clone(){
        Sheep clone = new Sheep();
        clone.setName(name);
//        clone.count = this.getCount();
        return clone;
    }
    @Override
    public void incrementCount(){
        count++;
    }
    @Override
    public void resetCount(){
        count = 0;
    }
    @Override
    public int getCount(){
        return count;
    }
    @Override
    public String getCountString(){
        return (Integer.toString(count) + " " + getName() + "(s)");
    }
}
