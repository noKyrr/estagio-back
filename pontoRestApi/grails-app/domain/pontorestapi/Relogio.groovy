package pontorestapi

import grails.rest.Resource

@Resource(readOnly = false, formats = ['json', 'xml'], uri = '/relogio')
class Relogio {
    String nome
    String descricao
    LocalDeTrabalho local
    String serie
    String modelo
    String ip
    Empresa empresa
    List<Empresa> empresaAdicional

    static constraints = {
    }
}
