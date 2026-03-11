package Service;

import Fabrica.FornecedorFactory;
import Interfaces.Frete;
import Interfaces.NotaFiscal;
import Interfaces.Pagamento;

public class CheckoutService {
    private final Pagamento pagamento;
    private final Frete frete;
    private final NotaFiscal notaFiscal;

    public CheckoutService(FornecedorFactory factory) {
        this.pagamento = factory.criarPagamento();
        this.frete = factory.criarFrete();
        this.notaFiscal = factory.criarNotaFiscal();


    }

    public void finalizarCompra(String pedidoId, double valorProdutos, double pesoKg, String cepDestino) {

        System.out.println(" == Checkout Pedido: " + pedidoId + "==");
        
        double valorFrete= frete.calcular_Frete(pesoKg, cepDestino);
        System.out.println("Frete Calculado: " + valorFrete);


        double somaTotal= (valorProdutos + valorFrete);
        System.out.println("Total: " + somaTotal);

        pagamento.pagar(somaTotal);

        String nf= notaFiscal.emitir(pedidoId , valorProdutos);
        System.out.println("NF gerada: " + nf);

        System.out.println("COMPRA FINALIZADA!");
    }
}
