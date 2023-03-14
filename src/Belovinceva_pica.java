import javax.swing.JOptionPane;

public class Belovinceva_pica {

	public static void main(String[] args) {
		int darbibas = JOptionPane.showOptionDialog(null, "Atlasît darbîbu:", "Darbîba",
				JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,
				new String[]{"Pievienot jaunu pasûtîjumu", "Pasûtîjumu saraksts"}, "Pievienot jaunu pasûtîjumu");
		switch(darbibas){
		case 0:
			String nosauk = JOptionPane.showInputDialog("Ievadît klienta nosaukumu:");
			String taur = JOptionPane.showInputDialog("Ievadiet klienta tâlruòa numuru:");
			String email = JOptionPane.showInputDialog("Ievadît klienta e-pastu:");
			String[] piccNosak = {"Margarita", "Djabola", "Èetri sieri", "Ar jûras veltçm", "Neapoles", "Kalcone"};
			double[] piccCena = {2.30, 2.50, 4.20, 4.30, 3.10, 2.50};
			int piccIndex = JOptionPane.showOptionDialog(null, "Izvçlieties picu", "Picas izvçle",
					JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
					null, piccNosak, piccNosak[0] );
			String[] diameter = {"25 sm" , "35 sm" , "45 sm"};
			int diameterIndex = JOptionPane.showOptionDialog(null, "Atlasît picas diametru", "Diametra izvçle", 
					JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, diameter, diameter[0]);
			String[] platumu = {"smalka", "bieza"};
			int resnisIndex =  JOptionPane.showOptionDialog(null, "Izvçlies picas platumu", "platumu izvele", 
					JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, platumu, platumu[0]);
			break;
			
		case 1:
			
			break;
			
		}
	}

}
