public class FutureTuition {
    public static void main(String[] args) {

        double currentTuition = 10000;
        int doubledTuition = 20000;
        int years = 0;

        for (int i = 0; currentTuition < doubledTuition; i++) {
            currentTuition = currentTuition * 1.07; //reassign currenttuition so that each iteration will pick up the new value
            years++; //need to increment the years as well
            System.out.println(i+":"+currentTuition); //attempts to debug
        }
        System.out.println(years-1);


    }
}
