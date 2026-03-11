package Internacional;

import Interfaces.Pagamento;

public class PagamentoInternacional implements Pagamento {

    @Override
    public boolean pagar(double valor) {
        System.out.println("INTERNACIONAÇ] Pagamento aprovado com taxa ");
        return true;
    }
}
