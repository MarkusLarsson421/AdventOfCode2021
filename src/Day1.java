import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class Day1 {
	private static final Path input = Path.of("input/day1.txt");
	public static int deltaDepths(int steps){
		try (BufferedReader br = Files.newBufferedReader(input)){
			int answer = 0;
			ArrayList<Integer> depths = new ArrayList<>();
			String line;
			while((line = br.readLine()) != null){
				int depth = Integer.parseInt(line);
				depths.add(depth);
			}
			
			//
			int previousDepthGroup = 0;
			for (int i = 0; i < depths.size(); i++) {
				int currentDepthGroup = 0;
				for(int j = 0; j < steps; j++){
					if(i + j < depths.size()){
						currentDepthGroup += depths.get(i + j);
					}
				}
				if (currentDepthGroup > previousDepthGroup) {answer++;}
				previousDepthGroup = currentDepthGroup;
			}
			return --answer;
		} catch (IOException e) {e.printStackTrace();}
		return -1;
	}
}
