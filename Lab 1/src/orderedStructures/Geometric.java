package orderedStructures;

public class Geometric extends Progression {

	private double commonFactor; 
	
	public Geometric(double firstValue, double commonFactor) { 
		super(firstValue); 
		this.commonFactor = commonFactor; 
	}
	
	@Override
	public double nextValue() throws IllegalStateException {
		if(this.valid == false)
			throw new IllegalStateException("firstValue() method has not been executed");
		current = current * commonFactor; 
		return current;
	}
	public String toString(){
		return "Geom";
	}
	public double getTerm(int n) throws IndexOutOfBoundsException { 
		if (n <= 0) 
			throw new IndexOutOfBoundsException("printAllTerms: Invalid argument value = " + n); 

		
		double value = this.firstValue();
		value *= Math.pow(commonFactor, n-1);
		return value;
	}

}
