package numbers;

public class PerfectNumbers {
    public boolean isPerfectNumber(int number){
        if(number<1){
            return false;
        }
        return makeDecision(number);
    }

    private boolean makeDecision(int number) {
        int sumOfDivisors=1;
        for(int i=2;i<=number/2;i++){
            if(number%i==0){
                sumOfDivisors+=i;
            }
        }
        return sumOfDivisors==number;
    }
}