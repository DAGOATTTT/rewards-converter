public class RewardValue {
    long cash = 0;
    double miles = 0;
    RewardValue(long cash){
        this.cash = cash;
    }
    RewardValue(double distance){
        this.miles = distance;
    }

    public double getMilesValue() {
        return (miles * .0035);
    }

    public double getCashValue() {
        return cash;
    }



}
