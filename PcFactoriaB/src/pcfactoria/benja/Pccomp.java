package pcfactoria.benja;

import java.util.Date;

/**
 *
 * @author benja
 */
public class Pccomp {
    
    private String placa,procesador;
    private int almacenamiento,ram;
    private Date armado;
    private char tgrafica;

    public Pccomp(String placa, String procesador, int almacenamiento, int ram, Date armado, char tgrafica) {
        setPlaca(placa);
        setProcesador(procesador);
        setAlmacenamiento(almacenamiento);
        setRam(ram);
        this.armado = armado;
        this.tgrafica = tgrafica;
    }

    public Pccomp() {
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        if(placa.trim().equalsIgnoreCase("ASUS") ||
           placa.trim().equalsIgnoreCase("MSI") || 
           placa.trim().equalsIgnoreCase("GIGABYTE")){
            this.placa = placa;
        }else{
            System.err.println("Error, la placa debe ser [ASUS, MSI o GIGABYTE]");
        }
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        if(procesador.trim().equalsIgnoreCase("INTEL") ||
           procesador.trim().equalsIgnoreCase("AMD")){
           this.procesador = procesador;
        }else{
            System.err.println("Error, el procesador debe ser [INTEL o AMD]");
        }
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        if(almacenamiento >= 500 && almacenamiento<= 2000){
        this.almacenamiento = almacenamiento;
        }else{
            System.err.println("Error, el almacenamiento debe ser mayor a 500GB o igual o menor a 2000GB");
        }
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        if(ram >= 8 && ram<=64){
        this.ram = ram;
        }else{
            System.err.println("Error, la ram debe ser superior a 8GB y menor a 64GB");
        }
    }

    public Date getArmado() {
        return armado;
    }

    public void setArmado(Date armado) {
        this.armado = armado;
    }

    public char getTgrafica() {
        return tgrafica;
    }

    public void setTgrafica(char tgrafica) {
        this.tgrafica = tgrafica;
    }

    @Override
    public String toString() {
        return "Pccomp{" + "placa=" + placa + ", procesador=" + procesador + ", almacenamiento=" + almacenamiento + ", ram=" + ram + ", armado=" + armado + ", tgrafica=" + tgrafica + '}';
    }
    
    public void print(){
        System.out.println("Placa: "+getPlaca());
        System.out.println("Procesador: "+getProcesador());
        System.out.println("Almacenamiento: "+getAlmacenamiento());
        System.out.println("RAM: "+getRam());
        System.out.println("Fecha de armado: "+getArmado());
        System.out.println("Tarjeta grafica: "+getTgrafica());
    }
                        
}
