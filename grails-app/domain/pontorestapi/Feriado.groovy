package pontorestapi

import grails.rest.Resource

@Resource(readOnly = false, formats = ['json', 'xml'], uri = '/feriado')
class Feriado {

    String nome
    String descricao
    Date data
    boolean conf_he
    List<Departamento> departamentos

    static constraints = {
    }
}
