public class DishTest {
    public static void main(String[] args) {
        Dish d = new Dish();
        d.costInCents = 2000;
        d.nameOfDish = "Mega Plate";
        d.wouldRecommend = true;
        d.printSummary();
    }
}
