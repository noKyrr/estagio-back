package pontorestapi

import grails.rest.Resource

@Resource(readOnly = false, formats = ['json', 'xml'], uri = '/lancamentoocorrencia')
class LancamentoOcorrencia {
    Funcionario funcionario
    Ocorrencia ocorrencia
    Date dataOcorrencia
    String observacoes

    static constraints = {

    }
}
