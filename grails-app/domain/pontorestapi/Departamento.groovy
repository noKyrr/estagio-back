package pontorestapi

import grails.rest.Resource

@Resource(readOnly = false, formats = ['json', 'xml'], uri = '/departamento')
class Departamento {

    String nome
    String descricao
    Departamento nivelAcima
    static constraints = {
        nivelAcima nullable: true
    }
}
