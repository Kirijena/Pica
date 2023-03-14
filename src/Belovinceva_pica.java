import javax.swing.JOptionPane;

public class Belovinceva_pica {

	public static void main(String[] args) {
		int choice = JOptionPane.showOptionDialog(null, "Atlasît darbîbu:", "Darbîba",
				JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,
				new String[]{"Pievienot jaunu pasûtîjumu", "Pasûtîjumu saraksts"}, "Pievienot jaunu pasûtîjumu");
	}

}
