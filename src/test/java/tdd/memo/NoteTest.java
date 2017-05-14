package tdd.memo;

import org.junit.Test;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class NoteTest {
    @Test
    public void 새로운_메모를_추가할수_있다() {
        //준비 or Given
        Note sut = new Note();

        // 실행 or When
        sut.add("First");

        // 검증 or Then
        assertThat(sut.getMemos(), hasItem("First"));
    }

    @Test
    public void 여러개의_메모를_추가할수_있다() {
        //준비 or Given
        Note sut = new Note();

        // 실행 or When
        sut.add("First");
        sut.add("Second");

        // 검증 or Then
        assertThat(sut.getMemos().size(), is(2));
    }
}
