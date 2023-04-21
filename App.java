import java.io.IOException;

public class App {
    public static void main(String[] args) {
        String projectName="Ecom";
        String folderPath = "C:\\Users\\DELL\\Desktop\\temp\\Generateur\\";

        createTemplate.createProject(folderPath, projectName);

        try {

            API_handler.handel("LoginUser_get", "GET", "/users", "getMsg");
            API_handler.handel("LoginUser_post", "POST", "/users", "postMsg");

        } catch (IOException e) {
            System.out.println("Something went wrong !! Class -> App");
            e.printStackTrace();
        }
        
        
    }

        
}