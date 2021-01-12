package sec1;

import java.io.File;
import java.io.FileNotFoundException;
//import java.util.HashMap;
import java.util.LinkedHashMap;
//import java.util.Map;
import java.util.Scanner;

public class E5_15 {
    public static void main(String[] args) throws FileNotFoundException {

        LinkedHashMap<String, String> map = new LinkedHashMap<>();

        File myFile = null;
        Scanner identifierInput;
        Scanner lineInput;

        if (0< args.length)
            myFile = new File(args[0]);

        lineInput = new Scanner(myFile);

        while(lineInput.hasNext()){
            String line = lineInput.nextLine();
            identifierInput = new Scanner(line);
            identifierInput.useDelimiter("[^A-Za-z0-9_]+");

            while (identifierInput.hasNext()){
                String identifier = identifierInput.next();
                if (map.containsKey(identifier))
                    map.replace(identifier, map.get(identifier)+ "\n" + line);
                else
                    map.put(identifier, line);
            }
        }

        int index = 0;
        for (String key: map.keySet()){
            System.out.println(index++ + ":" + key + " occurs in:");
            System.out.println(map.get(key));
            System.out.println("\n");
        }
    }
}
