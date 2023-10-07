public class Elephant extends Animal implements Haslegs{

    protected int height;
    protected int legs;

    public Elephant(String name){
        super(name);
        legs = 4;

    }

    public Elephant(String name,int height){
        super(name);
        this.height =  height;
        legs = 4;
    }

    public int getHeight(){
        return height;
    }

    public void setHeight(int newHeight){
        if(newHeight>=0){
            height = newHeight;
        }
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
