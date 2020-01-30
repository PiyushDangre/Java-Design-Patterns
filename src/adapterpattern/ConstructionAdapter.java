package adapterpattern;

public class ConstructionAdapter implements constructor {

	AdvancedConstructor advancedConstructor ; 
	
	public ConstructionAdapter(String type) {
		
		if (type.equalsIgnoreCase("house")) {
			advancedConstructor = new HouseConstructor();	
		}else if (type.equalsIgnoreCase("flat")) {
			advancedConstructor = new FlatConstructor();
		}
	}
	
	
	@Override
	public void construct(String type, String location) {
		if (type.equalsIgnoreCase("house")) {
			advancedConstructor.constructHouse(location);	
		}else if (type.equalsIgnoreCase("flat")) {
			advancedConstructor.constructFlat(location);
		}
	}

}
