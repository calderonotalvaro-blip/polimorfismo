/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package envios.app;

/**
 *
 * @author 57312
 */
import envios.modelo.Camion;
import envios.modelo.Moto;
import envios.modelo.Vehiculo;

public class PruebaHerencia {
    public static void main(String[] args) {
        Moto m1 = new Moto("MZL12A", 20, 150);
        Camion c1 = new Camion("WFT345", 8000, 2);

        System.out.println(m1.describir());
        System.out.println(c1.describir());
        System.out.println(m1.getPlaca());
        System.out.println(c1.getEjes());
        System.out.println(m1 instanceof Vehiculo);
    }
}