public class OnlineNewsPaperSubscription extends NewspaperSubscription {
    private String address;
    public OnlineNewsPaperSubscription(String name) {
        super(name);
    }

    @Override
    public void setAddress(String address) {
        boolean contains = false;
        // check for at least one at sine (@)
        for (int byteCode : address.getBytes()) {
            if (byteCode == 64){
                contains = true;
                break;
            }
        }
        this.address = address;

        if (contains)
            setRate(9);
        else
            setRate(0);
    }

    @Override
    public String getAddress() {
        return address;
    }
}
