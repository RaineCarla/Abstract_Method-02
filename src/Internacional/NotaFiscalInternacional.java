package Internacional;

import Interfaces.NotaFiscal;

public class NotaFiscalInternacional implements NotaFiscal {
    @Override
    public String emitir(String idPedido, double valor) {
<<<<<<< HEAD
        return "NF-INT-" +  idPedido;
=======
        return "NF-INT- " +  idPedido;
>>>>>>> eeb5bbc87852d1547f37814088bf3f62d598a50c
    }
}
