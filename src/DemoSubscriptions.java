public class DemoSubscriptions {
    public static void main(String[] args) {

        PhysicalNewspaperSubscription pns = new PhysicalNewspaperSubscription("John");
        pns.setAddress("no , baker street, London City, England");
        System.out.println("Name : " + pns.getName());
        System.out.println("Rate : " + pns.getRate());
        System.out.println("Address : " + pns.getAddress());

        OnlineNewsPaperSubscription onps = new OnlineNewsPaperSubscription("Sherlock");
        onps.setAddress("@ no 18, Lale Street, London city, England");
        System.out.println("Name : " + onps.getName());
        System.out.println("Rate : " + onps.getRate());
        System.out.println("Address : " + onps.getAddress());

    }
}
