
import java.util.Scanner;

public class mesanu {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		int mesana = 0;
		do{
		System.out.println("Ievadit cik reizas monete meðano intervala (5; 20)");
		mesana = scan.nextInt(); 
		}while( mesana < 5 && mesana >20);
		int gerbonis =0;
		for(int i =1; i <= mesana; i++){
			int metiens = (int)(Math.random() * 2);
			if(metiens ==0){
				System.out.println( i + ". metiens: cipars");
			}else{
				System.out.println(i +". metiens: gerbonis");
				gerbonis++;
			}
		}
		double cipProc = ((double)(mesana - gerbonis)/mesana)*100;
		System.out.println("Cipars tika uzmests "+cipProc+" % no visiem metieniem.");
	}

}
