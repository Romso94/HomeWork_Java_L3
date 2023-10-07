public class EntrepriseSecret extends Entreprise{

    public EntrepriseSecret(int numberEmployees,int capital,String name,String mission){
        super(numberEmployees,capital,name,mission);
    }

    public EntrepriseSecret(int numberEmployees,int capital,String name){
        super(numberEmployees,capital,name);


    }

    @Override
    public String mission() throws SecretMissionException{
        if (mission.equals("No mission")){
            throw new SecretMissionException("Mission classified !");
        }
        return mission;
    }
}
