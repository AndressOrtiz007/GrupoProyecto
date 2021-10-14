/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

/**
 *
 * @author andre
 */
public class Sucursal {

    private int idSucursal;
    private String direccion, telefono;

    public int getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String imprimir(){
        return "La sucursal Nro "+ getIdSucursal() +"\n"+" Está ubicada en  " + getDireccion() +" y su numero de contacto es: "+getTelefono()+"\n";
    }

}