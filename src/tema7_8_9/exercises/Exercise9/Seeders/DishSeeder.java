package tema7_8_9.exercises.Exercise9.Seeders;

import tema7_8_9.exercises.Exercise9.Databases.DishDB;

public class DishSeeder {

    public DishDB run(){

        DishDB dishDB = new DishDB();

        dishDB.create("smoothie");
        dishDB.create("pizza");
        dishDB.create("noodles");

        dishDB.addIngredient("smoothie", "pineapple");
        dishDB.addIngredient("smoothie", "mango");
        dishDB.addIngredient("smoothie", "strawberry");
        dishDB.addIngredient("smoothie", "banana");
        dishDB.addIngredient("smoothie", "milk");

        dishDB.addIngredient("pizza", "wheat");
        dishDB.addIngredient("pizza", "tomato");
        dishDB.addIngredient("pizza", "cheese");
        dishDB.addIngredient("pizza", "basil");

        dishDB.addIngredient("noodles", "wheat");
        dishDB.addIngredient("noodles", "carrot");
        dishDB.addIngredient("noodles", "pepper");
        dishDB.addIngredient("noodles", "soy");
        dishDB.addIngredient("noodles", "peanut");
        dishDB.addIngredient("noodles", "prawn");

        return dishDB;
    }
}
