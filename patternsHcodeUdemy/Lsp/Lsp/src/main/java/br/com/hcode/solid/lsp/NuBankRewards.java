package br.com.hcode.solid.lsp;

public class NuBankRewards implements IPaymentInstrument{
    @Override
    public void validate() throws Exception {
        //validações
        System.out.println("LIMITE OK, REWARDS OK!");
    }

    @Override
    public void collectPayment() {
        System.out.println("Pagamento realizado com sucesso!");
        System.out.println("Pontuação creditada no Programa Rewards!");

    }
}
