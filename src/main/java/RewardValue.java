public class RewardValue {
    private final double cashValue;
    int miles = 0;
    public static final double  Conversion_Rate = .0035;
    RewardValue(double cashValue){
        this.cashValue = cashValue;
    }
    RewardValue(int distance){
        this.cashValue = convertToCash(distance);
    }

    private static double convertToCash(int distance){
        return (distance * Conversion_Rate);
    }
    private static double convertToMiles(double cashValue){
        return (int)(cashValue / Conversion_Rate);
    }
    public double getCashValue(){
        return cashValue;
    }
    public double getMilesValue(){
        return convertToMiles(cashValue);
    }





}
