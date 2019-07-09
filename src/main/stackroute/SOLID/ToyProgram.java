/*
  3. Design the system with skeleton code.
  You are developing a Java application that models a toy builder. Each toy will have a price and
  color. Some toys, such as a toy car or toy train can additionally move, while some toys, such as
  a toy plane can both move and fly.
 */
package main.stackroute.SOLID;

public class ToyProgram
{
    public static void main(String[] args)
    {
        ToyIsMoving toyIsMoving=new ToyIsMoving();
        toyIsMoving.car();
        toyIsMoving.train();
        ToyIsFlying toyIsFlying=new ToyIsFlying();
        toyIsFlying.plane();
    }

}
class Toy
{
     String color="RED";
     float price=2000;
}
class ToyIsMoving extends Toy
{
    void car()
    {
        System.out.println("A Car is a Moving Toy with the color : "+color);
    }
    void train()
    {
        System.out.println("A Train is a moving Toy with the price of : "+price);
    }
}
class ToyIsFlying extends Toy
{
    void plane()
    {
        price+=4000;
        color="Indigo Blue";
        System.out.println("A plane of Rupees : "+price+" has color "+color);
    }
}