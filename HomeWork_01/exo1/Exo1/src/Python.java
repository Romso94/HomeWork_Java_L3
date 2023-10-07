public class Python extends Animal{

    protected int length;

    public Python(String name, int length){
        super(name);

    }

    public Python(String name){
        super(name);
        length = 1;
    }

    public void setLength(int newLength){
        if(newLength >=0){
            length = newLength;
        }
    }

    public int getLength(){
        return length;
    }




    public void makesound(){
        System.out.println(name + " start making sound");
    }


}
