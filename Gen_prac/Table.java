
public class Table<L, C> {

    private L legs;
    private C color;

    public Table(L legs, C color) {
        this.legs = legs;
        this.color = color;
    }

    public Table(L legs) {
        this.legs = legs;
    }

    public Table(int color) {
    }

    public Table(int stage) {
    }

    public L getLegs() {
        return legs;
    }

    public C getColor() {
        return color;
    }

    public void setLegs(L legs) {
        this.legs = legs;
    }

    public void setColor(C color) {
        this.color = color;
    }

}
