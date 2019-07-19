package easyfastfood;

import easyfastfood.framework.DatabaseConnector;
import easyfastfood.framework.Util;

/**
 *
 * @author norto
 */
public class EasyFastFood {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DatabaseConnector.getDatabaseConnector();
        
        System.out.println(Util.isValidCPF("098.531.276-95"));
    }
    
}
