public class Android extends Phone{
    public Android(String name, String color, String brand) {
        super(name, color, brand);
    }

    @Override
    public void callMessage(String message) {
        System.out.println("<Android>Message:["+message+"]");
    }
}
