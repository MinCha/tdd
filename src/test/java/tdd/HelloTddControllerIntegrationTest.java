package tdd;

import org.junit.Test;
import org.springframework.http.ResponseEntity;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class HelloTddControllerIntegrationTest extends AbstractIntegrationTest {
    @Test
    public void getHello() throws Exception {
        ResponseEntity<String> response = get("/", String.class);

        assertThat(response.getBody(), equalTo("Hello TDD"));
    }
}
