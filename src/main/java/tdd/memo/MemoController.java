package tdd.memo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemoController {
    private Note note = new Note();

    @RequestMapping(value = "/memos", method = RequestMethod.POST)
    public String addMemo(String memo) {
        note.add(memo);
        return memo;
    }

    @RequestMapping(value = "/memos", method = RequestMethod.GET)
    public Note getAllOfMemos() {
        return note;
    }
}
