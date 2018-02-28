package orderedStructures;

public class Arithmetic extends Progression {
	private double commonDifference; 
	
	public Arithmetic(double firstValue, double commonDifference) { 
		super(firstValue); 
		this.commonDifference = commonDifference; 
	}
	
	@Override
	public double nextValue() throws IllegalStateException {
		if(this.valid == false)
			throw new IllegalStateException("firstValue() method has not been executed");
		current = current + commonDifference; 
		return current;
	}
	public String toString(){
		return "Arith";
	}
	public double getTerm(int n) throws IndexOutOfBoundsException { 
		if (n <= 0) 
			throw new IndexOutOfBoundsException("printAllTerms: Invalid argument value = " + n); 

		double value = this.firstValue();
		value += ((n-1)*commonDifference);
		return value;
	}

}
