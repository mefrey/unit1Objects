import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        Picture background = new Picture("turtleback.jpg");
        World turtleWorld = new World(599,449);
        turtleWorld.setPicture(background);
        Turtle turtle1 = new Turtle(100,200,turtleWorld);
        Turtle turtle2 = new Turtle(500,200,turtleWorld);
        turtle1.setName("Buster 1");
        turtle2.setName("Buster 2");
        turtle1.setShellColor(Color.blue);
        turtle1.setColor(Color.orange);
        turtle1.setPenColor(Color.blue);
        turtle1.setPenWidth(5);
        turtle2.setPenWidth(5);
        turtle2.setShellColor(Color.orange);
        turtle2.setColor(Color.blue);
        turtle2.setPenColor(Color.orange);
        turtle1.penDown();
        turtle2.penDown();
        turtle1.moveTo(300,300);
        turtle2.moveTo(300,100);
        turtle1.moveTo(300,200);
        turtle2.moveTo(300,200);
        turtle1.penUp();
        turtle2.penUp();
        turtle1.moveTo(100,200);
        turtle2.moveTo(500,200);
        turtle1.penDown();
        turtle2.penDown();
        turtle1.moveTo(100,300);
        turtle2.moveTo(500,100);
        turtle1.turn(-135);
        turtle2.turn(45);
        turtle1.forward(50);
        turtle2.forward(50);
    }
}