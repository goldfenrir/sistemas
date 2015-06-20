/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.time.LocalDate;

/**
 *
 * @author pucp
 */
public class Catalogo {
    private int id;
    private int idCamp;
    private LocalDate fecha;
    private int totalPags;
    public Catalogo(int id,int idCamp,LocalDate fecha, int tot){
        this.setId(id);
        this.setIdCamp(idCamp);
        this.setFecha(fecha);
        setTotalPags(tot);
    }

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
     * @return the idCamp
     */
    public int getIdCamp() {
        return idCamp;
    }

    /**
     * @param idCamp the idCamp to set
     */
    public void setIdCamp(int idCamp) {
        this.idCamp = idCamp;
    }

    /**
     * @return the fecha
     */
    public LocalDate getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the totalPags
     */
    public int getTotalPags() {
        return totalPags;
    }

    /**
     * @param totalPags the totalPags to set
     */
    public void setTotalPags(int totalPags) {
        this.totalPags = totalPags;
    }
}
