package Model;

public class SalesDetail {
	private int quantity;
	private double subTotal;
	private Product product;
	private Sales sale;

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the subTotal
     */
    public double getSubTotal() {
        return subTotal;
    }

    /**
     * @param subTotal the subTotal to set
     */
    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    /**
     * @return the product
     */
    public Product getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(Product product) {
        this.product = product;
    }

    /**
     * @return the sale
     */
    public Sales getSale() {
        return sale;
    }

    /**
     * @param sale the sale to set
     */
    public void setSale(Sales sale) {
        this.sale = sale;
    }
	
}
