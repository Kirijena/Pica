public class Ordere {
    private String customerName;
    private String phoneNumber;
    private String email;
    private String pizzaName;
    private String diameter;
    private String thickness;
    private boolean removeToppings;
    private String removedToppings;
    private double pizzaPrice;

    public Ordere (String customerName, String phoneNumber, String email, String pizzaName, String diameter, String thickness, boolean removeToppings, String removedToppings, double pizzaPrice) {
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.pizzaName = pizzaName;
        this.diameter = diameter;
        this.thickness = thickness;
        this.removeToppings = removeToppings;
        this.removedToppings = removedToppings;
        this.pizzaPrice = pizzaPrice;
    }

    @Override
    public String toString() {
        StringBuilder orderDetails = new StringBuilder();
        orderDetails.append("Klientu vards: ").append(customerName).append("\n");
        orderDetails.append("Klientu tâlruòa numuru: +371").append(phoneNumber).append("\n");
        orderDetails.append("Email: ").append(email).append("\n");
        orderDetails.append("Pizza: ").append(pizzaName).append("\n");
        orderDetails.append("Diameter: ").append(diameter).append("\n");
        orderDetails.append("Cena: ").append(pizzaPrice).append(" euro\n");
        orderDetails.append("Platums: ").append(thickness).append("\n");

        if (removeToppings) {
            orderDetails.append("Removed Toppings: ").append(removedToppings).append("\n");
        }

        return orderDetails.toString();
    }
}