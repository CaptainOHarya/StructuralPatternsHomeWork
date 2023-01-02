package structuralpatterns.adapterHomeWork;

/**
 * @author Leonid Zulin
 * @date 30.12.2022 22:46
 */
public class Main {

    public static void main(String[] args) {
        Ints intsCalc = new IntsCalculator();
        System.out.println("Сложение = " + intsCalc.sum(2, 2));
        System.out.println("Сложение = " + intsCalc.sum(10, 22));
        System.out.println("Вычитание = " + intsCalc.sub(43, 33));
        System.out.println("Умножение = " + intsCalc.mult(56, 7));
        System.out.println("Деление = " + intsCalc.div(445, 54));
        System.out.println("Возведение в степень = " + intsCalc.pow(3, 7));
        System.out.println("Возведение в степень = " + intsCalc.pow(2, 10));
        System.out.println("Вычисление квадратного корня из числа= " + intsCalc.sqrt(563));

    }

}
