package pontorestapi

import grails.core.GrailsClass
import grails.util.Holders

class UrlMappings {

    static mappings = {

            "/$controller/$action?/$id?(.$format)?"{
                constraints {
                    // apply constraints here
                }
            }

            post "/alterarhorariosubmit/alterahorario"(controller:"AlterarHorarioSubmit", action:"alterarhorario")
            post "/alterarhorariosubmit/horariodia"(controller:"AlterarHorarioSubmit", action:"horariodia")

            "500"(view: '/error')
            "404"(view: '/notFound')
    }
}
