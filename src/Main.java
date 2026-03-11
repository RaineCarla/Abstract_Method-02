
import Fabrica.FornecedorInternacionalFactory;
import Fabrica.FornecedorNacionalFactory;
import Service.CheckoutService;

public class Main {

    public static void main(String[] args) {

        String pedidoId = "PED-10";
        double valorProdutos = 99.0;
        double pesoKg = 3.0;
        String cepDestino = "58000-000";


        System.out.println("== FORNECEDOR NACIONAL == ");
        CheckoutService checkoutNacional = new CheckoutService(new FornecedorNacionalFactory());

        checkoutNacional.finalizarCompra(
                pedidoId,
                valorProdutos,
                pesoKg,
                cepDestino
        );

        System.out.println();


        System.out.println("== FORNECEDOR INTERNACIONAL == ");
        CheckoutService checkoutInternacional = new CheckoutService(new FornecedorInternacionalFactory());

        checkoutInternacional.finalizarCompra(
                pedidoId,
                valorProdutos,
                pesoKg,
                cepDestino
        );
    }
}