package string.dateintobinary;


public class DateIntoBinary {
    public static String convertDateToBinary(String date) {

        String[] parts = date.split("-");
        StringBuffer binaryDate = new StringBuffer();
        for (int i = 0; i < parts.length; i++) {
            int num = Integer.parseInt(parts[i]);
            String binaryPart = Integer.toBinaryString(num);
            binaryDate.append(binaryPart);
            if (i < parts.length-1)
                binaryDate.append("-");
        }
        return binaryDate.toString();
    }

    public static void main(String[] args) {
        String date = "2080-02-29";
        System.out.println("Date = " + date);
        String dateIntoBinary = convertDateToBinary(date);
        System.out.println("Output = " + dateIntoBinary);
    }
}
