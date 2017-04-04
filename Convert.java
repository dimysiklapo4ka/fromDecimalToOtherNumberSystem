package fromDecimalToOtherNumberSystem;

/**
 * Created by d1mys1klapo4ka on 04.04.2017.
 */
public class Convert {

    public static void main(String[] args) {

        //String dec = decToBin(15);
       // System.out.println(decToBin(17));
        System.out.println(new Convert().binToDec("01010101"));
    }

    static String decToBin(int num){

        String  bin = new String();

        if (num < 0 || num > Short.MAX_VALUE){
            return "Введите число больше 0 и меньше " + Short.MAX_VALUE + ".";
        }

        while (num > 1){

            //bin = bin + num % 2;
            bin = num % 2 + bin;

            num = num / 2;
        }
        bin = num + bin;

        int n = bin.length() % 4;
        for (int i = 0; i < n; i++){

            bin = 0 + bin;

        }

        return bin;
    }

    int binToDec(String bin){
        //check
        int dec = 0;
        StringBuffer bin1 = new StringBuffer(bin);
        bin1.reverse();
        //for (int i = bin.length() - 1; i >= 0; i--) {
        for (int i = 0; i < bin1.length(); i++) {
            dec += Integer.parseInt(String.valueOf(bin1.charAt(i))) * (int)Math.pow(2, i);
           // int x = Integer.parseInt(s);

        }
        return dec;
    }
}
