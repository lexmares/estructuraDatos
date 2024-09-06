package app;
import clases.Asociado;
import clases.AsociadoDirectivo;
import clases.AsociadoNatural;
import java.util.Scanner;
import java.time.LocalDate;

public class Principal {
// Prueba
    static Scanner input = new Scanner (System.in);

    static Object capturaAsociado(){

        Object o = new Object();

        System.out.println("No. de asociado:");
        int nosocio = input.nextInt();
        System.out.println("Nombre de asociado:");
        String nombre = input.nextLine();
        LocalDate ingreso = LocalDate.now();
        System.out.println("No. de telefono");
        int tel = input.nextInt();

        System.out.println("Tipo de asociado a registrar\n1.Natural\n2.Directivo");
        int tipo = input.nextInt();

        if(tipo == 1){
            AsociadoNatural a = new AsociadoNatural(nosocio, nombre, ingreso, tel, 0,0, null);
            int pago = 2500;
            MyApp.registrarPago(a, pago);
            o = a;
        }
        else{

            boolean c=false;

            do{
                String cargo = input.nextLine();
                System.out.println("Asigne cargo:");


                if(MyApp.verificarCargo(cargo)==false){
                    System.out.println("Cargo repetido.");
                }
                else{
                    c = true;
                }


                LocalDate fecha = LocalDate.now();

                AsociadoDirectivo a = new AsociadoDirectivo (nosocio, nombre, ingreso, tel, cargo, fecha);
            }while(!c)

            return o;
        }
        return
    }