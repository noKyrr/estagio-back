package pontorestapi


import grails.rest.*

@Resource(readOnly = false, formats = ['json', 'xml'], uri = '/empresa')
class Empresa {

    String razao
    String fantasia
    String cnpj
    Funcionario responsavel
    LocalDeTrabalho local
    static constraints = {
        responsavel nullable: true
        local nullable: true
    }

}