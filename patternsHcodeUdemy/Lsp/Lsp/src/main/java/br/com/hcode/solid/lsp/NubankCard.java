package br.com.hcode.solid.lsp;

abstract public class NubankCard implements IPaymentInstrument {

   @Override
    public void validate() throws Exception{
       //validacao basica
   }

   @Override
    public void collectPayment(){
       System.out.println("Pagamento Realizado");
   }

}