package pontorestapi

class BootStrap {

    def init = { servletContext ->
        //def = HorarioFuncionario.findOrCreateByHorarioAndDataAndFuncionario(Horario.findById(0),new Date,Funcionario.findById)

      /*  def u = new Funcionario(pis: "13213", matricula: 2, nome: "Victor", cpf: "231312", login: "afsa", senha: "32112")
        u.save(true)
        u = new Funcionario(pis: "13213", matricula: 2, nome: "Victor", cpf: "231312", login: "afsa", senha: "32112")
        u.save(true)
        u = new LocalDeTrabalho(nome: "Bairro", rua: "rua teste", bairro: "bairro")
        u.save(true)
        u = new Departamento(nome: "Praia Suja", descricao: "local de lazer")
        u.save(true)
        u = new Departamento(nome: "Praia Limpa", descricao: "local de limpeza")
        u.save(true)*/
    }
    def destroy = {
    }
}
