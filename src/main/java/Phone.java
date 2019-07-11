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

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getColor() {
      return color;
   }

   public void setColor(String color) {
      this.color = color;
   }

   public String getBrand() {
      return brand;
   }

   public void setBrand(String brand) {
      this.brand = brand;
   }
}