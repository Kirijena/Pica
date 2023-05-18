public class Order {
    private String clientName;
    private String phoneNumber;
    private String email;
    private String pizzaName;
    private String diameter;
    private double price;
    private String crust;
    private boolean hasToppings;
    private String removedToppings;
    
    public Order(String clientName, String phoneNumber, String email, String pizzaName,
                 String diameter, double price, String crust, boolean hasToppings,
                 String removedToppings) {
        this.clientName = clientName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.pizzaName = pizzaName;
        this.diameter = diameter;
        this.price = price;
        this.crust = crust;
        this.hasToppings = hasToppings;
        this.removedToppings = removedToppings;
    }
    
    public String getClientName() {
        return clientName;
    }
    
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getPizzaName() {
        return pizzaName;
    }
    
    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }
    
    public String getDiameter() {
        return diameter;
    }
    
    public void setDiameter(String diameter) {
        this.diameter = diameter;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public String getCrust() {
        return crust;
    }
    
    public void setCrust(String crust) {
        this.crust = crust;
    }
    
    public boolean getHasToppings() {
        return hasToppings;
    }
    
    public void setHasToppings(boolean hasToppings) {
        this.hasToppings = hasToppings;
    }
    
    public String getRemovedToppings() {
        return removedToppings;
    }
    
    public void setRemovedToppings(String removedToppings) {
        this.removedToppings = removedToppings;
    }
    
    @Override
    public String toString() {
        StringBuilder orderDetails = new StringBuilder();
        orderDetails.append("Klientu vards: ").append(clientName).append("\n");
        orderDetails.append("Klientu tâlruòa numuru: +371").append(phoneNumber).append("\n");
        orderDetails.append("Klientu e-past: ").append(email).append("\n");
        orderDetails.append("Picca: ").append(pizzaName).append("\n");
        orderDetails.append("Diameter: ").append(diameter).append("\n");
        orderDetails.append("Cena: ").append(price).append(" euro\n");
        orderDetails.append("Platums: ").append(crust).append("\n");
        if (hasToppings) {
            orderDetails.append

("Pievienotie pildîjumi: ").append(removedToppings).append("\n");
} else {
orderDetails.append("Pievienotie pildîjumi: nav\n");
}
return orderDetails.toString();
}
}