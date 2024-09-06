package app;
import clases.Asociado;
import clases.AsociadoDirectivo;
import clases.AsociadoNatural;
import java.util.Scanner;
import java.time.LocalDate;

public class Principal {
// Prueba
    static Scanner input = new Scanner (System.in);

    static Object capturaAsociado() throws Exception {
        Object o = new Object();
        System.out.println("No. de asociado:");
        int nosocio = input.nextInt();

        System.out.println("Nombre de asociado:");
        input.nextLine();
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
            MyApp.agregarNatural(a);
        }
        else {
            boolean c = false;
            String cargo;
            do {
                System.out.println("Ingrese el cargo:");
                cargo = input.nextLine();
                if (!MyApp.verificarCargo(cargo)) {
                    System.out.println("Cargo repetido.");
                } else {
                    c = true;
                }
            } while (!c);
            AsociadoDirectivo a = new AsociadoDirectivo(nosocio, nombre, ingreso, tel, cargo, LocalDate.now());
            MyApp.agregarDirectivo(a);
        }
        return o;
        }

    static void registrarPago() {
        System.out.println("Nombre de asociado natural:");
        String nombre = input.nextLine();
        System.out.println("Ingresa el pago que deseas realizar:");
        double pago = input.nextDouble();
        for(int i = 0; i < MyApp.naturales.length; i++){
            if(nombre.equalsIgnoreCase(MyApp.naturales[i].getNombre())){
                MyApp.registrarPago(MyApp.naturales[i], pago);
                break;
            }else{
                System.out.println("No existe ese asociado.");
            }
        }
    }

    static void mostrarNaturales(){
        MyApp.listarNaturales();
    }

    static void mostrarDirectivos(){
        MyApp.listarDirectivos();
    }

    static String getMenu(){
        String m = "Menu Principal";
        m+= "\n" + "1.-Agregar Asociado";
        m+= "\n" + "2.-Registrar Pago";
        m+= "\n" + "3.-Mostrar Asociados Naturales";
        m+= "\n" + "4.-Mostrar Asociados Directivos";
        m+= "\n" + "5.-Terminar";
        m+= "\n" + "Da opcion del 1 al 5";

        return m;
    }

    static int opcion(){
        System.out.println(getMenu());
        return input.nextInt();
    }

    static void run() throws Exception {
        int opc;
        do{
            opc = opcion();
            input.nextLine();
            switch (opc){
                case 1:capturaAsociado();break;
                case 2:registrarPago();break;
                case 3:mostrarNaturales();break;
                case 4:mostrarDirectivos();break;
            }
        }while(opc!=5);

    }
    public static void main(String[] args) throws Exception {
        run();
    }

    }

