package tema7_8_9.exercises;

import java.util.Vector;

public class Exercise3and4 {
    // Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.

    public static void main(String[] args) {

         Vector<String> vector = new Vector<>(5,2 );

         vector.add("Robin Hood");
         vector.add("Nottingham's Sheriff");
         vector.add("King Richard");
         vector.add ("Little John");
         vector.add("Lady Marian");

        System.out.println(vector);

        vector.subList(1,3).clear();

        /*
        vector.remove("Nottigham's Sheriff");
        vector.remove("King Richard");
         */

       System.out.println(vector);

    }
}
//Exercise 4: Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo:
    // La capacidad por defecto es 10, por lo que necesitaría ampliarse a sí mismo varias veces para alcanzar una capacidad de 1000
