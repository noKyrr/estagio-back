package pontorestapi

import grails.rest.Resource
import java.sql.Time
import java.time.LocalDateTime

@Resource(readOnly = false, formats = ['json', 'xml'], uri = '/horario')
class Horario {
    String nome
    String fechamento
    boolean ativo
    Date inicio
    Date fim
    List<Date> horarios
    boolean[] assinalados


    static constraints = {
        fim nullable: true
        horarios blankable: true
    }
}
