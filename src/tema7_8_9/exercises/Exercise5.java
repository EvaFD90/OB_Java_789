package tema7_8_9.exercises;

import java.util.ArrayList;
import java.util.LinkedList;

public class Exercise5 {

    // Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>(4);

        names.add("Robin");
        names.add("John");
        names.add("Marian");
        names.add("Tuck");

        LinkedList<String> linkedNames = new LinkedList<String>(names);

        for (String name : linkedNames){
            System.out.println(name);
        }
    }
}
