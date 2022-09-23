package tema7_8_9.exercises;
import java.util.ArrayList;

public class Exercise6 {

    /*
    Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
    A continuación, con otro bucle, recórrelo y elimina los numeros pares.
    Por último, vuelve a recorrerlo y muestra el ArrayList final.
    Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
     */

    public static void main(String[] args) {

        int num = 10;

        ArrayList<Integer> numbers = new ArrayList<>(num);

        for(int i = 1; i <= num; i++){
            numbers.add(i);
        }

        for(int i = 0; i < numbers.size()-1; i++){
            if(numbers.get(i)%2 == 0){
                numbers.remove(i);
            }
                System.out.println(numbers.get(i));
            }
        }
    }
