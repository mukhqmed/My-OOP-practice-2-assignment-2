public abstract class Wagon {
    private int id;

    public abstract int getMaxSeats();
    public abstract String getType();
    public abstract int emptySeats();
    public abstract void showEmptySeats();
    public abstract boolean[] seats();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}