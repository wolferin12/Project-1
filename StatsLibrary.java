import java.util.ArrayList;
import java.util.Arrays;


public class StatsLibrary {
//Calculates the mode
    static int getMode(int[] m, int v){
        int valueMax=0;
        int countMax=0;

        for (int i=0; i<v; i++){
            int counter=0;
            for (int j=0; j<v; j++){
                if (m[j]==m[i])
                    counter++;
            }
           if (counter>countMax){
               countMax=counter;
               valueMax=m[i];
           }
        }
        return valueMax;
    }
    //Calculates the Median
    static int getMedian(int[] math ){
        if (math.length%2==0){
            int middle=math.length/2;
            return (math[middle]+math[middle-1])/2;
        }
        return math[math.length/2];
    }
    //Calculates the standard deviaton
    static double getStandardDeviation(double[]fun){
        double total=0.0;
        for(double i: fun){
            total+=i;
        }
        int length = fun.length;
        double mean= total/length;

        double standardDeviation =0.0;
        for (double var: fun){
            standardDeviation += Math.pow(var - mean, 2);
        }
        return Math.sqrt(standardDeviation/length);
    }
    //Calculates factorials
    static int Factorial(int b){
        int factorial=1;
        int e=1;
        while (e <= b){
            factorial *=e;
            e++;
        }
        return factorial;
    }

    public static void main(String[] args) {
       //Array list of numbers
        ArrayList<Integer> listOfNumbers= new ArrayList<>();
        //Populates the array list with numbers
        for (int i=0; i<100; i++){
            listOfNumbers.add(i);
        }
        int sum=0;
        for (int singleNumber : listOfNumbers){
            sum=sum+singleNumber; 
        }
        
        System.out.println("Mean: "+sum/(double)listOfNumbers.size());
        
        //Calculates the mean
        double mean= sum/(double)listOfNumbers.size();
        
        int[] math= {2,10,20,28,30,32,45};
        System.out.println("Median: "+getMedian(math));

        int[] vam= {0,29,29,73,89};
        int v=5 ;
        System.out.println("Mode: "+getMode(vam,v));

        double [] fun={34, 5, 6, 90, 30, 45, 39,29};
        System.out.println("Standard Deviation:" + getStandardDeviation(fun));

        int b= 7;
        int y= 3;
        int combination;
        int permutation;
        permutation= Factorial(b)/Factorial(b-y); //Calculates a permutation
        System.out.println("Permutation: "+permutation);
        combination= Factorial(b)/(Factorial(y)*Factorial(b-y)); //Calculates a Combination
        System.out.println("Combination: "+combination);

    }
}
