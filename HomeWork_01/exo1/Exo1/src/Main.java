public class Main {
    public static void main(String[] args) {

        Elephant e = new Elephant("name1", 689);
        Zebra z = new Zebra("name2",20);
        Python p = new Python("name3",100);

        Animal[] AnimalsArray = {e,z,p};

        for (Animal animal : AnimalsArray){
            System.out.println(animal.getName());
        }

    }
}