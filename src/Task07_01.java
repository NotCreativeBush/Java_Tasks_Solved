import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.util.Scanner;

public class Task07_01 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double a, b;
        a = Double.parseDouble(scanner.nextLine());
        b = Double.parseDouble(scanner.nextLine());
        String c = scanner.nextLine();
        String ma = a + c + b;
        ScriptEngine scriptEngine = new ScriptEngineManager().getEngineByName("nashorn");
        Object result = scriptEngine.eval(ma);
        System.out.println(result);
    }
}
