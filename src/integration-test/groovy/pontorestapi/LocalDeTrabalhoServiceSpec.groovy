package pontorestapi

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class LocalDeTrabalhoServiceSpec extends Specification {

    LocalDeTrabalhoService localDeTrabalhoService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new LocalDeTrabalho(...).save(flush: true, failOnError: true)
        //new LocalDeTrabalho(...).save(flush: true, failOnError: true)
        //LocalDeTrabalho localDeTrabalho = new LocalDeTrabalho(...).save(flush: true, failOnError: true)
        //new LocalDeTrabalho(...).save(flush: true, failOnError: true)
        //new LocalDeTrabalho(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //localDeTrabalho.id
    }

    void "test get"() {
        setupData()

        expect:
        localDeTrabalhoService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<LocalDeTrabalho> localDeTrabalhoList = localDeTrabalhoService.list(max: 2, offset: 2)

        then:
        localDeTrabalhoList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        localDeTrabalhoService.count() == 5
    }

    void "test delete"() {
        Long localDeTrabalhoId = setupData()

        expect:
        localDeTrabalhoService.count() == 5

        when:
        localDeTrabalhoService.delete(localDeTrabalhoId)
        sessionFactory.currentSession.flush()

        then:
        localDeTrabalhoService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        LocalDeTrabalho localDeTrabalho = new LocalDeTrabalho()
        localDeTrabalhoService.save(localDeTrabalho)

        then:
        localDeTrabalho.id != null
    }
}
