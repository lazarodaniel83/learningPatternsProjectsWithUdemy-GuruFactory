package br.com.hcode.solid.lsp;




public class MainPayment {


    public static void main(String[] args) throws Exception {
        //CreditCard card = new CreditCard();
        //DebitCard card = new DebitCard();
        NuBankRewards card = new NuBankRewards();

        card.validate();
        card.collectPayment();
    }
}