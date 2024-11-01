import java.util.Random;

public class Person  {
    int birthday; //Stores the birthday

//Assigns a random birthday
    public Person (){
        Random var = new Random();
        // Assigns a ranom birthday 
        birthday= var.nextInt(365)+1;
    }
}
