/**
 * Created by Home on 11.04.2017.
 */
public class Field {
    public int row;
    public int column;
    public int content;

    public Field(int row, int column) {
        this.row = row;
        this.column = column;
        content = 0;
    }

    public boolean isEmpty()
        if(content=0) return 1;
        return 0;
}
