/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easyfastfood.products;

import easyfastfood.framework.StandardizedDataResult;

/**
 *
 * @author Clenio
 */
public class ProductBR {

    public StandardizedDataResult save(Product product) {
        if (product.getName().equals("") || product.getName() == null) {
            return new StandardizedDataResult("Nome invalido", -1, false);
        } 
        if (product.getPrice() <= 0.00  ){
           return new StandardizedDataResult("Preço invalido", -1, false); 
        }
        if (product.getDescription().equals("") || product.getDescription()== null) {
           
            return new StandardizedDataResult("Descrição invalida", -1, false);
        } 
        if (product.isStatus()== false ) {
            return new StandardizedDataResult("Produto inativo", -1, false);        
        }
        if (product.getId() <= 0  ){
           return new StandardizedDataResult("Id invalido", -1, false); 
        }    
        return new StandardizedDataResult("Salvo com sucesso", -1, true);

    }
}
