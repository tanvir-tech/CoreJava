package short_Projects.preOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExecuteShellComandProcessBuilder {
    public static void main (String [] args) throws IOException, InterruptedException{

        String changeDirectory = "chdir /d E:\\test";
        String and = " & ";
        String runJava = "java demo";
        String [] command2 = {"cmd.exe", "/c", changeDirectory + and + runJava};                   //     E:\\test\\demo



        ProcessBuilder processBuilder = new ProcessBuilder(command2);
        //processBuilder.directory(new File(System.getProperty("user.home")));

        try {
            Process process = processBuilder.start();

            BufferedReader reader = new BufferedReader (new InputStreamReader(process.getInputStream()));

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            int exitCode = process.waitFor();

            System.out.println ("\nExited with error code : " + exitCode);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}