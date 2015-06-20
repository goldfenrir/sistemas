/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author goldfenrir
 */
public class Reunion {
    private int idReunion;
    private LocalDate Fecha;
    private String tema;
    private String duracion;
    private String areaInvolucrada;
    private int campanha;
    private ArrayList<Acuerdo> acuerdos=new ArrayList<Acuerdo>();

    /**
     * @return the idReunion
     */
    public int getIdReunion() {
        return idReunion;
    }

    /**
     * @param idReunion the idReunion to set
     */
    public void setIdReunion(int idReunion) {
        this.idReunion = idReunion;
    }

    /**
     * @return the Fecha
     */
    public LocalDate getFecha() {
        return Fecha;
    }

    /**
     * @param Fecha the Fecha to set
     */
    public void setFecha(LocalDate Fecha) {
        this.Fecha = Fecha;
    }

    /**
     * @return the tema
     */
    public String getTema() {
        return tema;
    }

    /**
     * @param tema the tema to set
     */
    public void setTema(String tema) {
        this.tema = tema;
    }

    /**
     * @return the duracion
     */
    public String getDuracion() {
        return duracion;
    }

    /**
     * @param duracion the duracion to set
     */
    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    /**
     * @return the areaInvolucrada
     */
    public String getAreaInvolucrada() {
        return areaInvolucrada;
    }

    /**
     * @param areaInvolucrada the areaInvolucrada to set
     */
    public void setAreaInvolucrada(String areaInvolucrada) {
        this.areaInvolucrada = areaInvolucrada;
    }

    /**
     * @return the campanha
     */
    public int getCampanha() {
        return campanha;
    }

    /**
     * @param campanha the campanha to set
     */
    public void setCampanha(int campanha) {
        this.campanha = campanha;
    }

    /**
     * @return the acuerdos
     */
    public ArrayList<Acuerdo> getAcuerdos() {
        return acuerdos;
    }

    /**
     * @param acuerdos the acuerdos to set
     */
    public void setAcuerdos(ArrayList<Acuerdo> acuerdos) {
        this.acuerdos = acuerdos;
    }
}
