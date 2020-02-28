import java.io.PrintWriter;
public class main {
public static void main(String[] args) {
 String input_file="C:\\Users\\DeV_NEN\\Desktop\\Project\\Git\\pictureToText\\out\\production\\pictureToText\\images\\44.png";
 String output_file="C:\\Users\\DeV_NEN\\Desktop\\Project\\Git\\pictureToText\\out\\production\\pictureToText\\images\\44";
 String tesseract_install_path="C:\\Program Files (x86)\\Tesseract-OCR\\tesseract";
 String command = "cmd";
    
 try {
 Process p = Runtime.getRuntime().exec(command);
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
        System.out.println(read_File.readFile(output_file+".txt"));
    } catch (Exception e) {
 e.printStackTrace();
    }
  }
}