package structuralpatterns.facadeHomeWork;

/**
 * @author Leonid Zulin
 * @date 31.12.2022 23:08
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinOps binOps = new BinOps();
        String resultBiSum;
        String resultBiMult;
        System.out.println("Доброго времени суток! Вас привествует программа сложения и перемножения чисел в двоичной системе");

        while (true) {
            System.out.println("Введите два числа в двоичной системе через запятую (для завершения введите 'end')");
            String input = scanner.nextLine();
            if (input.equals("end")) break;
            String[] arrayResult = input.split(",\\s+");
            String a = arrayResult[0];
            String b = arrayResult[1];
            resultBiSum = binOps.sum(a, b);
            resultBiMult = binOps.mult(a, b);
            System.out.println("Результат сложения: " + resultBiSum);
            System.out.println("Результат умножения: " + resultBiMult);

        }

    }


}