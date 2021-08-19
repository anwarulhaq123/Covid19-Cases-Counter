import java.io.*;
import java.util.*;

public class CovidArrayListFile {

    public static void main(String[] args) throws FileNotFoundException, IOException {
	//Create Arraylist for Covid Objects
        ArrayList<Covid> covidList = new ArrayList<>();

        //Create objects to open file and write to it.
        FileOutputStream fos = new FileOutputStream("Covid.txt",true);
        ObjectOutputStream os = new ObjectOutputStream(fos);
        // Create the Scanner object to take the user Input

        Scanner keyboardIn = new Scanner(System.in);
        //Declare the variables to take the user Input
        String countyName;
        int noCases, noMales, noFemales, medianAge;

        for( int i = 0; i < 5 ; i++){

            System.out.print("Enter the County Name :");

            countyName = keyboardIn.nextLine();

            do{
                System.out.print("Enter the Number of Cases: ");
                noCases = keyboardIn.nextInt();
                if(noCases < 0){
                    System.out.println("Please Enter the positive numbers only");
                }
            }

            while(noCases < 0);

            do{
                System.out.print("Enter the Number of Males Patients: ");
                noMales = keyboardIn.nextInt();
                if(noMales < 0){
                    System.out.println("Please Enter the positive numbers only");
                }
            }while(noMales < 0);

            do{
                System.out.print("Enter the Number of female Patients: ");
                noFemales = keyboardIn.nextInt();
                if(noFemales < 0){
                    System.out.println("Please Enter the positive numbers only");
                }
            }while(noFemales < 0);

            do{
                System.out.print("Enter the median age : ");
                medianAge = keyboardIn.nextInt();
                if(medianAge < 0){
                    System.out.println("Please Enter the positive numbers only");
                }
            }while(medianAge < 0);

            covidList.add(new Covid(countyName,noCases,noMales,noFemales,medianAge));

            keyboardIn.nextLine();


        }//End for Loop.


        //Write ArrayList to file ;
        os.writeObject(covidList);
        //close file and output stream
        fos.close();
        os.close();
        System.out.println("File successfully created");


    }//end main method
}//end class
