package tema7_8_9.exercises;


public class Exercise2 {
    // Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.

    public static void main(String[] args) {

        int[][] biArray = {
                {1,2,3,4,5},
                {10,20,30}
        };
        for(int i = 0; i < biArray.length; i++){
            for(int j = 0; j < biArray[i].length; j++){
                System.out.println("Row number: " + i + " Column number: " + j + " Value: " + biArray[i][j]);
            }
        }

    }

}
