
public class StringCalculator {	
	
	private final String delimiter = "[\n\\s;.,:'!?()//]";
	
	public int calculate(String input) throws Exception{		
		String[] numbers = getSplit(input);		
		if(isEmpty(input)){
			return 0;
		}
		else if(getLength(numbers) == 1){
			return getInt(input);
		}
		else
			return getSum(numbers);		
	}

	public boolean isEmpty(String input){		
		return input.isEmpty();	
	}
	
	public String[] getSplit(String input){		
		String[] numbers = input.split(delimiter);
		return numbers;
	}
	
	public int getLength(String[] numbers){		
		return numbers.length;
	}
	
	public int getSum(String[] numbers) throws Exception{	
		int sum = 0;				
		for(String current:numbers){
			
			if(!isEmpty(current)){
				sum += getInt(current);
			}					
		}
		return sum;
	}
	
	public int getInt(String input){		
		return Integer.parseInt(input);		
	}

   
}