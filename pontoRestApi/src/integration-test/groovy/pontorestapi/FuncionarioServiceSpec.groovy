package pontorestapi

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class FuncionarioServiceSpec extends Specification {

    FuncionarioService funcionarioService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Funcionario(...).save(flush: true, failOnError: true)
        //new Funcionario(...).save(flush: true, failOnError: true)
        //Funcionario funcionario = new Funcionario(...).save(flush: true, failOnError: true)
        //new Funcionario(...).save(flush: true, failOnError: true)
        //new Funcionario(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //funcionario.id
    }

    void "test get"() {
        setupData()

        expect:
        funcionarioService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Funcionario> funcionarioList = funcionarioService.list(max: 2, offset: 2)

        then:
        funcionarioList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        funcionarioService.count() == 5
    }

    void "test delete"() {
        Long funcionarioId = setupData()

        expect:
        funcionarioService.count() == 5

        when:
        funcionarioService.delete(funcionarioId)
        sessionFactory.currentSession.flush()

        then:
        funcionarioService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Funcionario funcionario = new Funcionario()
        funcionarioService.save(funcionario)

        then:
        funcionario.id != null
    }
}
