import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 * Created by OUT-Akopyan-SR on 29.05.2019.
 */
public class Program {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите сумму в рублях");
        double ruble = in.nextDouble();
        System.out.println("Введите текущий курс рубля к доллару");
        double course = in.nextDouble();

        double result = ruble / course;

        System.out.println(new BigDecimal(result).setScale(2, RoundingMode.HALF_UP).floatValue());
    }
}

