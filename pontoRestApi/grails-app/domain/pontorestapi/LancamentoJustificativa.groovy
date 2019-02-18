package pontorestapi

import grails.rest.Resource

@Resource(readOnly = false, formats = ['json', 'xml'], uri = '/lancamentojustificativa')
class LancamentoJustificativa {

    Justificativa justificativa
    Funcionario funcionario
    Funcionario solicitadoPor
    Funcionario aceitadoPor
    String observacoes
    Date dataOcorrencia
    Date dataAceite
    Date dataSolicitacao
    Date inclusaoHorario
    boolean justificativaIntegral
    boolean justificativaParcial
    boolean inclusaoManual
    Date parcialEntrada
    Date parcialSaida



    static constraints = {
        dataAceite nullable: true, blank: true
        dataSolicitacao nullable: true, blank: true
        inclusaoHorario nullable: true, blank: true
        parcialEntrada nullable: true, blank: true
        parcialSaida nullable: true, blank: true
        solicitadoPor nullable: true, blank: true
        aceitadoPor nullable: true, blank: true

    }
}
