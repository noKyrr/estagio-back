package pontorestapi

import grails.rest.Resource

@Resource(readOnly = false, formats = ['json', 'xml'], uri = '/jornadamensal')
class JornadaMensal extends Jornada {
    List<JorMensalItem> listaHorarios
    static constraints = {
    }
    static mapping = {
        listaHorarios fetch: 'join'
    }
    static fetchMode = [listaHorarios: 'eager']

}
