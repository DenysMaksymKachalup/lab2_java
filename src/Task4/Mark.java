package Task4;

import java.util.List;
import java.util.ArrayList;

public class Mark {
    public List<Integer> mark = new ArrayList<>();

    public Mark(List<Integer> list) {
        this.mark = list;
    }

    public Mark() { }

    public List<Integer> getMark() {
        return mark;
    }

    public void setMark(List<Integer> mark) {
        this.mark = mark;
    }

}

