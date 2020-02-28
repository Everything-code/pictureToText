import java.io.PrintWriter;
public class main {
public static void main(String[] args) {
 String input_file="\\testfiles\\33.png";
 String output_file="\\testfiles\\33";
 String tesseract_install_path="Tesseract-OCR\\tesseract";
 String[] command =
    {
        "cmd",
    };
    Process p;
 try {
 p = Runtime.getRuntime().exec(command);
        new Thread(new sync(p.getErrorStream(), System.err)).start();
        new Thread(new sync(p.getInputStream(), System.out)).start();
        PrintWriter stdin = new PrintWriter(p.getOutputStream());
        stdin.println("\""+tesseract_install_path+"\" \""+input_file+"\" \""+output_file+"\" -l eng");
        stdin.close();
        p.waitFor();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(ReadFile.readFile(output_file+".txt"));
    } catch (Exception e) {
 e.printStackTrace();
    }
  }
}