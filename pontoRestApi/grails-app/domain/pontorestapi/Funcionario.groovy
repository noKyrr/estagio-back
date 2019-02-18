package pontorestapi

import grails.rest.Resource
import org.springframework.web.bind.annotation.CrossOrigin

@Resource(readOnly = false, formats = ['json', 'xml'], uri = '/funcionario')
class Funcionario extends Pessoa{

    long matricula
    String pis
    Departamento departamento
    String funcao
    //Jornada jornada
    //byte[] foto



    static constraints = {
    }
}
