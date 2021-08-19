import java.io.*;
import java.util.*;

public class ReadCovidArrayList {
    public static void main(String[]args)throws FileNotFoundException,IOException,ClassNotFoundException {
        Scanner keyboardIn = new Scanner(System.in);
        //Create object to open file and read from it
        FileInputStream fis = new FileInputStream("Covid.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        ArrayList<Covid> covidList = (ArrayList<Covid>) ois.readObject();

        //Declare the variables.
        int option;

        do{
            System.out.println("*** Covid Processing System ***");
            System.out.println("1. View All data");
            System.out.println("2. View data by county ");
            System.out.println("3. Find county with highest number of cases");
            System.out.println("4. Calculate average age");
            System.out.println("5. Find % number of males and % number of females by county");
            System.out.println("6. Write all details of county with the lowest number of cases to new file");
            System.out.println("0. Exit System");
            System.out.println("Please enter your Option");
            option = keyboardIn.nextInt();

            switch(option){
                case 1:
                for(Covid covid : covidList)
                {
                  System.out.println(covid);
 
                }
                break;
            }




        }while (option != 0);


    }//end main method


}//end class

