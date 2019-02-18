package pontorestapi

import grails.converters.JSON
import grails.rest.*
import org.springframework.web.bind.annotation.PostMapping

class AlterarHorarioSubmitController extends RestfulController {
	static responseFormats = ['json', 'xml']

    AlterarHorarioSubmitController() {
        super(AlterarHorarioSubmit)
    }
    @PostMapping
    def alterarhorario (AlterarHorarioSubmit envio)
    {
        if(envio)
        {
            if(envio.func1 && envio.func2)
            {
                Funcionario f1 = Funcionario.findById(envio.func1.id)
                Funcionario f2 = Funcionario.findById(envio.func2.id)

                HorarioFuncionario hf1 = HorarioFuncionario.findByDataAndFuncionario(envio.data,f1)
                HorarioFuncionario hf2 = HorarioFuncionario.findByDataAndFuncionario(envio.data,f2)

                hf1.setFuncionario(f2)
                hf2.setFuncionario(f1)

                if(!hf1.save(flush:true))
                    System.out.println("nao salvou")
                if(!hf2.save(flush:true))
                    System.out.println("nao salvou")
                return envio
            }
        }
        render status:403
    }

    def horariodia(HorarioFuncionarioSubmit envio){

        Funcionario f1 = Funcionario.findById(envio.func1.id)
        Funcionario f2 = Funcionario.findById(envio.func2.id)

        HorarioFuncionario hf1 = HorarioFuncionario.findByDataAndFuncionario(envio.data,f1)
        HorarioFuncionario hf2 = HorarioFuncionario.findByDataAndFuncionario(envio.data,f2)

        if(hf1)
            envio.setHor1(hf1.getHorario().getNome())

        if(hf2)
            envio.setHor2(hf2.getHorario().getNome())

        render envio as JSON
    }
}
