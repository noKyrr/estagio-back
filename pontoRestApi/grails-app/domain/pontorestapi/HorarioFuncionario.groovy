package pontorestapi

class HorarioFuncionario {

    Horario horario
    Date data
    Funcionario funcionario
    Double faltas

    static constraints = {
        faltas nullable: true
    }
}
