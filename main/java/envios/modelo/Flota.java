/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package envios.modelo;

/**
 *
 * @author 57312
 */
import java.util.ArrayList;

public class Flota {
    private String nombre;
    private ArrayList<Vehiculo> vehiculos;

    public Flota(String nombre) {
        this.nombre = nombre;
        this.vehiculos = new ArrayList<>();
    }

    public boolean agregar(Vehiculo vehiculo) {
        if (vehiculo == null || vehiculos.contains(vehiculo)) {
            return false;
        }
        vehiculos.add(vehiculo);
        return true;
    }

    public void mostrar() {
        System.out.println(nombre + ":");
        for (Vehiculo v : vehiculos) {
            System.out.println("- " + v.describir());
        }
    }

    public int cantidadCamiones() {
        int cont = 0;
        for (Vehiculo v : vehiculos) {
            if (!(v instanceof camion)) {
            } else {
                cont++;
            }
        }
        return cont;
    }

    public Vehiculo masEconomico(int pesoKg) {
        Vehiculo mejor = null;
        for (Vehiculo v : vehiculos) {
            if (v.getCapacidadKg() >= pesoKg) {
                if (mejor == null || v.tarifaPorKm() < mejor.tarifaPorKm()) {
                    mejor = v;
                }
            }
        }
        return mejor;
    }

    public double totalSeguros() {
        double total = 0;
        for (Vehiculo v : vehiculos) {
            if (v instanceof Asegurable asegurable) {
                total = asegurable.valorSeguro();
            }
        }
        return total;
    }
}
