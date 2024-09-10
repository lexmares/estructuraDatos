package app;
import clases.Asociado;
import clases.AsociadoDirectivo;
import clases.AsociadoNatural;
import java.util.Scanner;
import java.time.LocalDate;
import javax.swing.*;

public class Principal {
// Prueba
    static Scanner input = new Scanner (System.in);



    static Object capturaAsociado() throws Exception {

        Object o = new Object();
        int nosocio = Integer.parseInt(JOptionPane.showInputDialog("No. de asociado:"));
        String nombre = JOptionPane.showInputDialog("Nombre de asociado:");
        LocalDate ingreso = LocalDate.now();
        int tel = Integer.parseInt(JOptionPane.showInputDialog("No. de telefono"));
        int tipo = Integer.parseInt(JOptionPane.showInputDialog("Tipo de asociado a registrar\n1.Natural\n2.Directivo"));

        gestionSocios(tipo, nosocio, nombre, ingreso, tel);
        return o;
        }
        static void gestionSocios(int tipo, int nosocio, String nombre, LocalDate ingreso, int tel) throws Exception{
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
                    cargo = JOptionPane.showInputDialog("Ingrese el cargo:");
                    if (!MyApp.verificarCargo(cargo)) {
                        JOptionPane.showMessageDialog(null, "Error: Cargo Repetido");
                    } else {
                        c = true;
                    }
                } while (!c);
                AsociadoDirectivo a = new AsociadoDirectivo(nosocio, nombre, ingreso, tel, cargo, LocalDate.now());
                MyApp.agregarDirectivo(a);
            }
        }



    static void registrarPago() {
        String nombre = JOptionPane.showInputDialog("Nombre de asociado natural: ");
        double pago = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el pago que deseas realizar: "));
        for(int i = 0; i < MyApp.naturales.length; i++){
            if(nombre.equalsIgnoreCase(MyApp.naturales[i].getNombre())){
                MyApp.registrarPago(MyApp.naturales[i], pago);
                break;
            }else{
                JOptionPane.showMessageDialog(null, "No existe ese asociado.");
            }
        }
    }

    static void mostrarNaturales(){
        MyApp.listarNaturales();
    }

    static void mostrarDirectivos(){
        MyApp.listarDirectivos();
    }

    static int menuOpcion(){
        String[] m = new String[]{"Agregar Asociado", "Resgistrar Pago", "Mostrar A. Naturales", "Mostrar A. Directivos", "Terminar"};

        return JOptionPane.showOptionDialog(null, "Opciones Disponibles", "Menu", 0, JOptionPane.QUESTION_MESSAGE, null, m, "Terminar");
    }


    static void run() throws Exception {
        int opc;
        do{
            opc = menuOpcion() + 1;
            switch (opc){
                case 1:capturaAsociado();break;
                case 2:registrarPago();break;
                case 3:mostrarNaturales();break;
                case 4:mostrarDirectivos();break;
            }
        }while(opc != 5);

    }
    public static void main(String[] args) throws Exception {
        run();
    }

}

