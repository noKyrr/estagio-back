package pontorestapi

import grails.rest.Resource

@Resource(readOnly = false, formats = ['json', 'xml'], uri = '/jornada')
class Jornada {

    String nome
    PerfilJornada perfil
    List<Horario> horarios
    static constraints = {
        horarios blankable: true
    }
}
