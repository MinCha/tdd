package tdd.memo;

import tdd.BaseObject;

import java.util.ArrayList;
import java.util.List;

public class Note extends BaseObject {
    private List<String> memos = new ArrayList<>();

    public void add(String memo) {
        memos.add(memo);
    }

    public List<String> getMemos() {
        return memos;
    }
}
