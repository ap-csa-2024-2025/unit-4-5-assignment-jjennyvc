import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // Make sure to test your methods here
  }

  public static void printNTimes(String word, int N)
  {
    for (int i = 0; i < word.length(); i++)
    {
      String length = word.substring(i, i+1);
      for (int repeatTimes = 0; repeatTimes < N; repeatTimes++)
      {
      System.out.println(length);
      }
    }
  }

  public static void printNums()
  {
    for (int i = 10; i > 0; i --)
    {
      for (int j = 0; j < i; j++)
      {
        System.out.print(i + " ");
      }
      System.out.println();
    }
  }

  public static void uprightNumberTriangle(int N)
  {
    for (int i = 1; i <= 5; i++)
    {
      for (int j = 1; j <= i; j++)
      {
        System.out.print(j);
      }
      System.out.print();
    }
  }

  public static void starTree()
  {
    // code solution here
  }

  public static void multTable()
  {
    for (int i = 1; i <= 100; i += 10)
    {
      for (int j = 1; i <= i; j++)
      {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }
}
