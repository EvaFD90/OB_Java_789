package tema7_8_9.exercises.Exercise9.Scanners;

import tema7_8_9.exercises.Exercise9.Databases.UserDB;

import java.util.ArrayList;
import java.util.Scanner;

public class UserScanner {
    public static ArrayList<String> askUserName(UserDB allUsers, Scanner scanner) {
        ArrayList<String> allergies = new ArrayList<String>();
        String userName;

        System.out.println("Hello! Who are you?");
        userName = scanner.next();
        String user = userName.toLowerCase();
        allergies = allUsers.getAllergies(user);

        if(allergies == null) {
            throw new NullPointerException("The user doesn't exist");
        }

        return allergies;
    }
}
