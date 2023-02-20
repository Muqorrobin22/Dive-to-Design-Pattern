public class Cat {
    
    private int energy;

    public int eat(Food food) {
        energy +=  energy + food.getNutrition();

        return energy;
    }

}
