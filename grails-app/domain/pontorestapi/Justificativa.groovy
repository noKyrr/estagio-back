package pontorestapi

import grails.rest.Resource

@Resource(readOnly = false, formats = ['json', 'xml'], uri = '/justificativa')
class Justificativa {
    String nome
    String descricao
    boolean conf_desc_bh
    boolean conf_desc_falta
    boolean conf_abon_falta

    static constraints = {
    }


}
