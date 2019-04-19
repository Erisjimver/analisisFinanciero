package Clases;
public class PeriodoTiempo {
        String resultado;
        double tiempo;   
      public Double CalcularTiempo(double capital, double interes,double monto){ 
         resultado=(""+Math.log(capital/monto)/(Math.log(1+interes)));
         tiempo=Double.parseDouble(resultado);
         
         return tiempo;
     }


    
}
