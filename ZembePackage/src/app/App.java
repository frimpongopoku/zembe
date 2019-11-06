package app;

public class App {
	public static void main(String[] args) throws Exception {
		Account Frimpong = new Account("Frimpong", "Agyemang", "mrfimpong@gmail.com", "something something", "123443545", "123324435", "geography", Konstants.premUser); 
		Errand rand = Frimpong.createErrand(); 
		System.out.println(rand.getRules().getInstruction(1));
	}
}