interface caculator{
    double Add(double a, double b);
    double Sub(double a, double b);
    double Multiply(double a, double b);
    double Divide(double a, double b);
    int Div(int x, int y) ;
    int Mod(int x, int y) ;
    double Pow(double a, int np);
  
  }
 public class Calculator implements caculator{
    
  
    public double Add(double x, double y) {
       
        return  x+y;
    }
    public   double Sub(double x, double y) {
       
        return x-y;
    }
    public  double Multiply(double x, double y) {
        return x * y;
    }
    public double Divide(double x, double y) {
        return  x / y;
    }
    public int Div(int x, int y) {
      return  x / y;
    }
    public int Mod(int x, int y) {
      return  x % y;
    }
    public double Pow(double a, int np){
      if (np==0){
        return 1;
      }else{
        return a*Pow(a, np-1);
      }
    }
    public double Root(double a, int np){
      if(a==0)
        return 0;
      double xk=a/2;
      //System.out.println(xk);
      double xk1=((double)1/(double)np)*(((double)np-(double)1)*xk+a/(Pow(xk, np-1)));
      //System.out.println(xk1);
      while((xk-xk1)*(xk-xk1)>0.000001*0.000001){
        xk=xk1;
        xk1=((double)1/(double)np)*(((double)np-(double)1)*xk+a/(Pow(xk, np-1)));
        //System.out.println(xk);

      }

      return xk;
    }
  }