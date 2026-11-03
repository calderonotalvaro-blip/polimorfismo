/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package envios.app;

/**
 *
 * @author 57312
 */
import java.util.ArrayList;

import envios.modelo.Asegurable;
import envios.modelo.Bicicleta;
import envios.modelo.Bodega;
import envios.modelo.Camion;
import envios.modelo.Flota;
import envios.modelo.Moto;
import envios.modelo.Vehiculo;

public class Main {
    public static void main(String[] args) {
        Moto m1 = new Moto("MZL12A", 20, 150);
        Camion c1 = new Camion("WFT345", 8000, 2);
        Moto m2 = new Moto("KJH78B", 25, 200);
          new Vehiculo("XYZ999", 50);

        Flota flota = new Flota("Envíos Caldas");
        flota.agregar(m1);
        flota.agregar(c1);
        flota.agregar(m2);
        System.out.println(flota.agregar(m1));   

        flota.mostrar();
        System.out.println(flota.cantidadCamiones());

       
        System.out.println(m1.costoEnvio(12));   
        System.out.println(c1.costoEnvio(12));   

        Bicicleta b1 = new Bicicleta("BIC001", 10);
        flota.agregar(b1);
        flota.mostrar();

        System.out.println(flota.masEconomico(8).getPlaca());   
        System.out.println(flota.masEconomico(22).getPlaca());  
        System.out.println(flota.masEconomico(500).getPlaca());  
        System.out.println(flota.masEconomico(9000));            

        
        System.out.println(m1.valorSeguro());      
        System.out.println(c1.valorSeguro());       
        System.out.println(flota.totalSeguros());   

        ArrayList<Asegurable> asegurables = new ArrayList<>();
        asegurables.add(c1);
        asegurables.add(new Bodega("Bodega Chipre", 300));

        double suma = 0;
        for (Asegurable a : asegurables) {
            System.out.println(a.valorSeguro());
            suma += a.valorSeguro();
        }
        System.out.println(suma);                   
    }
}