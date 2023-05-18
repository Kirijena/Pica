import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Belovinceva_pica {

    public static void main(String[] args) {

        ArrayList<Ordere> orders = new ArrayList<>();

        boolean exit = false;

        while (!exit) {

            int darbibas = JOptionPane.showOptionDialog(null, "Atlasīt darbību:", "Darbība",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                    new String[]{"Pievienot jaunu pasūtījumu", "Pasūtījumu saraksts", "Edienkarte", "Noniem nost", "Iezet no sarakst"},
                    "Pievienot jaunu pasūtījumu");

            switch (darbibas) {

                case 0:
                    String customerName = JOptionPane.showInputDialog("Ievadīt klienta nosaukumu:");
                    String phoneNumber = "";
                    while (phoneNumber.length() != 8) {
                        phoneNumber = JOptionPane.showInputDialog("Ievadiet klienta tālruņa numuru:");
                    }
                    String email = JOptionPane.showInputDialog("Ievadīt klienta e-pastu:");

                    String[] pizzaNames = {"Margarita", "Djabola", "Četri sieri", "Ar jūras veltēm", "Neapoles", "Kalcone"};
                    double[] pizzaPrices = {2.30, 2.10, 4.20, 4.20, 3.10, 2.30};
                    int pizzaIndex = JOptionPane.showOptionDialog(null, "Izvēlieties picu", "Picas izvēle",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                            null, pizzaNames, pizzaNames[0]);

                    String[] diameters = {"25 sm", "35 sm", "45 sm"};
                    double[] diameterPrices = {0, 0.10, 0.20};
                    int diameterIndex = JOptionPane.showOptionDialog(null, "Atlasīt picas diametru", "Diametra izvēle",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                            null, diameters, diameters[0]);
                    String diameter = diameters[diameterIndex];

                    String[] thicknessOptions = {"plana", "bieza"};
                    int thicknessIndex = JOptionPane.showOptionDialog(null, "Izvēlies picas platumu", "Platumu izvēle",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                            null, thicknessOptions, thicknessOptions[0]);
                    String thickness = thicknessOptions[thicknessIndex];

                    String removeToppingsInput = JOptionPane.showInputDialog("Vai vēlaties novākt kādus produktus?(ja/ne)");
                    boolean removeToppings = removeToppingsInput != null && removeToppingsInput.equalsIgnoreCase("ja");
                    String removedToppings = null;

                    if (removeToppings) {
                        removedToppings = JOptionPane.showInputDialog("Ievadiet, kuras preces jānovāc:");
                    }

                    String pizzaName = pizzaNames[pizzaIndex];
                    double diameterPrice = diameterPrices[diameterIndex];
                    double pizzaPrice = pizzaPrices[pizzaIndex] + diameterPrice + (thicknessIndex == 0 ? 0 : 0.10);

                    Ordere order = new Ordere(customerName, phoneNumber, email, pizzaName, diameter, thickness, removeToppings, removedToppings, pizzaPrice);

                    StringBuilder orderDetails = new StringBuilder();
                    orderDetails.append(order);

                    int saveChoice = JOptionPane.showConfirmDialog(null, orderDetails.toString() + "\nSaglabāt pasūtījumu?", "Pasūtījuma saglabāšana", JOptionPane.YES_NO_OPTION);

                    if (saveChoice == JOptionPane.YES_OPTION) {
                        JOptionPane.showMessageDialog(null, "Pasūtījums saglabāts");
                        orders.add(order);
                    } else {
                        JOptionPane.showMessageDialog(null, "Pasūtījums nav saglabāts");
                    }

                    break;

                case 1:
                    if (orders.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Pasūtījumu saraksts ir tukšs!");
                    } else {
                        StringBuilder sb = new StringBuilder();
                        for (Ordere o : orders) {
                            sb.append(o).append("\n");
                        }
                        JOptionPane.showMessageDialog(null, sb.toString());
                    }
                    break;

               case 2:
          int index = JOptionPane.showOptionDialog(null, "Izvēlieties pica", "Edienkarte", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, mennu.pizzaNames, mennu.pizzaNames[0]);
             String description = mennu.descriptions[index];
             JOptionPane.showMessageDialog(null, description);
                     break;
                case 3:
                    if (orders.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Pasūtījumu saraksts ir tukšs!");
                    } else {
                        StringBuilder sb = new StringBuilder();
                        for (int i = 0; i < orders.size(); i++) {
                            sb.append(i + 1).append(". ").append(orders.get(i)).append("\n");
                        }
                        String input = JOptionPane.showInputDialog("Ievadiet pasūtījuma numuru, ko vēlaties izdzēst:\n" + sb.toString());
                        try {
                            int orderNum = Integer.parseInt(input);
                            orders.remove(orderNum - 1);
                            JOptionPane.showMessageDialog(null, "Pasūtījums " + orderNum + " ir izdzēsts!");
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Ievadītajam numuram jābūt skaitlim!");
                        } catch (IndexOutOfBoundsException e) {
                            JOptionPane.showMessageDialog(null, "Pasūtījuma numurs nav derīgs!");
                        }
                    }
                    break;

                case 4:
                    exit = true;
                    break;

                default:
                    exit = true;
                    break;
            }
        }
    }
}



