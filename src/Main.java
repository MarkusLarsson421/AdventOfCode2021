public class Main {
	static int day = 1;
	static int part = 1;
	
	public static void main(String[] args) {
		formatForMe(Day1.deltaDepths(1));
		formatForMe(Day1.deltaDepths(3));
		formatForMe(Day2.submarineMovementCalculator(false));
		formatForMe(Day2.submarineMovementCalculator(true));
		formatForMe(Day3.binaryDiagnostic());
	}
	
	public static void formatForMe(int input){
		formatForMe(input + "");
	}
	
	public static void formatForMe(String input){
		System.out.println("Day " + day + ", part " + part + ": " + input + ".");
		
		if(part == 2){
			day++;
			part = 1;
		}else{part++;}
	}
}
