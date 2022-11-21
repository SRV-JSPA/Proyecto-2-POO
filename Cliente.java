
package bankgua;

import java.util.ArrayList;

public class Cliente {
    String nombre;
    String telefono;
    String direccion;
    ArrayList<Cuenta> miscuentas;
    ArrayList<Tarjeta> mistarjetas;
    
    public Cliente (){
        miscuentas = new ArrayList<Cuenta>();
        mistarjetas = new ArrayList<Tarjeta>();                                                                                 
    }
    public void addCuenta(Cuenta c){
        miscuentas.add(c);
    }
    public void addTarjeta(Tarjeta t){
        mistarjetas.add(t);
    }
    public ArrayList<Cuenta> getMiscuentas(){
        return miscuentas;
    }
    public void setMisCuentas(ArrayList<Cuenta> miscuentas){
        this.miscuentas = miscuentas;
    }
    public ArrayList<Tarjeta> getMistarjetas(){
        return mistarjetas;
    }
    public void setMisTarjetas(ArrayList<Tarjeta> mistarjetas){
        this.mistarjetas = mistarjetas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
    
}
