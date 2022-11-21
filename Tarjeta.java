package bankgua;

import java.util.ArrayList;

public class Tarjeta {
    String tipoTarjeta;
    ArrayList<Movimiento> mismovimientos;

    public Tarjeta() {
        mismovimientos = new ArrayList<Movimiento>();
    }

    public void addMovimiento(Movimiento m){
        mismovimientos.add(m);
    }
    public ArrayList<Movimiento> getMismovimientos() {
        return mismovimientos;
    }

    public void setMismovimientos(ArrayList<Movimiento> mismovimientos) {
        this.mismovimientos = mismovimientos;
    }
    
    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

}
