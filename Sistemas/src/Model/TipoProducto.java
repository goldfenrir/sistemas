/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Raul
 */
public class TipoProducto {
    private int id;
    private String nombre;
    private String descricpion;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the descricpion
     */
    public String getDescricpion() {
        return descricpion;
    }

    /**
     * @param descricpion the descricpion to set
     */
    public void setDescricpion(String descricpion) {
        this.descricpion = descricpion;
    }
}
