package br.com.hcode.solid.dip.payment;

import br.com.hcode.solid.dip.factory.DBProductFactory;
import br.com.hcode.solid.dip.model.Db;
import br.com.hcode.solid.dip.model.IDbProduct;
import br.com.hcode.solid.dip.model.MySQLProduct;

public class Payment {
    public void pay(String productID) {
        IDbProduct dbProduct = DBProductFactory.create(Db.MONGODB);
        String product = dbProduct.getProductById(productID);
        System.out.println(product);

    }
}
