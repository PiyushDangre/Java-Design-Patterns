package adapterpattern;

public class FlatConstructor implements AdvancedConstructor {

	@Override
	public void constructHouse(String location) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void constructFlat(String location) {
		System.out.println("Build Apartment at "+ location);
		
	}

}
