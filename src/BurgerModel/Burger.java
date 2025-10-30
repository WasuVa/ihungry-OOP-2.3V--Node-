 
package BurgerModel;
 
public class Burger {
    private String orderID;
    private String customerID;
    private String customerName;
    private int qty;
    private int status;
    public static final int bgrPrice=500;
    public static final int CANCEL = 2;
    public static final int PROCESSING = 0;
    public static final int DELIVERED = 1;    

    public Burger(String orderID, String customerID,String customerName, int qty, int status) {
        setOrderID(orderID);
        setCustomerID(customerID);
        setCustomerName(customerName);
        setQty(qty);
        setStatus(status);
    }

    public Burger(String orderID,int qty) {
        setOrderID(orderID);
        setQty(qty);
    }
    
    

    /**
     * @return the orderID
     */
    public String getOrderID() {
        return orderID;
    }

    /**
     * @param orderID the orderID to set
     */
    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    /**
     * @return the customerID
     */
    public String getCustomerID() {
        return customerID;
    }

    /**
     * @param customerID the customerID to set
     */
    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    /**
     * @return the qty
     */
    public int getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(int qty) {
        this.qty = qty;
    }

    /**
     * @return the status
     */
    public int getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * @return the customerName
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * @param customerName the customerName to set
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
