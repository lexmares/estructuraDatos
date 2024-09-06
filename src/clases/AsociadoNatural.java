package clases;
import java.time.LocalDate;
public class AsociadoNatural extends Asociado{

        private double montoTotalAportaciones;
        private int cantAportaciones;
        private LocalDate ultimaAportacion;

        public AsociadoNatural(int noSocio, String nombre, LocalDate fechaIngreso, int noTelefono, double montoTotalAportaciones, int cantAportaciones, LocalDate ultimaAportacion) {
            super(noSocio, nombre, fechaIngreso, noTelefono);
            this.montoTotalAportaciones = montoTotalAportaciones;
            this.cantAportaciones = cantAportaciones;
            this.ultimaAportacion = ultimaAportacion;
        }
        public AsociadoNatural(){

        }

        public double getMontoTotalAportaciones() {
            return montoTotalAportaciones;
        }

        public void setMontoTotalAportaciones(double montoTotalAportaciones) {
            this.montoTotalAportaciones = montoTotalAportaciones;
        }

        public int getCantAportaciones() {
            return cantAportaciones;
        }

        public void setCantAportaciones(int cantAportaciones) {
            this.cantAportaciones = cantAportaciones;
        }

        public LocalDate getUltimaAportacion() {
            return ultimaAportacion;
        }

        public void setUltimaAportacion(LocalDate ultimaAportacion) {
            this.ultimaAportacion = ultimaAportacion;
        }

        @Override
        public String toString() {
            return super.toString() + "AsociadoNatural{" + "montoTotalAportaciones=" + montoTotalAportaciones + ", cantAportaciones=" + cantAportaciones + ", ultimaAportacion=" + ultimaAportacion + '}';
        }



    }
