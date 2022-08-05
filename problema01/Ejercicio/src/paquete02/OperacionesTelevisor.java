/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import java.util.ArrayList;
import paquete01.Televisor;

/**
 *
 * @author Joe
 */
public class OperacionesTelevisor {
     public ArrayList<Televisor> lista;
    public double totalPrecios;
    public double televisorMasCaro;
    public String listaMarcasVendidas;

    public void establecertelevisor(ArrayList<Televisor> lista1) {
        lista = lista1;
    }

    public ArrayList<Televisor> obtenertelevisor() {
        return lista;
    }


    public void establecertotalPrecioTvs() {
        double s = 0;
        for (int i = 0; i < lista.size(); i++) {
            s = s + lista.get(i).obtenerPrecio();
            //System.out.println(s);
        }
        totalPrecios = s;
    }


    public void establecertelevisorMasCaro() {
        televisorMasCaro = lista.get(0).obtenerPrecio();
        for (int i = 0; i < lista.size(); i++) {
           if(lista.get(i).obtenerPrecio()> televisorMasCaro ){
               televisorMasCaro = lista.get(i).obtenerPrecio();
           }
        }
    }


    public void establecerlistaMarcasVendidas() {
        String s = "";
        for (int i = 0; i < lista.size(); i++) {
            s = String.format("%s%s\n", s, lista.get(i).obtenerMarca());
        }
        listaMarcasVendidas = s;
    }

    public double obtenertotalPrecios() {
        return totalPrecios;
    }

    public double obtenertelevisorMasCaro() {
        return televisorMasCaro;
    }

    public String obtenerlistaMarcasVendidas() {
        return listaMarcasVendidas;
    }

    @Override
    public String toString() {

        String listado = String.format("");
        listado = String.format("%s\n"
                + "Total Precios: %s\n"
                + "Televisor mas Caro:  %s\n"
                + "Marcas mas Vendidas: %s\n",
                listado, obtenertotalPrecios(),
                obtenertelevisorMasCaro(),
                obtenerlistaMarcasVendidas());
        return listado;

    }
}
