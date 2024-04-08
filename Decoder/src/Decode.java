import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;


public class Decode {

	public static void main(String[] args) {
		String filePath = "C:\\Users\\Andrew\\Downloads\\coding_qual_input.txt";
		HashMap<Integer, String> hashMap = new HashMap<>();
        int lines = 1;
        

        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split("\\s+");

                if (parts.length == 2) {
                    int number = Integer.parseInt(parts[0]);
                    String word = parts[1];
                    hashMap.put(number, word);
                }
                lines++;
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        }
        
        int currentLine = 1;
        int i = 1;
        // Print the HashMap
        String sentence = "";
        while (i<=lines) {
        		String word = hashMap.get((((i*i)+i))/2);
        		if (word == null) {
        			break;
        		}
        		sentence +=word + " ";
        		
        		i++;
        	
        		
        		currentLine++;
        }
        System.out.println(sentence);
    }

       

	}

