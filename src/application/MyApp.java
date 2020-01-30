package application;

import abstractfactorypattern.AbstractFactory;
import abstractfactorypattern.FactoryCreator;
import abstractfactorypattern.Human;
import abstractfactorypattern.WildAnimal;
import adapterpattern.ConstructorImplementation;
import builderPattern.Car;
import factorypattern.Animal;
import factorypattern.AnimalFactory;
import prototype.Developer;
import prototype.Employee;
import singletonpattern.DBConnection;

public class MyApp {

	public static void main(String[] args) {

		// Factory Pattern -- Starts
		
		/**
		 * In this pattern, a Factory class is created as the parent class of all
		 *  sub-classes belonging to a certain logical segment of related classes.
		 */
		
		AnimalFactory animalFactory = new AnimalFactory();
		Animal dog = animalFactory.getAnimal("Dog");
		Animal cat = animalFactory.getAnimal("Cat");
		
		dog.eat();
		cat.eat();
		
		// Factory Pattern -- Ends
		
		lineBreak("Abstract Factory Pattern : ");

		// Abstract Factory Pattern -- STARTS
		/**
		 * The Abstract Factory design pattern builds upon the Factory Pattern and acts as the 
		 * highest factory in the hierarchy. It represents the practice of creating a factory 
		 * of factories.
		 */
		
		AbstractFactory humanFactory = FactoryCreator.getFactory("human") ;
		
		Human child = humanFactory.getHuman("child") ;
		child.destroyNature();
		
		Human adult = humanFactory.getHuman("adult");
		adult.destroyNature();
		
		AbstractFactory wildAnimalFactory = FactoryCreator.getFactory("wildAnimal") ;
		
		WildAnimal vulture = wildAnimalFactory.getWildAnimal("vulture") ;
		vulture.preserveNature();
		
		WildAnimal elephant = wildAnimalFactory.getWildAnimal("elephant") ;
		elephant.preserveNature();
		
		// Abstract Factory Pattern -- ENDS
		
		lineBreak("Builder Pattern :");
		
		// Builder Pattern -- STARTS
		
		Car car = new Car.Builder()
				.withGears(5)
				.withWheels(10)
				.build();
		System.out.println(car.toString());
		
		// Builder Pattern -- ENDS
		lineBreak("Prototype Pattern :");
		
		//-- Prototype pattern starts 
		
		Developer dev1 = new Developer() ;
		dev1.setWorkHours(5);
		System.out.println(dev1);
		Developer dev2 = (Developer) dev1.clone();
		System.out.println(dev2);
		System.out.println(dev2.getWorkHours());
		//-- Prototype pattern ends 
		
		lineBreak("Singleton Pattern :");
		
		//--SINGLETON pattern Starts
		
		DBConnection conn = DBConnection.getInstance();
		conn.showConectionDetails();
		//--SINGLETON pattern Ends
		
		lineBreak("Adapter Pattern :");
		
		// Adapter Patter -- STARTS
		
		ConstructorImplementation c = new ConstructorImplementation();
		c.construct("house", "Mumbai");
		c.construct("flat", "Versova");
		
		// Adapter Patter -- ENDS

	}
	
	public static void lineBreak(String msg) {
		System.out.println("");
		System.out.println("---------------------------------- ************----------------------------------");
		System.out.println("");
		System.out.println(msg);	
		System.out.println("");
		
	}

}
