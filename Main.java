import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {

    // Uncomment to test the Car classes
    CarTester.run();



    // Uncomment to test the Company classes
    // CompanyTester.run();



    Dog doggah = new Dog("Tyler");
    System.out.println(doggah.speak() + "\n" + doggah.toString());

    LoudDog pimpy_dog = new LoudDog("Tyrone");
    System.out.println(pimpy_dog.speak() + "\n" + pimpy_dog.toString());

  }
}
