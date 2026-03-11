package Nacional;

import Interfaces.NotaFiscal;

public class NotaFiscalNacional implements NotaFiscal {
    @Override
    public String emitir(String idPedido, double valor) {
<<<<<<< HEAD
        return "NF-NAC-" +  idPedido ;
=======
        return "NF-NAC- " +  idPedido ;
>>>>>>> eeb5bbc87852d1547f37814088bf3f62d598a50c
    }
}
