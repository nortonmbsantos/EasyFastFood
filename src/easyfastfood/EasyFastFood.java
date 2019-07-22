package easyfastfood;


import easyfastfood.products.Product;
import easyfastfood.products.ProductBR;

import easyfastfood.framework.DatabaseConnector;
import easyfastfood.framework.Util;
import java.text.ParseException;

/**
 *
 * @author norto
 */
public class EasyFastFood {


    


    public static void main(String[] args) throws ParseException {
        DatabaseConnector.getDatabaseConnector();
        
        System.out.println(Util.isValidCPF("098.531.276-95"));
        
        System.out.println(Util.formatCpf("09853127695"));

    }
    
}
