package InitDnepr.integerBi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by d1mys1klapo4ka on 17.03.2017.
 */
public class IntegerBi {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите число : ");
        int a = Integer.parseInt(reader.readLine());

        System.out.println("Ваше число в двоичной системе будет иметь вид: " + Integer.toBinaryString(a));
        System.out.println("Ваше число в восьмеричной системе: " + Integer.toOctalString(a));
        System.out.println("Ваше число в шеснадцатиричной системе: " + Integer.toHexString(a));

    }
}
