package org.example;

public class Movie extends Title implements Classification {
  @Override
  public int classify() {
    if (getTotalReviews() >= 7) {
      return 5;
    } else if (getTotalReviews() >= 3) {
      return 3;
    } else {
      return 1;
    }
  }
}
