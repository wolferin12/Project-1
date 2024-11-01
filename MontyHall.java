import java.util.Random;

public class MontyHall {
    public static void main(String[] args) {
        int rounds=10000; // Number of simmulations
        int switchWins=0;
        int noSwitchWins=0;
        // Random number generator that simulates door choices
        Random doorsGenerator= new Random();
        // Loop through each round 
        for (int i=0; i<rounds; i++){
            // Assigns a car behind one of the three doors
            int car= doorsGenerator.nextInt(3);
            // contestant then makes a choice 
            int doorchoice= doorsGenerator.nextInt(3);
            int goat;
            //Determines whether the door with the goat was chosen or not
            do {
                goat= doorsGenerator.nextInt(3);
            } while (goat ==car||goat==doorchoice);
            //Switch to the remaining door
            int doorSwitch= 3-doorchoice-goat;
            // Checks to see if switching the door wins the car
            if (doorSwitch==car){
                switchWins++;
            } else if (doorchoice == car){noSwitchWins++;}
        }
        System.out.println("Wins without switching: " + noSwitchWins+ "("+(double)noSwitchWins/rounds *100+"%)");
        System.out.println("Wins with switching: " + switchWins+ "("+(double)switchWins/rounds *100+"%)");
    }
}
