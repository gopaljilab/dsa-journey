package string;

public class RomanToInt {
    public static int getVal(char choice){
        switch (choice) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default:return 0;
        }
    }

    public static int romanToInt(String s){
        int size = s.length();
        int sum=0;
        for (int i=0; i<size; i++){
            char char1 = s.charAt(i);
            int currentVal = getVal(s.charAt(i));
            if ((i+1)<size && currentVal < getVal(s.charAt(i+1))){
                sum -= currentVal;
            }else {
                sum += currentVal;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        String roman1 = "XIV";
        String roman2 = "MCMXCIV";
        String roman3 = "I";
        String roman4 = "LVIII";
        String roman5 = "III";

        int number1 = RomanToInt.romanToInt(roman1);
        int number2 = RomanToInt.romanToInt(roman2);
        int number3 = RomanToInt.romanToInt(roman3);
        int number4 = RomanToInt.romanToInt(roman4);
        int number5 = RomanToInt.romanToInt(roman5);

        System.out.println("Roman: " + roman1 + " → Integer: " + number1);
        System.out.println("Roman: " + roman2 + " → Integer: " + number2);
        System.out.println("Roman: " + roman3 + " → Integer: " + number3);
        System.out.println("Roman: " + roman4 + " → Integer: " + number4);
        System.out.println("Roman: " + roman5 + " → Integer: " + number5);

    }
}
