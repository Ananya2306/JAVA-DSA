package OOPS;

public class Pens {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.color = "blue";
        p1.PrinTColor();
    }
}

class Pen {
    String color;

    public void PrinTColor() {
        System.out.println("The color of the pen is " + this.color);
    }
}
