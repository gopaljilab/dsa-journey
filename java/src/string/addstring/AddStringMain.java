package string.addstring;

public class AddStringMain {
    public static void main(String[] args) {
        String num1 = "3876620623801494171";
        String num2 = "6529364523802684779";
        System.out.println("Input : num1 = " + num1 + " , num2 = " + num2);
        AddStringSol sol = new AddStringSol();
        String result = sol.addString(num1, num2);
        System.out.println("Output : " + result);
    }
}
