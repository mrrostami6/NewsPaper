public abstract class NewspaperSubscription {
    private String name;
    private int rate;
    private String address;

    public NewspaperSubscription(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name : " + name +
                "\nrate : " + rate;
    }

    protected abstract void setAddress(String address);

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public int getRate() {
        return rate;
    }

    public String getAddress() {
        return address;
    }
}
