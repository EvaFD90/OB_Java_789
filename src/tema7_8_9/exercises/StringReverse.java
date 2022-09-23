package tema7_8_9.exercises;

public class StringReverse {

    // Escribe el código que devuelva una cadena al revés

    public static void main(String[] args) {

        String text = "Robin Hood";
        StringBuilder reverseText = new StringBuilder();

        for (int i = text.length() -1; i >= 0; i--) {
            reverseText.append(text.charAt(i));
        }

        System.out.println(reverseText);


    }
}
