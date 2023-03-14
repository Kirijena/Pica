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
			
			break;
			
		case 1:
			
			break;
			
		}
	}

}
