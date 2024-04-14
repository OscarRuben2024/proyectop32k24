/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author Joseg
 */
public class TiposDePagos {
    private int idTipoPago;
    private String nombre;
    private String descripcion;

    public TiposDePagos() {
    }

    public TiposDePagos(int idTipoPago, String nombre, String descripcion) {
        this.idTipoPago = idTipoPago;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getIdTipoPago() {
        return idTipoPago;
    }

    public void setIdTipoPago(int idTipoPago) {
        this.idTipoPago = idTipoPago;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "TiposDePagos{" +
                "idTipoPago=" + idTipoPago +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
