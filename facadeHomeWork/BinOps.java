package structuralpatterns.facadeHomeWork;

/**
 * @author Leonid Zulin
 * @date 31.12.2022 23:38
 */
public class BinOps {
    public String sum(String a, String b) {
        String resultBi;
        int resultDec;
        int aDec = Integer.parseInt(a, 2);
        int bDec = Integer.parseInt(b, 2);
        resultDec = aDec + bDec;
        resultBi = Integer.toBinaryString(resultDec);
        return resultBi;
    }
    public String mult(String a, String b) {
        String resultBi;
        int resultDec;
        int aDec = Integer.parseInt(a, 2);
        int bDec = Integer.parseInt(b, 2);
        resultDec = aDec * bDec;
        resultBi = Integer.toBinaryString(resultDec);
        return resultBi;
    }

}
