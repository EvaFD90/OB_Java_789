package tema7_8_9.exercises.Exercise9.Databases;

import java.util.ArrayList;
import java.util.HashMap;

public class DishDB {
    HashMap<String, ArrayList<String>> allDishes = new HashMap<String, ArrayList<String>>();

    public void create (String name){
        allDishes.computeIfAbsent(name, k -> new ArrayList<String>());
    }

    public void delete (String name) {
        allDishes.remove(name);
    }

    public void addIngredient (String name, String ingredient) {
        if(allDishes.get(name) != null) {
            allDishes.get(name).add(ingredient);
        }
    }

    public ArrayList<String> getIngredients(String name){
        return allDishes.get(name);
    }

    public HashMap<String, ArrayList<String>> getAllDishes(){
        return allDishes;
    }
}

