package tema7_8_9.exercises.Exercise9.Scanners;

import tema7_8_9.exercises.Exercise9.Databases.DishDB;

import java.util.ArrayList;
import java.util.Scanner;

public class DishScanner {

    public static ArrayList<String> askDish(DishDB allDishes, Scanner scanner) {
        ArrayList<String> ingredients = new ArrayList<String>();
        String dishName;

        System.out.println("What do you want to eat?");
        dishName = scanner.next();
        String dish = dishName.toLowerCase();
        ingredients = allDishes.getIngredients(dish);

        if(ingredients == null) {
            throw new NullPointerException("We don't have that food");
        }

        return ingredients;
    }
}
