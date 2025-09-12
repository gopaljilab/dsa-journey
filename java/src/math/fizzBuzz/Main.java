package math.fizzBuzz;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        int n = 15;
        System.out.println("Number : " + n);
        FizzBuzzSol sol = new FizzBuzzSol();
        List<String> list = sol.getList(n);
        System.out.println(list);
    }
}
