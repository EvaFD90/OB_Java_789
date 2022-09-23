package tema7_8_9.exercises.Exercise9;

import tema7_8_9.exercises.Exercise9.Databases.DishDB;
import tema7_8_9.exercises.Exercise9.Databases.UserDB;
import tema7_8_9.exercises.Exercise9.Seeders.DishSeeder;
import tema7_8_9.exercises.Exercise9.Seeders.UserSeeder;

import java.util.ArrayList;
import java.util.Scanner;

import static tema7_8_9.exercises.Exercise9.Helpers.AllergiesChecker.checkAllergies;
import static tema7_8_9.exercises.Exercise9.Scanners.DishScanner.askDish;
import static tema7_8_9.exercises.Exercise9.Scanners.UserScanner.askUserName;

public class Main {
     /*
    Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.
     */
     public static void main(String[] args) {
         UserSeeder userSeeder = new UserSeeder();
         UserDB userDB = userSeeder.run();

         DishSeeder dishSeeder = new DishSeeder();
         DishDB dishDB = dishSeeder.run();

         try{
             Scanner scanner = new Scanner(System.in);

             ArrayList<String> allergies = askUserName(userDB, scanner);
             ArrayList<String> ingredients = askDish(dishDB, scanner);

             System.out.println(checkAllergies(allergies, ingredients));
         }catch(NullPointerException e) {
             System.out.println(e.getMessage());
         }

     }
}
