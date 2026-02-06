import java.util.HashMap;
import java.io.*;

public class people {
    public static HashMap<String,String> People = new HashMap<>();
    public static final String PEOPLE = "peoplesAddress.txt";
    static {
        searchuser();
    }

    public static void searchuser(){
        try(BufferedReader buffer = new BufferedReader(new FileReader(PEOPLE))){
        String temp;
        while((temp = buffer.readLine()) != null){
            String[] seperator = temp.split(" ");
            if (seperator.length == 2) {
                People.put(seperator[0], seperator[1]);
            }
        }
        }
        catch(IOException e){
            return;
        }
    }

    public static void addUser(){
        try(PrintWriter temp = new PrintWriter(new FileWriter(PEOPLE))) {
            for (String person : People.keySet()) {
                temp.println(person + " " + People.get(person));
            }
        }
            catch(IOException e){

        }
    }
}
