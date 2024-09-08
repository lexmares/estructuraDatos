package app;
import clases.*;

import javax.swing.*;
import java.time.LocalDate;


public class MyApp {

    static AsociadoDirectivo[] directivos = new AsociadoDirectivo[50];

    static AsociadoNatural[] naturales = new AsociadoNatural[50];

    static int d = 0;

    static int n = 0;


    static void agregarDirectivo(AsociadoDirectivo socioD) throws Exception{

        if(d  < directivos.length-1){
            directivos[d] = socioD;
            d++;
        }else{
            throw new Exception("Error: Arreglo de directivos lleno");
        }
    }

    static void agregarNatural(AsociadoNatural socioN) throws Exception{

        if(n  < naturales.length-1){
            naturales[n] = socioN;
            n++;
        }else{
            throw new Exception("Error: Arreglo de naturales lleno");
        }
    }

    static void listarDirectivos(){
//        for(int i = 0; i < d; i++){
//            System.out.println("Los asociados directivos son:");
//            System.out.println(directivos[i]);
//        }
        JOptionPane.showMessageDialog(null, listaDeDirectivos());
    }
    static String listaDeDirectivos(){
        String lista = "Los asociados directivos son:";
        for(int i = 0; i < n; i++){
            lista += "\n" + directivos[i];
        }
        return lista;
    }

    static void listarNaturales(){
//        System.out.println("Los asociados naturales son:");
//        for(int i = 0; i < n; i++){
//            System.out.println(naturales[i]);
//        }
        JOptionPane.showMessageDialog(null, listaDeNaturales());
    }

    static String listaDeNaturales(){
        String lista = "Los asociados naturales son:";
        for(int i = 0; i < n; i++){
            lista += "\n" + naturales[i];
        }
        return lista;
    }

    static boolean verificarCargo(String cargoDirectivo){
        boolean c = true;
        for(int i = 0; i < d; i++){
            if(cargoDirectivo.equals(directivos[i].getCargo())){
                c = false;
                //System.out.println("No es posible tener dos cargos del mismo tipo");
                JOptionPane.showMessageDialog(null, "No es posible tener dos cargos del mismo tipo");
            }
        }
        return c;
    }


    static void registrarPago(AsociadoNatural a, double pago){
        a.setCantAportaciones(a.getCantAportaciones()+1);
        a.setMontoTotalAportaciones(a.getMontoTotalAportaciones()+pago);
        a.setUltimaAportacion(LocalDate.now());
    }
    //myapp funcional
}