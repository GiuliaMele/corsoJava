import java.util.Random;

public class StringaCasuale {
    public static void main(String[] args) {

        Random rand = new Random();
        /* String[] random = {"Andrea","Marco","Melvin"};


        System.out.println(StringaCasuale.stringaCasuale(random,randomValue)); Primo Metodo Estrazione Random*/
        //String[] random = {"Andrea","Marco","Melvin", "Melvin","Melvin","Andrea"};Secondo Metodo estrazione Random più possibilità per Andrea e Melvin



    }

    public static String stringaCasuale(String[] random, int randomValue){

        return random[randomValue];
    }

}