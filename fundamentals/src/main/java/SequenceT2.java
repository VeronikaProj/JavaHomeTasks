import java.util.Formatter;

public class SequenceT2 {


  static public int defineMinElem(double e) throws Exception {
    if(e<0) throw new Exception("The value must be not less then 0. Otherwise sequence is "
                                    + "infinite ");
    int n = 0;
    double a=0;
    do {
      n++;

        a = calculate(n);

    }
    while (a>= e);
    return n - 1;
  }

  static double calculate(int n) throws Exception{
    if (n<1) throw new Exception("Wrong argument n=-1. Division by zero occurred");
    return 1 / Math.pow(1 + n, 2);
  }

  public static String Sequence(double e) {

    double temp;
    Formatter formatter=new Formatter();
    try {
      int n = defineMinElem(e);
      formatter.format("Sequence defined for e=%.2f. Min element index is %d%n", e, n);
      for (int i = 1; i <= n; i++) {
                  formatter.format("A(%d)=%f \n", i, calculate(i));
      }
    }
    catch (Exception e1){
      formatter.format(e1.getMessage());
    }
    return formatter.toString();

  }

}