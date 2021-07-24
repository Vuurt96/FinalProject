package FinalProject;

class Macros {

    public static double carbIntake(double calories){

        double carbIntake = calories * 0.4;

        return Math.round(carbIntake);
    }
    public static double proteinIntake(double calories){

        double proteinIntake = calories * 0.4;

        return Math.round(proteinIntake);
    }
    public static double fatIntake(double calories){

        double fatIntake = calories * 0.2;

        return Math.round(fatIntake);
    }

}
