
package Modelo;
import static Datos.Repositorio.*;

public class Aerolinea {
    private String nombre;
    private String RUC;
    private Vuelo vuelos[];
    private Vuelo vuelo;
    private PasajeroArreglo pasajeros = new PasajeroArreglo();
    

    public Aerolinea(String nombre, String RUC) {
        this.nombre = nombre;
        this.RUC = RUC;
    }
    
    public Aerolinea() {
        this.nombre = nombre;
        this.RUC = RUC;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRUC() {
        return RUC;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRUC(String RUC) {
        this.RUC = RUC;
    }
    
    public Vuelo[] getVuelosActivos(){
        for(int i=0; i<this.vuelos.length;i++){
        if(this.vuelos[this.vuelos.length].isActivo()==true){
            return vuelos;
        }
        }
        return vuelos;
    }
    
    public Pasajero[] getPasajerosPorVuelo(Vuelo v){
        Pasajero[] pasajerosPV = null;
        v.getPasajeros().getIndicePas();
        for(int i=0; i<this.pasajeros.getIndicePas();i++){
        if(v.getPasajeros().getPasajeros()==pasajerosPV){
            return pasajerosPV;
        }
        }
        return pasajerosPV;
    }
    
    public Vuelo[] getVuelosPorCiudad(Ciudad ciudad, String fecha){
        Vuelo[] vuelos = null;
        for(int i=0; i<this.vuelos.length;i++){
        ciudad.getVuelo()[vuelos.length].getFecha().equals(fecha);
        }
        return vuelos;
    }
    
    
}
