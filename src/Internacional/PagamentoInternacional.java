package Internacional;

import Interfaces.Pagamento;

public class PagamentoInternacional implements Pagamento {

    @Override
    public boolean pagar(double valor) {
<<<<<<< HEAD
        System.out.println("INTERNACIONAl] Pagamento aprovado com taxa ");
=======
        System.out.println("INTERNACIONAÇ] Pagamento aprovado com taxa ");
>>>>>>> eeb5bbc87852d1547f37814088bf3f62d598a50c
        return true;
    }
}
