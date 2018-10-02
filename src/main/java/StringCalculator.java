public class StringCalculator {

    public int add(String numbers) {
        if (numbers.length()==0){
            return 0;
        }
        if (numbers.contains(",")){
            int num1 = Integer.parseInt(String.valueOf(numbers.charAt(0)));
            int num2 = Integer.parseInt(String.valueOf(numbers.charAt(2)));
            return num1+num2;
        }
        else{

            return  Integer.parseInt(numbers);
        }
    }
}
