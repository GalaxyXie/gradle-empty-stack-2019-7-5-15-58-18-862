public class IPhoneRobot {
    String name;
    iPhone iphone;

    public IPhoneRobot(String name, iPhone iphone) {
        this.name = name;
        this.iphone = iphone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public iPhone getIphone() {
        return iphone;
    }

    public void setIphone(iPhone iphone) {
        this.iphone = iphone;
    }
}
