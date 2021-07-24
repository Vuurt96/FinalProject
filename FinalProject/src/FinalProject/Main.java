package FinalProject;
import java.util.*;


public class Main {

    // Global variables which will be used in methods being called into the main function
    public static int age, height, fitnessGoal;
    public static double weight;
    public static String sex;

    public static void main(String[] args) {
        //Welcome Message
        System.out.println("\nI am glad to welcome you on your fitness journey!");

        // Questionnaire for the user
        questionnaire();

        // Calling function that will perform procedures related to the macros and results
        fitnessCalculator();

    }

    // Method one: Ask user basic questions in order to proceed into the fitness journey
    public static void questionnaire(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPlease enter your sex to begin: (Male/Female)");
        sex = scanner.nextLine();

        System.out.println("Please input your age: ");
        age = scanner.nextInt();

        System.out.println("Now please input your height in inches: ");
        height = scanner.nextInt();

        System.out.println("Next, please input your weight in pounds: ");
        weight = scanner.nextDouble();

        System.out.println("Please input your fitness goals: " +
                "\n1 - Lose Weight" +
                "\n2 - Gain Weight" +
                "\n3 - Maintain Weight.");
        fitnessGoal = scanner.nextInt();
    }

    public static void fitnessCalculator(){
        double calories = 0;
        double proteinIntake = 0;
        double fatIntake = 0;
        double carbIntake = 0;


        if (sex.equalsIgnoreCase("Male") && fitnessGoal == 1) {


            calories = LoseWeight.MaleWeightLoss(age, height, weight, fitnessGoal);

            carbIntake = Macros.carbIntake(calories);
            proteinIntake = Macros.proteinIntake(calories);
            fatIntake = Macros.fatIntake(calories);

            System.out.println("----------------------------------------------------------------------------------------------------" +
                    "\nCongratulations on the first step of your fitness journey.\n" +
                    "----------------------------------------------------------------------------------------------------" +
                    "\nResults" +
                    "\n----------------------------------------------------------------------------------------------------"+
                    "\n" + "Total calories you should be consuming is: " + calories  +
                    "\n" + "Total amount of calories from carbs:  \t" + carbIntake + "\n" +
                    "Total amount of calories from protein: \t" + proteinIntake + "\n" +
                    "Total amount of calories from fats:  \t" + fatIntake +
                    "\n----------------------------------------------------------------------------------------------------"+
                    "\n" + "Good luck on this lifelong endeavor. Remember, fitness is not a destination. It is a journey!"+
                    "\n----------------------------------------------------------------------------------------------------");


        } else if (sex.equalsIgnoreCase("Female") && fitnessGoal == 1) {


            calories = LoseWeight.FemaleWeightLoss(age, height, weight, fitnessGoal);

            carbIntake = Macros.carbIntake(calories);
            proteinIntake = Macros.proteinIntake(calories);
            fatIntake = Macros.fatIntake(calories);

            System.out.println("----------------------------------------------------------------------------------------------------" +
                    "\nCongratulations on the first step of your fitness journey.\n" +
                    "----------------------------------------------------------------------------------------------------" +
                    "\nResults" +
                    "\n----------------------------------------------------------------------------------------------------"+
                    "\n" + "Total calories you should be consuming is: " + calories  +
                    "\n" + "Total amount of calories from carbs:  \t" + carbIntake + "\n" +
                    "Total amount of calories from protein: \t" + proteinIntake + "\n" +
                    "Total amount of calories from fats:  \t" + fatIntake +
                    "\n----------------------------------------------------------------------------------------------------"+
                    "\n" + "Good luck on this lifelong endeavor. Remember, fitness is not a destination. It is a journey!"+
                    "\n----------------------------------------------------------------------------------------------------");


        } else if (sex.equalsIgnoreCase("Male") && fitnessGoal == 2) {

            calories = GainWeight.MaleGainWeight(age, height, weight, fitnessGoal);

            carbIntake = Macros.carbIntake(calories);
            proteinIntake = Macros.proteinIntake(calories);
            fatIntake = Macros.fatIntake(calories);

            System.out.println("----------------------------------------------------------------------------------------------------" +
                    "\nCongratulations on the first step of your fitness journey.\n" +
                    "----------------------------------------------------------------------------------------------------" +
                    "\nResults" +
                    "\n----------------------------------------------------------------------------------------------------"+
                    "\n" + "Total calories you should be consuming is: " + calories  +
                    "\n" + "Total amount of calories from carbs:  \t" + carbIntake + "\n" +
                    "Total amount of calories from protein: \t" + proteinIntake + "\n" +
                    "Total amount of calories from fats:  \t" + fatIntake +
                    "\n----------------------------------------------------------------------------------------------------"+
                    "\n" + "Good luck on this lifelong endeavor. Remember, fitness is not a destination. It is a journey!"+
                    "\n----------------------------------------------------------------------------------------------------");


        } else if (sex.equalsIgnoreCase("Female") && fitnessGoal == 2) {

            calories = GainWeight.FemaleGainWeight(age, height, weight, fitnessGoal);

            carbIntake = Macros.carbIntake(calories);
            proteinIntake = Macros.proteinIntake(calories);
            fatIntake = Macros.fatIntake(calories);

            System.out.println("----------------------------------------------------------------------------------------------------" +
                    "\nCongratulations on the first step of your fitness journey.\n" +
                    "----------------------------------------------------------------------------------------------------" +
                    "\nResults" +
                    "\n----------------------------------------------------------------------------------------------------"+
                    "\n" + "Total calories you should be consuming is: " + calories  +
                    "\n" + "Total amount of calories from carbs:  \t" + carbIntake + "\n" +
                    "Total amount of calories from protein: \t" + proteinIntake + "\n" +
                    "Total amount of calories from fats:  \t" + fatIntake +
                    "\n----------------------------------------------------------------------------------------------------"+
                    "\n" + "Good luck on this lifelong endeavor. Remember, fitness is not a destination. It is a journey!"+
                    "\n----------------------------------------------------------------------------------------------------");

        } else if (sex.equalsIgnoreCase("Male") && fitnessGoal == 3) {

            calories = MaintainWeight.MaleMaintainWeight(age, height, weight, fitnessGoal);

            carbIntake = Macros.carbIntake(calories);
            proteinIntake = Macros.proteinIntake(calories);
            fatIntake = Macros.fatIntake(calories);

            System.out.println("----------------------------------------------------------------------------------------------------" +
                    "\nCongratulations on the first step of your fitness journey.\n" +
                    "----------------------------------------------------------------------------------------------------" +
                    "\nResults" +
                    "\n----------------------------------------------------------------------------------------------------"+
                    "\n" + "Total calories you should be consuming is: " + calories  +
                    "\n" + "Total amount of calories from carbs:  \t" + carbIntake + "\n" +
                    "Total amount of calories from protein: \t" + proteinIntake + "\n" +
                    "Total amount of calories from fats:  \t" + fatIntake +
                    "\n----------------------------------------------------------------------------------------------------"+
                    "\n" + "Good luck on this lifelong endeavor. Remember, fitness is not a destination. It is a journey!"+
                    "\n----------------------------------------------------------------------------------------------------");

        } else if (sex.equalsIgnoreCase("Female") && fitnessGoal == 3) {

            calories = MaintainWeight.FemaleMaintainWeight(age, height, weight, fitnessGoal);

            carbIntake = Macros.carbIntake(calories);
            proteinIntake = Macros.proteinIntake(calories);
            fatIntake = Macros.fatIntake(calories);

            System.out.println("----------------------------------------------------------------------------------------------------" +
                    "\nCongratulations on the first step of your fitness journey.\n" +
                    "----------------------------------------------------------------------------------------------------" +
                    "\nResults" +
                    "\n----------------------------------------------------------------------------------------------------"+
                    "\n" + "Total calories you should be consuming is: " + calories  +
                    "\n" + "Total amount of calories from carbs:  \t" + carbIntake + "\n" +
                    "Total amount of calories from protein: \t" + proteinIntake + "\n" +
                    "Total amount of calories from fats:  \t" + fatIntake +
                    "\n----------------------------------------------------------------------------------------------------"+
                    "\n" + "Good luck on this lifelong endeavor. Remember, fitness is not a destination. It is a journey!"+
                    "\n----------------------------------------------------------------------------------------------------");

        }else{
            System.out.println("You have provided an invalid option!");
        }
    }


}