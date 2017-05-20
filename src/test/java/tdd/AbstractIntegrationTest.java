package tdd;

import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@RunWith(SpringRunner.class)
@SpringBootTest
@DataJpaTest
public abstract class AbstractIntegrationTest {
    @PersistenceContext
    protected EntityManager entityManager = null;

    protected void clearAndFlush() {
        entityManager.flush();
        entityManager.clear();
    }
}
