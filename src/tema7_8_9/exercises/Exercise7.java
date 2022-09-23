package tema7_8_9.exercises;

public class Exercise7 {
    /*
    Crea una función DividePorCero.
    Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException que será capturada por su llamante (desde "main", por ejemplo).
    Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".
     */

    public static void main(String[] args) {

        try{
            divideByZero(6,0);

        } catch (ArithmeticException e) {
            System.out.println("You can't do that");
        } finally {
            System.out.println("Demo");
        }
    }

    public static void divideByZero(int number1, int number2) throws ArithmeticException {
        System.out.println(number1 / number2);
    }
}
