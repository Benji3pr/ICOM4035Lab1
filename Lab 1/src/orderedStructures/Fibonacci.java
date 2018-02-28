package orderedStructures;

public class Fibonacci extends Progression {

	private double prev; 
	
	public Fibonacci() { 
		this(1); 
		prev = 0; 
	}
	private Fibonacci(double first) {
		super(first);
	}

	@Override
	public double nextValue() throws IllegalStateException {
		if(this.valid == false)
			throw new IllegalStateException("firstValue() method has not been executed");
			
		double newcurr;
        if(current == 1){
        	current = 2;
        	prev = 1;        	
        }
        else if(prev == 0){
        	current = 1;
        }
        else{        	
        	newcurr = current+prev;
        	prev = current;
        	current=newcurr;
        }
		
		return current;
	}
	
	@Override	
	public double firstValue() { 
		double value = super.firstValue(); 
		prev = 0; 
		return value; 
	}

}
