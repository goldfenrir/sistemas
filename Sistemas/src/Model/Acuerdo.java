/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author goldfenrir
 */
public class Acuerdo {
    private int idAcuerdo;
    private String descripcion;

    /**
     * @return the idAcuerdo
     */
    public int getIdAcuerdo() {
        return idAcuerdo;
    }

    /**
     * @param idAcuerdo the idAcuerdo to set
     */
    public void setIdAcuerdo(int idAcuerdo) {
        this.idAcuerdo = idAcuerdo;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
