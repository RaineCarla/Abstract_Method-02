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

<<<<<<< HEAD
        System.out.println(" == Checkout Pedido: " + pedidoId + "==");
=======
        System.out.println("Pedido: " + pedidoId);
>>>>>>> eeb5bbc87852d1547f37814088bf3f62d598a50c
        
        double valorFrete= frete.calcular_Frete(pesoKg, cepDestino);
        System.out.println("Frete Calculado: " + valorFrete);

<<<<<<< HEAD

        double somaTotal= (valorProdutos + valorFrete);
        System.out.println("Total: " + somaTotal);
=======
        double somaTotal= (valorProdutos + valorFrete);
        System.out.println("Soma Total " + somaTotal);
>>>>>>> eeb5bbc87852d1547f37814088bf3f62d598a50c

        pagamento.pagar(somaTotal);

        String nf= notaFiscal.emitir(pedidoId , valorProdutos);
<<<<<<< HEAD
        System.out.println("NF gerada: " + nf);
=======
>>>>>>> eeb5bbc87852d1547f37814088bf3f62d598a50c

        System.out.println("COMPRA FINALIZADA!");
    }
}
