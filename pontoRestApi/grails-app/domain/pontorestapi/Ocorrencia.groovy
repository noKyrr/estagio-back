package pontorestapi

import grails.rest.Resource

@Resource(readOnly = false, formats = ['json', 'xml'], uri = '/ocorrencia')
class Ocorrencia {
    String nome
    String descricao
    String text

    static constraints = {
        text maxSize: 2500
    }
}
