import java.util.Arrays;

class App {
  int[] scores = { 72, 95, 91, 85, 87, 51, 65, 72, 75, 89 };
  int median;
  int mean;
  int highScore;
  int lowScore;

  public int getMedian() {
    Arrays.sort(scores);
    if (scores.length % 2 == 0) {
      median = (scores[scores.length / 2] + scores[scores.length / 2 - 1]) / 2;
    } else {
      median = scores[scores.length / 2];
    }
    return median;
  }

  public int getMean() {
    int sum = 0;
    for (int i = 0; i < scores.length; i++) {
      sum = sum + scores[i];
    }
    return sum / scores.length;
  }

  public int getLowestScore() {
    Arrays.sort(scores);
    return scores[0];
  }

  public int getHighestScore() {
    Arrays.sort(scores);
    return scores[scores.length - 1];
  }

  public static void main(String args[]) {
    App app = new App();
    System.out.println("The median is: " + app.getMedian());
    System.out.println("The mean is: " + app.getMean());
    System.out.println("The lowest score is: " + app.getLowestScore());
    System.out.println("The highest score is: " + app.getHighestScore());
  }
}
