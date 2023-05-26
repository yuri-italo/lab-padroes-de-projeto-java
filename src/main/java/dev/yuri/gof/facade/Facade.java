package dev.yuri.gof.facade;

import dev.yuri.gof.facade.subsistema1.crm.CRMService;
import dev.yuri.gof.facade.subsistema2.cep.CEPApi;

public class Facade {
    public void migrarCliente(String nome, String cep) {
        CEPApi cepApi = CEPApi.getInstancia();
        String cidade = cepApi.recuperarCidade(cep);
        String estado = cepApi.recuperarEstado(cep);

        CRMService.gravarCliente(nome,cep,cidade,estado);
    }
}
