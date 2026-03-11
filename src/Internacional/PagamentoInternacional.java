package Internacional;

import Interfaces.Pagamento;

public class PagamentoInternacional implements Pagamento {

    @Override
    public boolean pagar(double valor) {

        System.out.println("[INTERNACIONAl] Pagamento aprovado com taxa ");
        return true;
    }
}
