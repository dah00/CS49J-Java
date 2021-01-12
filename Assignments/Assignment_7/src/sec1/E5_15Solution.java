package sec1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class E5_15Solution {
    public static void main(String[] args) throws FileNotFoundException {
        // take one command line argument for the file to read
        if (args.length != 0){
            // use LinkedHashMap to keep the order
            LinkedHashMap<Integer, String> identifier = new LinkedHashMap<>();
            HashMap<String, String> lines = new HashMap<>();
            File file = new File(args[0]);
            Scanner scanFile = new Scanner(file);
            int index = 0; // index for identifiers
            while (scanFile.hasNextLine()) {
                String line = scanFile.nextLine();
                Scanner in = new Scanner(line);
                in.useDelimiter("[^A-Za-z0-9_]+");
                while (in.hasNext()) {
                    String id = in.next();
                    if (lines.containsKey(id)) { // if identifier already exist
                        String previous = lines.get(id);
                        lines.put(id, previous + "\n" + line); // update lines
                    }
                    else {
                        identifier.put(index, id);
                        lines.put(id, line);
                        index++;
                    }
                }
            }
            // print result
            for (Integer i : identifier.keySet()) {
                String id = identifier.get(i);
                System.out.println("Identifier " + i + ": \"" + id + "\" occurs in:");
                System.out.println(lines.get(id) + "\n");
            }
        }
        else {
            System.out.println("Need a command line argument for the file to read.");
        }
    }
}
