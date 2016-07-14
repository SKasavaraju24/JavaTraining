package Day6;

import java.util.ArrayList;

public class Main {

	
	public static void main(String[] args) {
		
		ArrayList<Photographer> list= new ArrayList<>();
		list.add(new FunCamera());
		list.add(new SecurityCamera());
		list.add(new SpyCamera());

		for(Photographer p :list)
		{
			p.prepareScence();
			System.out.println(p.takePhotograph());
		}
		
	}

}
