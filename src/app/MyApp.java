package app;
import clases.*;
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
        for(int i = 0; i < d; i++){
            System.out.println(directivos[i]);
        }
    }

    static void listarNaturales(){
        for(int i = 0; i < n; i++){
            System.out.println(naturales[i]);
        }
    }


    static boolean verificarCargo(String cargoDirectivo){
        boolean c = true;
        for(int i = 0; i < d; i++){
            if(cargoDirectivo.equals(directivos[i].getCargo())){
                c = false;
                System.out.println("No es posible tener dos cargos del mismo tipo");
            }
        }
        return c;
    }


    static void registrarPago(AsociadoNatural a, int pago){
        a.setCantAportaciones(a.getCantAportaciones()+1);
        a.setMontoTotalAportaciones(a.getMontoTotalAportaciones()+pago);
        a.setUltimaAportacion(LocalDate.now());
    }



}