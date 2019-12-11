package logicadenegocios;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

/**
* @author catas
* @version 1
*/

public class Cuenta {
  private int numCuenta = 0;
  private String duenio = null;
  private double saldo = 0;
  private Date fechaCreacion;
  
  private static int sCantCuentas = 0;
  
  /**
  * inicializador
  * @param pNombre, pMonto, el nombre del dueño de la cuenta y el
  * monto inicial de la cuenta
  */
  public Cuenta(String pNombre, double pMonto){
    sCantCuentas++;
    setNumCuenta(sCantCuentas);
    depositar(pMonto);
    setDuenio(pNombre);
    setFechaCreacion();
  }
  
  /**
  * método para depositar en la cuenta de un cliente
  * @param pMonto el monto a depositar
  * @return el dato del saldo luego del depósito
  */
  public String depositar(double pMonto) {
    saldo += pMonto;
    return "El saldo actual después del depósito es: " + saldo;
  }
  
  public int getNumCuenta() {
    return numCuenta;
  }
  
  public void setNumCuenta(int pNumCuenta){
    this.numCuenta = pNumCuenta;
  }
  
  public String getDuenio() {
    return duenio;
  }
  
  public void setDuenio(String pDuenio){
    this.duenio = pDuenio;
  }
  
  public double getSaldo(){
    return saldo;
  }
  
  public void setFechaCreacion(){
    Calendar calendario;
    calendario = Calendar.getInstance();
    fechaCreacion = calendario.getTime();
  }
  
  public String getFechaCreacion(){
    SimpleDateFormat mascara = new SimpleDateFormat("dd/MM/yy");
    return mascara.format(fechaCreacion);
  }
    
  /**
  * método para validar el retiro de dinero en una cuenta
  * @param pMonto, el monto a validar si es mayor o menor del saldo de la cuenta
  * @return true o false
  */
  private boolean validarRetiro(double pMonto) {
    return pMonto <= saldo;  
  }
  
  /**
  * método para hacer el retiro de dinero
  * @param pMonto, monto a retirar de la cuenta
  * @return mensaje notificando el monto de la cuenta luego del retiro
  */
  public String retirar(double pMonto){
    if(validarRetiro(pMonto)) {
      saldo -= pMonto;
      return "El saldo actual después del retiro es: " + saldo;
    }
    else{
      return "Fondos insuficientes";
    }
  }
  
  /**
  * método utilizado para retornar una representación en cadena
  * de caracteres del estado de un objeto
  * @param no recibe 
  * @return el mensaje con datos del numero de cuenta, fecha de 
  * creación, el nombre del dueño y el saldo actual
  */
  public String toString(){
    String msg;
    msg = "Cuenta número: " + getNumCuenta() +"\n";
    msg += "Fecha creación: " + getFechaCreacion() + "\n";
    msg += "Dueño: " + getDuenio() +"\n";
    msg += "Saldo: " + getSaldo() +"\n";
    return msg;
  }
    
}
