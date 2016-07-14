package Day6;

public class SpyCamera implements Photographer {

	@Override
	public void prepareScence() {
		System.out.println("Waiting for suspicious activity");
	}

	@Override
	public String takePhotograph() {
		
		return "Picture of suspicious activity captured";
	}

}
