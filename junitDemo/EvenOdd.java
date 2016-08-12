public class EvenOdd {
	
	public boolean isEvenNumber(int number) throws NumberFormatException{
        boolean result = false;
        if(number==1)
        	 throw new NumberFormatException();
       if(number%2 == 0){
           result = true;
       }
       return result;
   }
	/**
	 * This method test whether the number is odd.
	 * @param number
	 * @return
	 */
	public boolean isOddNumber(int number){
        boolean result = false;
       if(number%2 != 0){
           result = true;
       }
       return result;
   }
	
	public int getSum(int number1, int number2){
       return number1+number2;
   }

}
