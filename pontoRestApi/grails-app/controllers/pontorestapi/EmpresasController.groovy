package pontorestapi


import grails.rest.*
import grails.converters.*

class EmpresasController extends RestfulController {
    static responseFormats = ['json']
    EmpresasController() {
        super(Empresa)
    }

    def list(Filtro filtro){

        respond filtro.filtro ? Empresa.findAllByRazaoIlike("%$filtro.filtro%") : Empresa.list()
    }
}

class Filtro
{
    String filtro
}
