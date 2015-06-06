package Model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Sales {
	private int id;
        private Campanha campanha;
        private Moneda moneda;
	private LocalDate fechaDia;
	private double total;
	private ArrayList<SalesDetail> details = new ArrayList<SalesDetail>();

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
     * @return the campanha
     */
    public Campanha getCampanha() {
        return campanha;
    }

    /**
     * @param campanha the campanha to set
     */
    public void setCampanha(Campanha campanha) {
        this.campanha = campanha;
    }

    /**
     * @return the moneda
     */
    public Moneda getMoneda() {
        return moneda;
    }

    /**
     * @param moneda the moneda to set
     */
    public void setMoneda(Moneda moneda) {
        this.moneda = moneda;
    }

    /**
     * @return the fechaDia
     */
    public LocalDate getFechaDia() {
        return fechaDia;
    }

    /**
     * @param fechaDia the fechaDia to set
     */
    public void setFechaDia(LocalDate fechaDia) {
        this.fechaDia = fechaDia;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * @return the details
     */
    public ArrayList<SalesDetail> getDetails() {
        return details;
    }

    /**
     * @param details the details to set
     */
    public void setDetails(ArrayList<SalesDetail> details) {
        this.details = details;
    }
	
	
}
