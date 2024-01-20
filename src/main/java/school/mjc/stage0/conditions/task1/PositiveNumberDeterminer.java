package school.mjc.stage0.conditions.task1;

public class PositiveNumberDeterminer {
    public void isPositive(int numberToBeDetermined) {
        while(true) {
            if (numberToBeDetermined >= 0) {
                System.out.println(true);
                break;
            }
            if (numberToBeDetermined <= 0) {
                System.out.println(false);
                break;
            }
        }
    }
}

