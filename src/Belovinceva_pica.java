import javax.swing.JOptionPane;

public class Belovinceva_pica {

	public static void main(String[] args) {
		int darbibas = JOptionPane.showOptionDialog(null, "Atlasīt darbību:", "Darbība",
				JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,
				new String[]{"Pievienot jaunu pasūtījumu", "Pasūtījumu saraksts"}, "Pievienot jaunu pasūtījumu");
		switch(darbibas){
		case 0:
			String nosauk = JOptionPane.showInputDialog("Ievadīt klienta nosaukumu:");
			String taur = JOptionPane.showInputDialog("Ievadiet klienta tālruņa numuru:");
			String email = JOptionPane.showInputDialog("Ievadīt klienta e-pastu:");
			String[] piccNosak = {"Margarita", "Djabola", "Četri sieri", "Ar jūras veltēm", "Neapoles", "Kalcone"};
			double[] piccCena = {2.30, 2.50, 4.20, 4.30, 3.10, 2.50};
			int piccIndex = JOptionPane.showOptionDialog(null, "Izvēlieties picu", "Picas izvēle",
					JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
					null, piccNosak, piccNosak[0] );
			String[] diameter = {"25 sm" , "35 sm" , "45 sm"};
			int diameterIndex = JOptionPane.showOptionDialog(null, "Atlasīt picas diametru", "Diametra izvēle", 
					JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, diameter, diameter[0]);
			String[] platumu = {"smalka", "bieza"};
			int resnisIndex =  JOptionPane.showOptionDialog(null, "Izvēlies picas platumu", "platumu izvele", 
					JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, platumu, platumu[0]);
			String noņemtGarnējumuInput = JOptionPane.showInputDialog("Vai vēlaties novākt kādus produktus?(ja/ne)");
			boolean noņemtGarnējumu = noņemtGarnējumuInput != null && noņemtGarnējumuInput.equalsIgnoreCase("ja");
			String noņemtGarnējumus = null; 
			if (noņemtGarnējumu) {
				noņemtGarnējumus = JOptionPane.showInputDialog("Ievadiet, kuras preces jānovāc:");
				}
			String piccNosakums = piccNosak[piccIndex];
			double pizzCena = piccCena[piccIndex];
			String diameters = diameter[diameterIndex];
			String platums = platumu[resnisIndex];
			StringBuilder orderDetails = new StringBuilder();
			orderDetails.append("Klientu vards: ").append(nosauk).append("\n");
			orderDetails.append("Klientu tālruņa numuru: ").append(taur).append("\n");
			orderDetails.append("Klientu e-past: ").append(email).append("\n");
			orderDetails.append("Picca: ").append(piccNosakums).append("\n");
			orderDetails.append("Diameter: ").append(diameters).append("\n");
			orderDetails.append("Cena: ").append(pizzCena).append(" евро\n");
			orderDetails.append("Platums: ").append(platums).append("\n");
			if (noņemtGarnējumu) {
				orderDetails.append("Novāktie produkti: ").append(noņemtGarnējumu).append("\n");
				}
			int saveChoice = JOptionPane.showConfirmDialog(null, orderDetails.toString() + "\nSaglabāt pasūtījumu?", "Pasūtījuma saglabāšana",
					JOptionPane.YES_NO_OPTION);
					if (saveChoice == JOptionPane.YES_OPTION) {
					JOptionPane.showMessageDialog(null, "");
					} else {
					JOptionPane.showMessageDialog(null, "Заказ не сохранен");
					}
			break;
			
			
		case 1:
			
			break;
			
		}
	}

}
