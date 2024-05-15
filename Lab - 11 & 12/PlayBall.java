//LAB 11 - Question 1



// Interface for objects that can be tossed
interface Tossable {
  void toss();
}

// Abstract class for balls with bounce and toss behavior
abstract class Ball implements Tossable {
  private String brandName;

  public Ball(String brandName) {
      this.brandName = brandName;
  }

  public String getBrandName() {
      return brandName;
  }

  // Abstract methods to be implemented by subclasses
  public abstract void toss();

  public abstract void bounce();
}

// Rock class - concrete class implementing Tossable
class Rock implements Tossable {

  @Override
  public void toss() {
      System.out.println("Rock was tossed.");
  }
}


// Baseball class - concrete class implementing Ball and Tossable
class Baseball extends Ball {

  public Baseball(String brandName) {
      super(brandName);
  }

  @Override
  public void toss() {
      System.out.println(getBrandName() + " baseball was tossed.");
  }

  @Override
  public void bounce() {
      System.out.println(getBrandName() + " baseball bounced.");
  }
}

// Football class - concrete class implementing Ball and Tossable
class Football extends Ball {

  public Football(String brandName) {
      super(brandName);
  }

  @Override
  public void toss() {
      System.out.println(getBrandName() + " football was tossed.");
  }

  @Override
  public void bounce() {
      System.out.println(getBrandName() + " football bounced.");
  }
}

// Driver class (example usage)
public class PlayBall {

  public static void main(String[] args) {

      Baseball baseball = new Baseball("Baseball1");
      Football football = new Football("Football1");
      

      baseball.toss();
      baseball.bounce();

      football.toss();
      football.bounce();
  }
}
