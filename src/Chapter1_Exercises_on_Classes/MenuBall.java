package Chapter1_Exercises_on_Classes;

public class MenuBall {

        public static void main(String[] args) {
            Ball ball = new Ball(50, 50, 10, 5, -3);

            System.out.println(ball);  // Ball[(50.0,50.0),speed=(5.0,-3.0)]
            ball.move();
            System.out.println(ball);  // Ball[(55.0,47.0),speed=(5.0,-3.0)]

            ball.reflectHorizontal();
            System.out.println(ball);  // Ball[(55.0,47.0),speed=(-5.0,-3.0)]

            ball.move();
            System.out.println(ball);  // Ball[(50.0,44.0),speed=(-5.0,-3.0)]

            ball.reflectVertical();
            System.out.println(ball);  // Ball[(50.0,44.0),speed=(-5.0,3.0)]
        }
    }


