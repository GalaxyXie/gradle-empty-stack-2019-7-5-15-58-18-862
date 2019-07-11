public class iPhone extends Phone{
    private int maxMessageLength=20;
    public iPhone(String name, String color, String brand) {
        super(name, color, brand);
    }

    public int getMaxMessageLength() {
        return maxMessageLength;
    }

    @Override
    public void callMessage(String message) {
        if (message.length()>=this.getMaxMessageLength()){
            System.out.println("Message cannot be sent");
        }else{
        System.out.println("<iPhone>Message:["+message+"]");
        }
    }
}
