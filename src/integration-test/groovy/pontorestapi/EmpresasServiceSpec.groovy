package pontorestapi

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class EmpresasServiceSpec extends Specification {

    EmpresasService empresasService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Empresas(...).save(flush: true, failOnError: true)
        //new Empresas(...).save(flush: true, failOnError: true)
        //Empresas empresas = new Empresas(...).save(flush: true, failOnError: true)
        //new Empresas(...).save(flush: true, failOnError: true)
        //new Empresas(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //empresas.id
    }

    void "test get"() {
        setupData()

        expect:
        empresasService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Empresa> empresasList = empresasService.list(max: 2, offset: 2)

        then:
        empresasList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        empresasService.count() == 5
    }

    void "test delete"() {
        Long empresasId = setupData()

        expect:
        empresasService.count() == 5

        when:
        empresasService.delete(empresasId)
        sessionFactory.currentSession.flush()

        then:
        empresasService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Empresa empresas = new Empresa()
        empresasService.save(empresas)

        then:
        empresas.id != null
    }
}
