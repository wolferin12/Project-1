import java.util.Random;

public class MontyHall {
    public static void main(String[] args) {
        int rounds=10000;
        int switchWins=0;
        int noSwitchWins=0;
        Random doorsGenerator= new Random();

        for (int i=0; i<rounds; i++){
            int car= doorsGenerator.nextInt(3);

            int doorchoice= doorsGenerator.nextInt(3);
            int goat;
            do {
                goat= doorsGenerator.nextInt(3);
            } while (goat ==car||goat==doorchoice);
            int doorSwitch= 3-doorchoice-goat;
            if (doorSwitch==car){
                switchWins++;
            } else if (doorchoice == car){noSwitchWins++;}
        }
        System.out.println("Wins without switching: " + noSwitchWins+ "("+(double)noSwitchWins/rounds *100+"%)");
        System.out.println("Wins with switching: " + switchWins+ "("+(double)switchWins/rounds *100+"%)");
    }
}
