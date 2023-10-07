public class Zebra extends Animal implements Haslegs{

    protected int legs;
    protected int StripesNumber;

    public Zebra(String name, int StripesNumber){
        super(name);
        this.StripesNumber = StripesNumber;
        legs = 4;
    }

    public Zebra(String name){
        super(name);
        StripesNumber = 10;
        legs = 4;
    }

    public void setStripesNumber(int Amount){
        if (Amount>0){
            StripesNumber =  Amount;
        }
    }

    public int getStripesNumber(){
        return StripesNumber;
    }

    public void makesound(){
    System.out.println(name + " start making sound ");
    }

    @Override
    public void letsRun(){
        System.out.println( name + " is running");
    }

    @Override
    public int getNumberOfLegs(){
        return legs;
    }

}
