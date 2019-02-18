package pontorestapi

import grails.rest.Resource

@Resource(readOnly = false, formats = ['json', 'xml'], uri = '/jornadamensalitem')
class JorMensalItem {
    Date data
    Horario horario
    static constraints = {
    }
}
