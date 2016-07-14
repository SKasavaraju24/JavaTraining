package Day6;

public class FunCamera implements Photographer{

	@Override
	public void prepareScence() {
		System.out.println("All set! Say Cheese!! :D");
	} 

	@Override
	public String takePhotograph() {
		
		return "Great picture filled with lot of happiness!";
	}

}
