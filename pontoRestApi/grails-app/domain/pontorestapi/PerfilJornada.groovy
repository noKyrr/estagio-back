package pontorestapi

import grails.rest.Resource

@Resource(readOnly = false, formats = ['json', 'xml'], uri = '/perfiljornada')
class PerfilJornada {

    String nome
    int col_extra_ut
    int col_extra_sab
    int col_extra_dom
    int col_extra_fer
    int conf_bh_ut
    int conf_bh_sab
    int conf_bh_dom
    int conf_bh_fer
    boolean conf_bh_deduzirFalta
    boolean conf_bh_habilita
    String conf_bh_fechamento

    static constraints = {
    }
}
