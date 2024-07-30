package br.com.hcode.solid.lsp;

public class CreditCard extends NubankCard{

    @Override
    public void validate() throws Exception{
        //validacao do carta de credito
        System.out.println("Validando Limite!");
        System.out.println("Limite Ok!");
    }

}
