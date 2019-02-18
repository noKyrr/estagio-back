package pontorestapi

import grails.rest.Resource

@Resource(readOnly = false, formats = ['json', 'xml'], uri = '/jornada12x36')
class Jornada12x36 {

    Boolean sequencia
    static constraints = {
    }
}
