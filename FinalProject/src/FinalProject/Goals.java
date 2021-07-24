package FinalProject;

class LoseWeight {

    public static double MaleWeightLoss(int age, int height, double weight, int fitnessGoal) {
        double BMR;

        BMR = 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);

        //I will multiply the BMR times the average activity of a person which is light exercise 1-3 days/week
        double calories = (BMR * 1.375) - 500;

        return Math.round(calories);

    }

    public static double FemaleWeightLoss(int age, int height, double weight, int fitnessGoal) {
        double BMR;

        BMR = 655 + (4.3 * weight) + (4.7 * height) - (4.7 * age);

        //I will multiply the BMR times the average activity of a person which is light exercise 1-3 days/week
        double calories = (BMR * 1.375) - 500;

        return Math.round(calories);
    }

}

class GainWeight {

    public static double MaleGainWeight(int age, int height, double weight, int fitnessGoal) {
        double BMR;

        BMR = 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);

        //I will multiply the BMR times the average activity of a person which is light exercise 1-3 days/week
        double calories = (BMR * 1.375) + 500;

        return Math.round(calories);

    }

    public static double FemaleGainWeight(int age, int height, double weight, int fitnessGoal) {
        double BMR;

        BMR = 655 + (4.3 * weight) + (4.7 * height) - (4.7 * age);

        //I will multiply the BMR times the average activity of a person which is light exercise 1-3 days/week
        double calories = (BMR * 1.375) + 500;

        return Math.round(calories);
    }
}

class MaintainWeight {

    public static double MaleMaintainWeight(int age, int height, double weight, int fitnessGoal) {
        double BMR;

        BMR = 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);

        //I will multiply the BMR times the average activity of a person which is light exercise 1-3 days/week
        double calories = (BMR * 1.375);

        return Math.round(calories);
    }

    public static double FemaleMaintainWeight(int age, int height, double weight, int fitnessGoal) {
        double BMR;

        BMR = 655 + (4.3 * weight) + (4.7 * height) - (4.7 * age);

        //I will multiply the BMR times the average activity of a person which is light exercise 1-3 days/week
        double calories = (BMR * 1.375);

        return Math.round(calories);
        }
    }
