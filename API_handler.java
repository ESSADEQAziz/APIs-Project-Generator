import java.io.IOException;

public class API_handler {
public static void handel(String functionName,String action,String classPath,String pathFunction) throws IOException{
   
    switch (action) {
        case "GET":
            createTemplate.createFile(createTemplate.folderpath+"\\src\\main\\java\\"+createTemplate.javaPackage+"\\api\\resources\\get\\"+functionName+".java");
            writeInFile.writeInAPI(createTemplate.folderpath+"\\src\\main\\java\\"+createTemplate.javaPackage+"\\api\\resources\\get\\"+functionName+".java",
                createTemplate.ProjectName, functionName, classPath, pathFunction,"GET");
            break;
        case "POST":
            createTemplate.createFile(createTemplate.folderpath+"\\src\\main\\java\\"+createTemplate.javaPackage+"\\api\\resources\\post\\"+functionName+".java");
            writeInFile.writeInAPI(createTemplate.folderpath+"\\src\\main\\java\\"+createTemplate.javaPackage+"\\api\\resources\\post\\"+functionName+".java",
            createTemplate.ProjectName, functionName, classPath, pathFunction,"POST");
            break;
    
        default:
         System.out.println("something went wrong !! check API_handler class.");
            break;
    }
}
    
}