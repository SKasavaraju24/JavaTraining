package Day6;

public class SecurityCamera implements Photographer{

	@Override
	public void prepareScence() {
		System.out.println("Capturing Images for Monitoring");		
	}

	@Override
	public String takePhotograph() {

		return "Images Captured";
	}

}
