package string.countseniors;

public class CountSeniors {
    public int countSeniors(String[] details) {
        int noSeniorCitizen = 0;
        for (String detail : details) {
            int age = Integer.parseInt(detail.substring(11, 13));
            if (age > 60) {
                noSeniorCitizen++;
            }
        }
        return noSeniorCitizen;
    }
}
