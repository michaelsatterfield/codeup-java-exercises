public class Dish {
    public int costInCents;
    public String nameOfDish;
    public Boolean wouldRecommend;
//instance method***********
    public void printSummary(){
        System.out.printf(
                "Cost:%d%nName:%s%nRecommended:%s",
                costInCents,
                nameOfDish,
                wouldRecommend);
    }




};
