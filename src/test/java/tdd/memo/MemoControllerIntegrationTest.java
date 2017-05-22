package tdd.memo;

import org.junit.Test;
import org.springframework.http.ResponseEntity;
import tdd.AbstractWebIntegrationTest;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;

public class MemoControllerIntegrationTest extends AbstractWebIntegrationTest {
    @Test
    public void 작성한_모든_메모를_조회할수_있다() {
        Map<String, String> parameters = new HashMap<>();
        parameters.put("memo", "Good TDD");
        post("/memos", parameters, String.class);

        Note result = getObject("/memos", Note.class);

        assertThat(result.getMemos(), hasItem("Good TDD"));
    }
}
