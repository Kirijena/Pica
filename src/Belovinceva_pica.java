import javax.swing.JOptionPane;

public class Belovinceva_pica {

	public static void main(String[] args) {
		int darbibas = JOptionPane.showOptionDialog(null, "Atlasît darbîbu:", "Darbîba",
				JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,
				new String[]{"Pievienot jaunu pasûtîjumu", "Pasûtîjumu saraksts"}, "Pievienot jaunu pasûtîjumu");
		switch(darbibas){
		case 0:
			String name = JOptionPane.showInputDialog("Ievadît klienta nosaukumu:");
			String phone = JOptionPane.showInputDialog("Ievadiet klienta tâlruòa numuru:");
			String email = JOptionPane.showInputDialog("Ievadît klienta e-pastu:");
			break;
			
		case 1:
			
			break;
			
		}
	}

}
