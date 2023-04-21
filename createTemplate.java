import java.io.File;
import java.io.IOException;

public class createTemplate {
    static String folderpath;
    static String javaPackage;
    static String ProjectName;
    public static void createProject(String path,String projectName){
        folderpath=path+projectName;
        ProjectName=projectName;
        javaPackage="ma.gws."+projectName;

        String[] tabPackages={"\\src\\test","\\src\\main",
               "\\src\\main\\java\\"+javaPackage+"\\api\\resources\\get",
               "\\src\\main\\java\\"+javaPackage+"\\api\\resources\\post",

               "\\src\\main\\java\\"+javaPackage+"\\beans\\general",
               "\\src\\main\\java\\"+javaPackage+"\\beans\\request",
               "\\src\\main\\java\\"+javaPackage+"\\beans\\response",

               "\\src\\main\\java\\"+javaPackage+"\\db\\beans",
               "\\src\\main\\java\\"+javaPackage+"\\db\\controller",
               "\\src\\main\\java\\"+javaPackage+"\\db\\dao",
               "\\src\\main\\java\\"+javaPackage+"\\db\\process",
               "\\src\\main\\java\\"+javaPackage+"\\db\\storedproc",

               "\\src\\main\\java\\"+javaPackage+"\\settings\\wsconfig",

        "\\src\\main\\resources\\static",
        "\\src\\main\\resources\\templates",
        "\\src\\main\\webapp"
        };
        String[] tabFiles={"\\pom.xml","\\src\\main\\resources\\application.properties",
                           "\\src\\main\\java\\"+javaPackage+"\\"+projectName+"Application.java",
                            "\\src\\main\\java\\"+javaPackage+"\\ServletInitializer.java"};
           //Create all folders
        for(String temp:tabPackages){
         createFolder(folderpath+temp);
        }
          //Create all files 
        for(String temp:tabFiles){
         createFile(folderpath+temp);
        }
          
        try {

        //Change the project name in pom.xml file
        writeInFile.writeInFile(folderpath+"\\pom.xml", projectName,"pom");
        //Change the packages to sacn in application.properties file
        writeInFile.writeInFile(folderpath+"\\src\\main\\resources\\application.properties", projectName,"properties");
        
        //Change the project name in pom.xml file
        writeInFile.writeInFile(folderpath+"\\src\\main\\java\\"+javaPackage+"\\"+projectName+"Application.java", projectName,"application");
        //Change the packages to sacn in application.properties file
        writeInFile.writeInFile(folderpath+"\\src\\main\\java\\"+javaPackage+"\\ServletInitializer.java", projectName,"initializer");

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Erreur a ete lance -> class writeFile.");
        }
        
    }





    // Create a folder
    public static void createFolder(String folderPath){
        File folder = new File(folderPath);
    if (!folder.exists()) {
        folder.mkdirs();
        System.out.println("Folder created successfully!");
    } else {
        System.out.println("Folder already exists!");
    }
    }
    


    // Create a file
    public static  void createFile(String filePath){
         File file = new File(filePath);
    try {
        if (file.createNewFile()) {
            System.out.println("File created successfully!");
        } else {
            System.out.println("File already exists!");
        }
    } catch (IOException e) {
        System.out.println("An error occurred while creating the file.");
        e.printStackTrace();
    } 
}
}
