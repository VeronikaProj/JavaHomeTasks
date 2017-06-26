  import java.util.Formatter;


  public class CycleT3 {
    static double calculate(double x) throws Exception{
      try {
        return Math.tan(2*x)-3;
      }
      catch(Exception e) {throw new Exception("There is no tangent with this argument :"+2*x);}

    }

    static String calculateCycle(double a, double b,double step) throws Exception{

      if (step==0) throw new Exception("Value of step must be non-zero");

      if ((a>b)&&(step>0)) throw new Exception("A must be less or equal to B when step is positive");

      if ((a<b)&&(step<0)) throw new Exception("A must be bigger or equal to B when step is "
                                                   + "negative");
      double temp;
      Formatter formatter=new Formatter();
      int i=1;
      double arg;

      for( arg=a;(arg-b)<0.00001;arg+=step)
        try {
      System.out.print('d');
          temp = calculate(arg);
          formatter.format("%d) A(%.2f)=%.2f%n",i, arg, temp);
          i++;
        } catch (Exception e) {
          formatter.format(e.getMessage());
        }
      System.out.println(arg);
      return formatter.toString();
    }

   /*public static void main(String[] args) {
     System.out.println(Math.tan((Math.PI/4*2)));
      try {

        System.out.println(CycleT3.calculateCycle(2.5, 4.5, 0.5));
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }*/
  }

