import java.io.BufferedReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class Day3 {
	private static final Path input = Path.of("input/day3.txt");
	public static int binaryDiagnostic(){
		try (){
			ArrayList<String> codes = getCodes();
			if(codes == null){return -1;}
			
			//Note to self: Understand what this does and how I can use it in the future instead of BufferedReader.
			//List<String> codes = Files.lines(Paths.get("day3/input.txt")).collect(Collectors.toList());
			
			StringBuilder gammaFrequency = new StringBuilder();
			StringBuilder epsilonFrequency = new StringBuilder();
			for(int i = 0; i < codes.get(0).length(); i++){
				int ones = 0;
				for(String code : codes){
					if(code.charAt(i) == '1'){ones++;}
				}
				int zeros = codes.size() - ones;
				gammaFrequency.append(ones > zeros ? '1' : '0');
				epsilonFrequency.append(ones > zeros ? '0' : '1');
			}
			return Integer.parseInt(gammaFrequency.toString(), 2) * Integer.parseInt(epsilonFrequency.toString(), 2);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return -1;
	}
	public static int binaryOxygenDiagnostic(){
		ArrayList<String> codes = getCodes();
		if(codes == null){return -1;}
		
		
		getHighestFrequency(codes, '1');
		//loop for each column
			//loop through the column
				//count frequency of ones
			//compare ones with zeros (prioritize ones over zeros)
			//put all bitGroups with the most frequent number into a new array
			//put all bitGroups with the least frequent number into a new array
			//when there are only one left return it
		return -1;
	}
	
	
	private static ArrayList<String> getHighestFrequency(ArrayList<String> codes, char target){
		StringBuilder output = new StringBuilder();
		for(int i = 0; i < codes.get(0).length(); i++){
			int frequency = 0;
			for(String code : codes){
				if(code.charAt(i) == target){frequency++;}
			}
			output.append(frequency);
		}
		return output;
	}
	
	private static ArrayList<String> getCodes(){
		try(BufferedReader br = Files.newBufferedReader(input)){
			ArrayList<String> codes = new ArrayList<>();
			String line;
			while((line = br.readLine()) != null){codes.add(line);}
			return codes;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
