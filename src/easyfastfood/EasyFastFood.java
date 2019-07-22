/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easyfastfood;

import easyfastfood.products.Product;
import easyfastfood.products.ProductBR;

/**
 *
 * @author norto
 */
public class EasyFastFood {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Product p = new Product();
        ProductBR pbr = new ProductBR();
        p.setName ("a");
        p.setPrice(0.01);
        p.setDescription("a");
        p.setStatus(true);
 
        pbr.save(p);
        System.out.println(pbr.save(p).getMessage());

    }
    
}
