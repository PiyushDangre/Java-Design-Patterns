package adapterpattern;

public class ConstructorImplementation implements constructor{

	ConstructionAdapter constructionAdapter ; 
	
	@Override
	public void construct(String type, String location) {

		constructionAdapter = new ConstructionAdapter(type);
		constructionAdapter.construct(type, location);
	}

}
