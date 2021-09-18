public class PhysicalNewspaperSubscription extends NewspaperSubscription{
    private String address;
    public PhysicalNewspaperSubscription(String name) {
        super(name);
    }


    @Override
    public void setAddress(String address) {
        boolean contains = false;
        // check for at least one digit
        for (int byteCode : address.getBytes()) {
            if (byteCode >= 48 && byteCode <= 57){
                contains = true;
                break;
            }
        }
        this.address = address;
        if (contains)
            setRate(15);
        else
            setRate(0);

    }

    @Override
    public String getAddress() {
        return address;
    }
}
