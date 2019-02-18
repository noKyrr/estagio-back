package pontorestapi

import grails.rest.Resource
import org.springframework.web.bind.annotation.CrossOrigin

@Resource(readOnly = false, formats = ['json', 'xml'], uri = '/local')
class LocalDeTrabalho {

    String nome
    String rua
    String bairro
    //Cidade cidade
    //String cep


    static constraints = {
    }
}
