package string;

public class AddBinary {
    public static void main(String[] args) {
        String num1 = "11";
        String num2 = "1";
        System.out.println("Output : ");
        String result = add(num1,num2);
        System.out.println(result);
    }
    public static String add(String num1, String num2){
        StringBuilder sb = new StringBuilder();
        int i = num1.length()-1;
        int j = num2.length()-1;
        int carry = 0;
        int sum;
        String result = "";
        while (i >= 0 || j >= 0 || carry>0){
            sum = carry;
            if (i >=0 ){
                sum = sum + (num1.charAt(i)-'0');
                i--;
            }
            if (j >=0 ){
                sum = sum + (num2.charAt(j)-'0');
                j--;
            }
            sb.append(sum%2);
            carry = sum/2;
        }

        return sb.reverse().toString();
    }
}
