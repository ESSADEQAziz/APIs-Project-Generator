public class FileTexts {

    // Le mot "projectName" sera remplacer par le vrai nom du projet par la methode String.replace()

    static String pom="<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
    + "<project xmlns=\"http://maven.apache.org/POM/4.0.0\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\n"
    +   " xsi:schemaLocation=\"http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd\">\n"
    +   " <modelVersion>4.0.0</modelVersion>\n"
    +   " <parent>\n"
    +        "<groupId>org.springframework.boot</groupId>\n"
    +        "<artifactId>spring-boot-starter-parent</artifactId>\n"
    +        "<version>3.0.5</version>\n"
    +        "<relativePath/> <!-- lookup parent from repository -->\n"
    +    "</parent>\n"
    +   " <groupId>ma.gws</groupId>\n"
    +    "<artifactId>projectName</artifactId>\n"
    +    "<version>0.0.1-SNAPSHOT</version>\n"
    +   " <packaging>war</packaging>\n"
    +    "<name>projectName</name>\n"
    +   " <description>Gateway Web Service</description>\n"
    +   " <properties>\n"
    +        "<java.version>17</java.version>\n"
    +   " </properties>\n"
    +    "<dependencies>\n"
    +        "<dependency>\n"
    +            "<groupId>org.springframework.boot</groupId>\n"
    +            "<artifactId>spring-boot-starter-web</artifactId>\n"
    +            "<exclusions>\n"
    +               " <exclusion>\n"
    +                   " <groupId>ch.qos.logback</groupId>\n"
    +                    "<artifactId>logback-classic</artifactId>\n"
    +               " </exclusion>\n"
    +            "</exclusions>\n"
    +       " </dependency>\n"
    
    +        "<dependency>\n"
    +            "<groupId>org.springframework.boot</groupId>\n"
    +            "<artifactId>spring-boot-starter-test</artifactId>\n"
    +            "<scope>test</scope>\n"
    +       "</dependency>\n"
    +        "<!-- https://mvnrepository.com/artifact/mysql/mysql-connector-java -->\n"
    +       " <dependency>\n"
    +            "<groupId>mysql</groupId>\n"
    +            "<artifactId>mysql-connector-java</artifactId>\n"
    +            "<version>8.0.16</version>\n"
    +        "</dependency>\n"
    +       " <dependency>\n"
    +            "<groupId>org.springframework.boot</groupId>"
    +           " <artifactId>spring-boot-starter-tomcat</artifactId>\n"
    +           " <scope>provided</scope>\n"
    +        "</dependency>\n"
    +       " <dependency>\n"
    +           " <groupId>org.springframework.boot</groupId>\n"
    +           " <artifactId>spring-boot-starter-data-jdbc</artifactId>"
    +        "</dependency>\n"
    +       " <dependency>\n"
    +           " <groupId>org.springframework.boot</groupId>\n"
    +           " <artifactId>spring-boot-starter-data-jpa</artifactId>\n"
    +      "  </dependency>\n"
    
    
    +       " <dependency>\n"
    +         " <groupId>org.springdoc</groupId>\n"
    +           "<artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>\n"
    +         "  <version>2.0.0</version>\n"
    +      " </dependency>\n"
    +   " </dependencies>\n"
    
    +    "<build>\n"
    +        "<plugins>\n"
    +            "<plugin>\n"
               +     "<groupId>org.springframework.boot</groupId>\n"
              +     " <artifactId>spring-boot-maven-plugin</artifactId>\n"
           +     "</plugin>\n"
          +  "</plugins>\n"
       + "</build> \n"
       +"</project>\n";

    
    static String properties="#spring.mvc.view.prefix=/WEB-INF/views/\n"
   +" #spring.mvc.view.suffix=.jsp\n"
    
   +  "spring.datasource.url=jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC\n"
   +  "spring.datasource.username=root\n"
   +  "spring.datasource.password=\n"
    
   +  "spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect\n"
   +  "spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver\n"
    
   + "springdoc.packagesToScan= ma.gws.projectName.api.recources\n";

   static String application="package ma.gws."+"projectName;\n"

   +"import org.springframework.boot.SpringApplication;\n"
   +"import org.springframework.boot.autoconfigure.SpringBootApplication;\n"

  +  "@SpringBootApplication\n"
  +  "public class "+"projectName"+"Application {\n"
   
    +  " public static void main(String[] args) { \n"
    +       "SpringApplication.run("+"projectName"+"Application.class, args);\n"
    +   "}\n"
   
  + "}\n"
   ;
     
   static String initializer="package ma.gws."+"projectName;\n"

  + "import org.springframework.boot.builder.SpringApplicationBuilder;\n"
  + "import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;\n"
   
  + "public class ServletInitializer extends SpringBootServletInitializer {\n"
   
   +    "@Override\n"
    +   "protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {\n"
    +      " return application.sources("+"projectName"+"Application.class);\n"
    +  " }\n"
   
  + "}\n"
   ;
   static String get="package ma.gws."+"projectName"+".api.recources.get;\n"

+   "import org.springframework.web.bind.annotation.GetMapping;\n"
+   "import org.springframework.web.bind.annotation.PathVariable;\n"
+   "import org.springframework.web.bind.annotation.RequestMapping;\n"
+   "import org.springframework.web.bind.annotation.RestController;\n"
   
+    "@RestController\n"
+   "@RequestMapping(\"classPath\")\n"
+  " public class "+"functionName"+" {\n"
+      " @GetMapping(value = \"pathFunction\")\n"
+       "public String "+"functionName"+"_fct(){\n"
+           "return \"Success of get mapping !! \" ;\n"
+      " }\n"
   
+  "}\n"
   ;

   static String post="package ma.gws."+"projectName"+".api.recources.post;\n"

+   "import org.springframework.web.bind.annotation.PostMapping;\n"
+   "import org.springframework.web.bind.annotation.PathVariable;\n"
+   "import org.springframework.web.bind.annotation.RequestMapping;\n"
+   "import org.springframework.web.bind.annotation.RestController;\n"
   
+    "@RestController\n"
+   "@RequestMapping(\"classPath\")\n"
+  " public class "+"functionName"+" {\n"
+      " @PostMapping(value = \"pathFunction\")\n"
+       "public String "+"functionName"+"_fct(){\n"
+           "return \"Success of post mapping !! \" ;\n"
+      " }\n"
   
+  "}\n"
   ;
}

