public class Android extends Phone{
    private int maxMessageLength=6;
    public Android(String name, String color, String brand) {
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
        System.out.println("<Android>Message:["+message+"]");
        }
    }
}
