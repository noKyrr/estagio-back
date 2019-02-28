package pontorestapi


import grails.rest.*
import grails.converters.*
import org.springframework.web.bind.annotation.CrossOrigin

@CrossOrigin(origins = "*")
class LoginController extends RestfulController {
    static responseFormats = ['json', 'xml']
    LoginController() {
        super(Login)
    }
    @CrossOrigin(origins = "*")
    def auth(Login login){
        if ((login.login == "admin" && login.senha == "admin"))
        {
           return Pessoa.findOrCreateByLoginAndSenhaAndNome("admin","admin","admin");
        }
        if(login)
        {
            Funcionario func =  Funcionario.findByLoginAndSenha(login.login, login.senha)
            if(func)
                return func
            else
                render status:403
        }
        else
            render status:403

    }
}

