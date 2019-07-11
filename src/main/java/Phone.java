public class Phone {
   private String name;
   private String color;
   private String brand;

   public Phone(String name, String color, String brand) {
      this.name = name;
      this.color = color;
      this.brand = brand;
   }

   public void callMessage(String message){
      System.out.println("Message:["+message+"]");
   }
   public void printMessage(){
      System.out.println(this.toString());
   }

   public String getName() {
      return name;
   }

   public String getColor() {
      return color;
   }

   public String getBrand() {
      return brand;
   }

   @Override
   public String toString() {
      return "name:[" + name + "]," +
              "color:[" + color + "]," +
              "brand:[" + brand + "]" ;
   }
}
