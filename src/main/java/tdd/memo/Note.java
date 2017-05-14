package tdd.memo;

import java.util.ArrayList;
import java.util.List;

public class Note {
    private List<String> memos = new ArrayList<>();

    public void add(String memo) {
        memos.add(memo);
    }

    public List<String> getMemos() {
        return memos;
    }
}
