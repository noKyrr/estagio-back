package pontorestapi

import grails.gorm.services.Service

@Service(LocalDeTrabalho)
interface LocalDeTrabalhoService {

    LocalDeTrabalho get(Serializable id)

    List<LocalDeTrabalho> list(Map args)

    Long count()

    void delete(Serializable id)

    LocalDeTrabalho save(LocalDeTrabalho localDeTrabalho)

}