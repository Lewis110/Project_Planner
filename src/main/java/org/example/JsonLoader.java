package org.example;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.InputStream;
import java.util.List;
public class JsonLoader {
    public static List<Task> loadTasksFromJson(String fileName) {
        ObjectMapper mapper = new ObjectMapper();

        // Use the ClassLoader to find the file in the resources folder
        try (InputStream is = JsonLoader.class.getClassLoader().getResourceAsStream(fileName)) {
            if (is == null) {                                  //^^ looks inside 'src/main/resources' folder for (fileName).
                System.err.println("Could not find file: " + fileName); //^^This makes it portable!
                return null;
            }      //readValue treats the data pipe ('is') as a list of Task objects
            return mapper.readValue(is, new TypeReference<List<Task>>(){});
            //readValue is method of ObjectMapper (this is why we use mapper)
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
