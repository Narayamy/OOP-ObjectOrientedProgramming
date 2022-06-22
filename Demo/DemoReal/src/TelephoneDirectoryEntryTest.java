

public class TelephoneDirectoryEntryTest {

   public static void main(String[] args){
		
		TelephoneDirectoryEntry firstUser = new TelephoneDirectoryEntry("Sarah", "S", "5, wakefields", "South Circular Road", "Limerick", "0838478897");
		firstUser.display();
		
		TelephoneDirectoryEntry secondUser = new TelephoneDirectoryEntry("F", "Aline", "13, Sexton Street", "Sexton Street", "Limerick", "0831235465");
		secondUser.display();
		
		TelephoneDirectoryEntry thirdUser = new TelephoneDirectoryEntry("O", "Paula", "5, Grove Island", "Grove Island", "Limerick", "0835874256");
		thirdUser.display();
	
	}
}