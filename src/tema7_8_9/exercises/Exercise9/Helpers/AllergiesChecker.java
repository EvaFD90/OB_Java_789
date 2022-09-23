package tema7_8_9.exercises.Exercise9.Helpers;

import java.util.ArrayList;

public class AllergiesChecker {
    public static String checkAllergies(ArrayList<String> allergies, ArrayList<String> ingredients){
        String canEat = "Enjoy your food!";
        for (String allergy : allergies) {
            if (ingredients.contains(allergy)) {
                canEat = "Don't eat that!!!";
                break;
            }
        }

        return canEat;
    }
}
