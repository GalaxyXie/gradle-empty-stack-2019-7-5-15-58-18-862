public class iPhone extends Phone{

    public iPhone(String name, String color, String brand) {
        super(name, color, brand);
    }

    @Override
    public void callMessage(String message) {
        System.out.println("<iPhone>Message:["+message+"]");
    }
}
