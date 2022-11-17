import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Application {

	public static void main(String[] args) throws IOException {
		
		Dictionary<String, String> dict = new Dictionary<String, String>();
		
		File file = new File("DictionaryWordValuePairs.txt");
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String line = null;
		
		while ((line = reader.readLine()) != null) {
			
			String[] parts = line.split("\\t", 2);
			String key = parts[0].trim();
			String value = parts[1].trim();
			dict.add(key, value);
		}
		
		dict.printDictionary();
		
		System.out.println("timbrel, " + dict.getValue("timbrel") + ", " + dict.getValue("timbrel").hashCode());
		System.out.println("knave, " + dict.getValue("knave") + ", " + dict.getValue("knave").hashCode());
		System.out.println("naught, " + dict.getValue("naught") + ", " + dict.getValue("naught").hashCode());
		System.out.println("turnkey, " + dict.getValue("turnkey") + ", " + dict.getValue("turnkey").hashCode());
		System.out.println("God's acre, " + dict.getValue("God's acre") + ", " + dict.getValue("God's acre").hashCode());
		
	}

}
