package transport;

public enum Capacity {
    ESPECIALLY_SMALL(0, 10),
    SMALL(10, 25),
    AVERAGE(40, 50),
    BIG(60,80),
    EXTRA_LARGE(100,200);
    private final int from;
    private final int to;

    Capacity(int from, int to) {
        this.from = from;
        this.to = to;
    }

    public int getFrom() {
        return from;
    }

    public int getTo() {
        return to;
    }
}
