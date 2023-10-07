public class EntrepriseSansProfit extends Entreprise{
    public EntrepriseSansProfit(int numberEmployees,int capital,String name,String mission){
        super(numberEmployees,capital,name,mission);
    }

    public EntrepriseSansProfit(int numberEmployees,String name,String mission){
        super(numberEmployees,name,mission);
    }



    @Override
    public int capital() throws NonProfitException{
        if (capital==0){
            throw new NonProfitException("This is a Non Profit Entreprise ! ");
        }
        return capital;
    }
}
