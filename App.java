import java.util.Arrays;

class App {
  int[] scores = { 72, 95, 91, 85, 87, 51, 65, 72, 75, 89 };
  int median;

  public int getMedian() {
    Arrays.sort(scores);
    if (scores.length % 2 == 0) {
      median = (scores[scores.length / 2] + scores[scores.length / 2 - 1]) / 2;
    } else {
      median = scores[scores.length / 2];
    }
    return median;
  }

  public static void main(String args[]) {
    App app = new App();
    System.out.println(app.getMedian());
  }
}
