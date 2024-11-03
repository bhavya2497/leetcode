import java.math.BigInteger;
import java.util.ArrayList;
class Solution {
    public String removeDigit(String number, char digit) {
        ArrayList<String> numberList = new ArrayList<>();
        StringBuilder newNumber = new StringBuilder(number);

        for(int i = 0; i < newNumber.length(); i++){
            if(newNumber.charAt(i) == digit){
                newNumber.deleteCharAt(i);
                numberList.add(newNumber.toString());
                newNumber = new StringBuilder(number);
            }
        }
        BigInteger result = BigInteger.ZERO;
        for (int i = 0; i < numberList.size(); i++) {
            BigInteger num = new BigInteger(numberList.get(i));
            if (num.compareTo(result) > 0) {
                result = num;
            }
        }
        return result.toString();
    }
}
