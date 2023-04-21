import java.io.FileWriter;
import java.io.IOException;



public class writeInFile {

    public static void writeInFile(String path_file,String projectName,String key) throws IOException{
         FileWriter writer = new FileWriter(path_file);
        switch (key) {
            case "pom":
                 writer.write( FileTexts.pom.replace("projectName", projectName));
                break;
            case "properties":
                 writer.write( FileTexts.properties.replace("projectName", projectName));
                break;    
            case "application":
                 writer.write( FileTexts.application.replace("projectName", projectName));
                break;
            case "initializer":
                 writer.write( FileTexts.initializer.replace("projectName", projectName));
                break;
            default: System.out.println("Key incorrect !!");
                break;
             }
            writer.close();
            System.out.println("Data written to the file successfully.");
    }

    public static void writeInAPI(String path_file,String projectName,String functionName,String classPath,String pathFunction,String action) throws IOException{
        FileWriter writer = new FileWriter(path_file);
        
        switch (action) {
            case "GET":
               writer.write( FileTexts.get.replace("functionName",functionName).replace("projectName", projectName).replace("pathFunction", pathFunction).replace("classPath", classPath)); 
                break;
            case "POST":
            writer.write( FileTexts.post.replace("functionName",functionName).replace("projectName", projectName).replace("pathFunction", pathFunction).replace("classPath", classPath)); 
                break;
        
            default:
                break;
        }
        writer.close();
    }

   
}
