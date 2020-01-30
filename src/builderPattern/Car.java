package builderPattern;

public class Car {
	
	private int noOfGears ;
	private int noOfWheels ;
	
	private Car() {
		
	}
		
	public static class Builder {
		
		private int noOfGears ;
		private int noOfWheels ;
		
		public Builder withGears(int n) {
			this.noOfGears = n ;
			return this ;
		}
		
		public Builder withWheels(int n) {
			this.noOfWheels = n ;
			return this;
		}
		
		public Car build () {
			
			Car car = new Car() ;
			car.noOfWheels = this.noOfWheels;
			car.noOfGears = this.noOfGears ;
			return car ;
		}
		
		
	}
	
	public int getNoOfGears() {
		return noOfGears;
	}


	public void setNoOfGears(int noOfGears) {
		this.noOfGears = noOfGears;
	}


	public int getNoOfWheels() {
		return noOfWheels;
	}


	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	
	@Override
	public String toString() {
		return "Car [noOfGears=" + noOfGears + ", noOfWheels=" + noOfWheels + "]";
	}


}
