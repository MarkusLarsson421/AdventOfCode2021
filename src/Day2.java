import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Day2 {
	private static final Path input = Path.of("input/day2.txt");
	public static int submarineMovementCalculator(boolean useAim){
		try (BufferedReader br = Files.newBufferedReader(input)){
			int depth = 0;
			int forward = 0;
			int aim = 0;
			
			String line;
			while((line = br.readLine()) != null){
				int distance = Integer.parseInt(line.split(" ")[1]);
				switch(line.split(" ")[0]){
					case "forward" -> {
						forward += distance;
						if(useAim){depth += distance * aim;}
					}
					case "down" -> {
						if(!useAim){depth += distance;}
						else{aim += distance;}
					}
					case "up" -> {
						if(!useAim){depth -= distance;}
						else{aim -= distance;}
					}
				}
			}
			return depth * forward;
		} catch (IOException e) {e.printStackTrace();}
		return -1;
	}
}
