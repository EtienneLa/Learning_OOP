public class Car {

    private String model;
    private String mark;
    private int prize;

    public String getModel() {
        return model;
    }

    public String getMark() {
        return mark;
    }

    public int getPrize() {
        return prize;
    }

    public void setModel( String model ) {
        this.model = model;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setPrize(int prize) {

        this.prize = prize;
    }

    public Car( String model, String mark, int prize ) {

        this.model = model;
        this.mark = mark;
        this.prize = prize;
    }
}
