package pontorestapi

import grails.rest.Resource

@Resource(readOnly = false, formats = ['json', 'xml'], uri = '/jornadasemanal')
class JornadaSemanal extends Jornada {

    static constraints = {
    }
}
