package tdd.memo;

import org.junit.Test;
import org.springframework.http.ResponseEntity;
import tdd.AbstractIntegrationTest;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;

public class MemoControllerIntegrationTest extends AbstractIntegrationTest {
    @Test
    public void 작성한_모든_메모를_조회할수_있다() {
        Map<String, String> parameters = new HashMap<>();
        parameters.put("memo", "Good TDD");
        ensureOK(post("/memos", parameters, String.class));

        ResponseEntity<Note> result = ensureOK(get("/memos", Note.class));

        assertThat(result.getBody().getMemos(), hasItem("Good TDD"));
    }
}
