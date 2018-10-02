public class StringCalculator {

    public int add(String numbers) {
        if (isEmptyInput(numbers)){
            return getDefaultOutput();
        }
        if (numbers.contains(",")){
            return sumMultiple(numbers);
        }
        else{
            return sumSingle(numbers);
        }
    }

    protected int getDefaultOutput() {
        return 0;
    }

    protected boolean isEmptyInput(String numbers) {
        return numbers.length()==0;
    }

    protected int sumSingle(String numbers) {
        return Integer.parseInt(numbers);
    }

    protected int sumMultiple(String numbers) {
        int num1 = sumSingle(String.valueOf(numbers.charAt(0)));
        int num2 = sumSingle(String.valueOf(numbers.charAt(2)));
        return num1+num2;
    }
}
