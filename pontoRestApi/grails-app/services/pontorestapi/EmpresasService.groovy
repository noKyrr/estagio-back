package pontorestapi

import grails.gorm.services.Service

@Service(Empresa)
interface EmpresasService {

    Empresa get(Serializable id)

    List<Empresa> list(Map args)

    Long count()

    void delete(Serializable id)

    Empresa save(Empresa empresas)

}