package aplicacion;
import automovil.Automovil;

/**
 * @catas
 * @version 12/10/2019
 */
public class AplAutomovil {
  public static void main(String[] args) {
    Automovil carrito = new Automovil("Ian McKellen", "87986545", "Ford", "Amarillo");
    Automovil carrito2 = new Automovil("Sherlock Holmes", "87976454", "Nissan", "Gris");

    carrito.cambiarColor("Rojo");
    carrito.cambiarDuenio("Emma Watson", "87452156");
    carrito.repararAutomovil();

    System.out.println(carrito.toString());
    carrito2.chocarAutomovil();
    carrito2.cambiarDuenio("Ismael Vega", "81018002");

    System.out.println(carrito2.toString());

    carrito2.repararAutomovil();
    carrito2.cambiarDuenio("Natalia Pereira", "89090204");
    System.out.println(carrito2.toString());

    carrito.cambiarColor("Blanco");
    carrito2.cambiarColor("Celeste  ");
    System.out.println(carrito.toString());
    System.out.println(carrito2.toString());
  }
}
