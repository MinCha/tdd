package tdd.repository;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import tdd.AbstractIntegrationTest;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PersonRepositoryIntegrationTest extends AbstractIntegrationTest {
    @Autowired
    PersonRepository sut;

    @Test
    public void 조회할수있다() {
        Person person = sut.save(new Person("tdd", "pangyo"));
        clearAndFlush();

        Person result = sut.findOne(person.getId());

        assertThat(result.getName(), is("tdd"));
    }
}
