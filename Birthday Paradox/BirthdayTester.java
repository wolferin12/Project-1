

public class BirthdayTester{
    // Tests to see if there are any hits of a shared birthday in the class
    private static boolean hasBirthdayMatch(int classNumber){
        //Array to hold the people in the room
        Person[] room = new Person[classNumber];
        //Array that tracks what birthdays have been checked
        boolean [] birthday= new boolean[365];
        // Iterates through each person in the class
        for (int i=0; i<classNumber; i++){
            room [i]= new Person();
            int birth= room[i].birthday;
           //Checks if the birthday has already been checked
            if (birthday[birth-1]){
                return true;
            }else {
                birthday[birth-1]=true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
      int classNumber= 35; //Number of people in the room
      int trial= 10; //Number of trials

      int collection=0;
      //Runs ,ultiple trials to estimate the probability  
      for (int i=0; i<trial; i++){
          if(hasBirthdayMatch(classNumber)){
              collection++;
          }
      }
     //Calculates the probability
      double prob = (double) collection/trial;

      System.out.println("The Probability of two people sharing a birthday in a room of "+classNumber+": ");
      System.out.println(prob*100+ "%");

    }

}
