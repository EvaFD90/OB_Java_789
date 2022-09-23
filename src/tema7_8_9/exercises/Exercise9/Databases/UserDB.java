package tema7_8_9.exercises.Exercise9.Databases;

import java.util.ArrayList;
import java.util.HashMap;

public class UserDB {
    HashMap<String, ArrayList<String>> allUsers = new HashMap<String, ArrayList<String>>();

    public void create (String name) {
        allUsers.computeIfAbsent(name, k -> new ArrayList<String>());
    }

    public void delete (String name) {
        allUsers.remove(name);
    }

    public void addAllergy (String name, String allergy) {
        if(allUsers.get(name) != null) {
            allUsers.get(name).add(allergy);
        }
    }

    public ArrayList<String> getAllergies(String name){
        return allUsers.get(name);
    }

    public HashMap<String, ArrayList<String>> getAllUsers() {
        return allUsers;
    }
}
