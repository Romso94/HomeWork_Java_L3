public class Entreprise {
    protected int numberEmployees;
    protected  int capital;
    protected String name;
    protected  String mission;

    public Entreprise(){
        this.numberEmployees = 1;
        this.capital = 0;
        this.name = "";
        this.mission = "No mission";
    }

    public Entreprise(int numberEmployees, int capital, String name,String mission){
        this.numberEmployees = numberEmployees;
        this.capital = capital;
        this.name = name;
        this.mission = mission;
    }

    public Entreprise(int numberEmployees, String name,String mission){
        this.numberEmployees = numberEmployees;
        this.name = name;
        this.mission = mission;
        this.capital = 0;
    }

    public Entreprise(int numberEmployees, int capital, String name){
        this.numberEmployees = numberEmployees;
        this.capital = capital;
        this.name = name;
        this.mission = "No mission";
    }

    public Entreprise(int numberEmployees, String name){
        this.numberEmployees = numberEmployees;
        this.capital = 0;
        this.name = name;
        this.mission = "";
    }

    public static class SecretMissionException extends RuntimeException{
        public SecretMissionException(String message){
            super(message);
        }
    }

    public static class NonProfitException extends RuntimeException{
        public NonProfitException(String message){
            super(message);
        }
    }


    public  String mission() throws SecretMissionException{

        return mission;
    }

    public int capital() throws NonProfitException{
        return capital;
    }

    public static void PrintInformation(Entreprise[] entreprises) throws SecretMissionException,NonProfitException {
        for(int i=0;i<entreprises.length;i++){
            System.out.println("Company : " + entreprises[i].name);
            System.out.println("Number of Employees : " + entreprises[i].numberEmployees);
            System.out.println("Mission : " + entreprises[i].mission());
            System.out.println("Capital : " + entreprises[i].capital());
            System.out.println("============\n");
        }
    }
}


