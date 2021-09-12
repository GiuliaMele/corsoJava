import java.util.Random;
public class RandomClass {

    public static void main(String args[])
    {
        System.out.println(RandomClass.lanciaDado());
    }


    private static int lanciaDado()
    {
        // ritornare un valore da un dado a 6 facce;

        Random rand= new Random();
        int randomValue = rand.nextInt(6);
        int valoreDado = 1 + randomValue;
        return valoreDado;
    }


}



