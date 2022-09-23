package tema7_8_9.exercises.Exercise9.Seeders;

import tema7_8_9.exercises.Exercise9.Databases.UserDB;

public class UserSeeder {

    public UserDB run(){
        UserDB userDB = new UserDB();

        userDB.create("eva");
        userDB.create("robin");
        userDB.create("john");
        userDB.create("marian");

        userDB.addAllergy("eva", "mango");
        userDB.addAllergy("eva", "banana");
        userDB.addAllergy("eva", "cherry");
        userDB.addAllergy("eva", "kiwi");
        userDB.addAllergy("eva", "nuts");

        userDB.addAllergy("robin", "milk");
        userDB.addAllergy("robin", "egg");

        userDB.addAllergy("john", "fish");
        userDB.addAllergy("john", "peanut");
        userDB.addAllergy("john", "strawberry");

        userDB.addAllergy("marian", "soy");
        userDB.addAllergy("marian", "wheat");

        return userDB;
    }
}
