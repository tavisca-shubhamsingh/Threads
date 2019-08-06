package threadUsingThreadClass;


class AreaOfCircle extends Thread{
    public void run()
    {
        float radius=4.0f;
        System.out.println("The area of circle of radius 4 unit is: "+Math.PI*radius*radius);

    }
}

class CircumferenceOfCircle extends Thread {
    public void run()
    {
        float radius=4.0f;
        System.out.println("The circumference of circle of radius 4 unit is: "+2*Math.PI*radius);

    }
}

public class Threads {
    public static void main(String[] args) {

        AreaOfCircle areaThread=new AreaOfCircle();
        CircumferenceOfCircle circumferenceThread=new CircumferenceOfCircle();

        areaThread.start();
        circumferenceThread.start();
    }
}
