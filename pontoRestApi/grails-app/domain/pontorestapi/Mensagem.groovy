package pontorestapi

import grails.rest.Resource

@Resource(readOnly = false, formats = ['json', 'xml'], uri = '/mensagem')
class Mensagem {

    Date data
    Funcionario origem
    Funcionario destino
    String mensagem
    boolean lido
    static constraints = {
        mensagem maxSize: 2500
        origem nullable: true
    }
}
