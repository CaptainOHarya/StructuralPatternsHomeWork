package structuralpatterns.adapterHomeWork;

/**
 * @author Leonid Zulin
 * @date 30.12.2022 23:09
 */
public interface Ints {
    //метод сложения
    int sum(int arg1, int arg2);

    //метод вычитание
    int sub(int arg1, int arg2);

    //метод умножение
    int mult(int arg1, int arg2);

    // метод деление
    double div(int arg1, int arg2);

    // метод возведения в степень
    int pow(int arg1, int arg2);

    // метод вычисления квадратного корня
    double sqrt(int arg1);
}
