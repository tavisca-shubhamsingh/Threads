package threadsUsingRunnableInterface;

class AreaOfCircle implements Runnable
{
    public void run()
    {
        float radius=4.0f;
        System.out.println("The area of circle of radius 4 unit is: "+Math.PI*radius*radius);
    }
}

class CircumferenceOfCircle implements Runnable {

    public void run()
    {
        float radius=4.0f;
        System.out.println("The circumference of circle of radius 4 unit is: "+2*Math.PI*radius);
    }
}

public class Threads {
    public static void main(String[] args) {
        AreaOfCircle a=new AreaOfCircle();
        Thread t1=new Thread(a);

        CircumferenceOfCircle c=new CircumferenceOfCircle();
        Thread t2=new Thread(c);

        t1.start();
        t2.start();
    }

}