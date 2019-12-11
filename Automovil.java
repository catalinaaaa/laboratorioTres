package automovil;
import java.util.Date;
import java.util.Random;
import java.util.Calendar;
import java.text.SimpleDateFormat;

/**
 * @author catas
 * @version 12/10/2019
 */

public class Automovil {
  private String marca = null;
  private double costo = 0;
  private Integer placa = 0;
  private String color = null;
  private Date fechaDeCompra;
  private String duenioDelMovil = null;
  private String telefonoDelDuenio = null;
  private boolean isChocado = false;
  private boolean colorIgual = false;
  private boolean duenioIgual = false;

  private static Integer cantidadAutomoviles = 0;
  
  /**
  * inicializador
  * @param pNombre, pMonto, el nombre del dueño de la cuenta y el
  * monto inicial de la cuenta
  */
  public Automovil(String pDuenioDelMovil, String pTelefonoDelDuenio, String pMarca, String pColor){
    cantidadAutomoviles++;
    setDuenioDelMovil(pDuenioDelMovil);
    setTelefonoDelDuenio(pTelefonoDelDuenio);
    setPlaca(cantidadAutomoviles);
    setMarca(pMarca);
    setColor(pColor);
    setCosto();
    setFechaDeCompra();
  }
  
  public String getMarca() {
    return marca; 
  }
  
  public void setMarca(String pMarca) {
    this.marca = pMarca; 
  }  
  
  public Integer getPlaca() {
    return placa; 
  }
  
  public void setPlaca(Integer cantidadVehiculos) {
    this.placa = cantidadVehiculos; 
  }
  
  private void setIsChocado(boolean estado) {
    isChocado = estado;
  }
 
  public boolean getIsChocado() {
    return isChocado;
  }
  
  private void setCosto() {
    costo = new Random().nextInt((7000 - 3000) + 1) + 10;
  }
  
  public double getCosto() {
    return costo; 
  }
  
  public String getColor() {
    return color; 
  }
  
  public void setColor(String pColor) {
    this.color = pColor; 
  }
  
  public void setFechaDeCompra(){
    Calendar calendario;
    calendario = Calendar.getInstance();
    fechaDeCompra = calendario.getTime();
  }
  
  public String getFechaDeCompra(){
    SimpleDateFormat mascara = new SimpleDateFormat("dd/MM/yy");
    return mascara.format(fechaDeCompra);
  }
  
  public String getDuenioDelMovil() {
    return duenioDelMovil; 
  }
  
  public void setDuenioDelMovil(String pDuenioDelMovil) {
    this.duenioDelMovil = pDuenioDelMovil; 
  }
  
  public String getTelefonoDelDuenio() {
    return telefonoDelDuenio; 
  }
  
  public void setTelefonoDelDuenio(String pTelefonoDelDuenio) {
    this.telefonoDelDuenio = pTelefonoDelDuenio; 
  }
  
  /**
  * método para validar el cambio de color en un carro
  * @param pColor, el nuevo color
  * @return true o false
  */
  public boolean verificarColor(String pColor){
    return pColor != color;
  }
  
  /**
  * método para hacer el cambio de color del carro
  * @param pColor, nuevo color del carro
  * @return mensaje notificando si el cambio de color fue exitoso
  */
  public String cambiarColor(String pColor){
    if(verificarColor(pColor)){
      setColor(pColor);
      return "El color ha sido cambiado";
    }
    else{
      return "El color del carro es igual al nuevo color";
    }
  }
  
  /**
  * método para validar el cambio del dueño del carro
  * @param ppDuenioDelMovil, el nuevo dueño
  * @return true o false
  */
  public boolean verificarDuenio(String pDuenioDelMovil){
    return pDuenioDelMovil != duenioDelMovil;
  }
  
  /**
  * método para hacer el cambio de dueño del carro
  * @param pDuenioDelMovil y pTelefonoDelDuenio, nuevo dueño del carro y el numero movil
  * @return mensaje notificando si el cambio de dueño fue exitoso
  */
  public String cambiarDuenio(String pDuenioDelMovil, String pTelefonoDelDuenio){
    if(verificarDuenio(pDuenioDelMovil)){
      setDuenioDelMovil(pDuenioDelMovil);
      setTelefonoDelDuenio(pTelefonoDelDuenio);
      return "Cambio de dueño realizado";
    }
    else{
      return "El nombre del nuevo dueño coincide con el nombre del dueño anterior.";
    }
  }
  
  /**
  * método para que el estado del automovil sea "chocado"
  * @return mensaje notificando el cambio de estado
  */
  public void chocarAutomovil() {
    setIsChocado(true);
    System.out.println("El vehículo de placa " + getPlaca() + " ha chocado");
  }
  
  /**
  * método para que el estado del automovil sea "no chocado"
  * @return mensaje notificando el cambio de estado
  */
  public void repararAutomovil() {
    setIsChocado(false);
    System.out.println("El automovil de placa " + getPlaca() + " se ha reparado exitosamente");
  }
  
  /**
  * método para saber cuál es el estado del vehículo
  * @return mensaje notificando el cambio de estado
  */
  public String estado() {
    if (getIsChocado()) {
      return "vehículo chocado";
    }
    else {
      return "vehículo no chocado";
    }
  }
  
  /**
  * método utilizado para retornar una representación en cadena
  * de caracteres del estado de un objeto
  * @param no recibe 
  * @return el mensaje con datos dueño del carro, su número de 
  * teléfono, fecha de compra del carro, marca, color, costo, placa,
  * y estado del vehiculo
  */
  public String toString(){
    String msg;
    msg = "Dueño: " + getDuenioDelMovil() +"\n";
    msg += "Telefono del dueño: " + getTelefonoDelDuenio() + "\n";
    msg += "Fecha de compra: " + getFechaDeCompra() +"\n";
    msg += "Marca: " + getMarca() +"\n";
    msg += "Color: " + getColor() +"\n";
    msg += "Costo: " + getCosto() +"\n";
    msg += "Placa: " + getPlaca() +"\n";
    msg += "Estado: " + estado() +"\n";
    return msg;
  }
}
