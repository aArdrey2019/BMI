import java.util.Scanner;

public class BMI {

    public static void main(String [] args){
        double userHeight;
        double userWeight;
        double convertToInches;
        double restInches;
        double convertToMeters;
        double poundToKg;
        Scanner keyboard;

        convertToInches = 12;
        convertToMeters = 0.0254;
        poundToKg = 0.453592;

        keyboard = new Scanner(System.in);

        System.out.println("Height in feet");
        userHeight = keyboard.nextDouble();
        System.out.println("inches");
        restInches = keyboard.nextDouble();
        //coverting height to inches
        userHeight = (userHeight*12)+restInches;
        //convert to meters
        userHeight = userHeight*convertToMeters;
        System.out.println("Weight in lbs");
        userWeight = keyboard.nextDouble();
        userWeight = userWeight*poundToKg;
        System.out.println(userWeight/(userHeight*userHeight));
    }
}
