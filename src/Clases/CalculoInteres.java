package Clases;
public class CalculoInteres {
   private double interes;
    private double capital;
    private double tasa;
    private double tiempo;
    private double monto;
    private double valorfuturo;
    private double interescompuesto;
    private double vfinterescompuesto;
    private double vpinterescompuesto;
    private double tiempointerescompuesto;
    private double ninterescompuesto;
    

    private int año;
    private int mes;
    private int dia;

    public void tiempo(double tiempo) {
        this.tiempo = tiempo;
        año = (int) tiempo;
        tiempo -= año;
        tiempo *= 12;        
        mes = (int)tiempo;
       
        tiempo -= mes;
        tiempo *= 30;
        dia = (int) tiempo;        
    }
    public void ValorFuturoInteresSimple(double capital, double tasa, double tiempo){
        valorfuturo=capital*(tasa*tiempo);
    }
    public void calcularInteres(double capital, double tasa, double tiempo) {
        interes = capital * tasa * tiempo;
        monto = capital + interes;        
    }

    public void calcularInteres(double monto, double capital) {
        interes = monto - capital;
        this.monto = monto;
    }

    public void calcularTiempo(double interes, double capital, double tasa) {
        tiempo = interes / (capital * tasa);
        monto = interes + capital;
    }

    public void calcularCapital(double interes, double tiempo, double tasa) {
        capital = interes / (tasa * tiempo);
        monto = capital + interes;
    }

    public void CalcularCapital(double monto, double tiempo, double tasa) {
        capital = monto / (1 + (tasa * tiempo));
        this.monto = monto;
    }

    public void CalcularCapital(double monto, double interes) {
        capital = monto - interes;
        this.monto = monto;
    }

    public void calcularMonto(double capital, double tiempo, double tasa) {
        monto = capital * (1 + (tasa * tiempo));
    }

    public void calcularMonto(double interes, double capital) {
        monto = interes + capital;
    }

    public void CalcularTasa(double interes, double capital, double tiempo) {
        tasa = interes / (capital * tiempo);
        monto = interes + capital;
    }

    public void años(int año, int mes, int dia) {
        tiempo = (double) año + ((double) mes / 12) + ((double) dia / 360); 
        
    }
    
    public void VFinterescompuesto(double pv, double interes, double periodo){
     double rmul;
     rmul=1+interes;
     vfinterescompuesto=pv*Math.pow(rmul,periodo);
     
    }
    
    public void interescompuesto(double valorfinal, double valorinicial,double periodo){
     double dentro,result;
     dentro =valorfinal/valorinicial;
     result=(Math.pow(dentro,1/periodo))-1;
     interescompuesto =result;       
    }
    
    public void VPinterescompuesto(double vf, double i,double n){
     double r;
     r=1+i;
     vpinterescompuesto=vf*Math.pow(r,-n);     
        
    }
    
    public void nic(double vf,double vp,double i){
    
    double div,bajo;
    div =vf/vp;
    bajo=1+i;
 
    ninterescompuesto=Math.log(div) / Math.log(bajo);

     
    
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public double getTasa() {
        return tasa;
    }

    public void setTasa(double tasa) {
        this.tasa = tasa;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public double getValorfuturo() {
        return valorfuturo;
    }

    public void setValorfuturo(double valorfuturo) {
        this.valorfuturo = valorfuturo;
    }

    public double getInterescompuesto() {
        return interescompuesto;
    }

    public void setInterescompuesto(double interescompuesto) {
        this.interescompuesto = interescompuesto;
    }
    
    

    public double getVfinterescompuesto() {
        return vfinterescompuesto;
    }

    public void setVfinterescompuesto(double vfinterescompuesto) {
        this.vfinterescompuesto = vfinterescompuesto;
    }

    public double getVpinterescompuesto() {
        return vpinterescompuesto;
    }

    public void setVpinterescompuesto(double vpinterescompuesto) {
        this.vpinterescompuesto = vpinterescompuesto;
    }

    public double getTiempointerescompuesto() {
        return tiempointerescompuesto;
    }

    public void setTiempointerescompuesto(double tiempointerescompuesto) {
        this.tiempointerescompuesto = tiempointerescompuesto;
    }

    public double getNinterescompuesto() {
        return ninterescompuesto;
    }

    public void setNinterescompuesto(double ninterescompuesto) {
        this.ninterescompuesto = ninterescompuesto;
    }

    

    
    
    
}
