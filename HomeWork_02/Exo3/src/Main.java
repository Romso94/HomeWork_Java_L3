

public class Main {
    public static void main(String[] args) {
        Entreprise[] entreprise1 = new Entreprise[2];
        Entreprise[] entreprise2 = new Entreprise[2];
        Entreprise[] entreprise3 = new Entreprise[2];

        entreprise1[0] = new Entreprise(1500,150,"Ford","Insurance");
        entreprise1[1] = new EntrepriseSecret(200,10,"CIA");

        entreprise2[0] = new Entreprise(120,1000,"Spectre");
        entreprise2[1] = new EntrepriseSansProfit(1200,"CroixRouge","Humanitaire");

        entreprise3[0] = new Entreprise(1202,10000,"Microsoft");
        entreprise3[1] = new Entreprise(600,"Efrei","Study");


     //  Entreprise.PrintInformation(entreprise1);   // Test for -> Exception : SecretMission
     //  Entreprise.PrintInformation(entreprise2);   // Test for -> Exception : Non Profit
     //  Entreprise.PrintInformation(entreprise3);   // Test for no exception



    }
}