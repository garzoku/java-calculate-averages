import java.util.Arrays;

class App {
  private static int[] scores = { 72, 95, 91, 85, 87, 51, 65, 72, 75, 89 };

  public static void main(String args[]) {
    System.out.println("The median is: " + getMedian());
    System.out.println("The mean is: " + getMean());
    System.out.println("The lowest score is: " + getLowestScore());
    System.out.println("The highest score is: " + getHighestScore());
  }

  private static int getMedian() {
    int median;
    Arrays.sort(scores);
    if (scores.length % 2 == 0) {
      median = (scores[scores.length / 2] + scores[scores.length / 2 - 1]) / 2;
    } else {
      median = scores[scores.length / 2];
    }
    return median;
  }

  private static int getMean() {
    int sum = 0;
    for (int i = 0; i < scores.length; i++) {
      sum = sum + scores[i];
    }
    return sum / scores.length;
  }

  private static int getLowestScore() {
    Arrays.sort(scores);
    return scores[0];
  }

  private static int getHighestScore() {
    Arrays.sort(scores);
    return scores[scores.length - 1];
  }
}
