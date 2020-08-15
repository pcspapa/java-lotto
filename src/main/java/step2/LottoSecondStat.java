package step2;

import java.util.Objects;

public class LottoSecondStat extends LottoStat {

  private int count;

  public LottoSecondStat() {
    this(0);
  }

  public LottoSecondStat(int count) {
    super(Grade.Second);
    this.count = count;
  }

  @Override
  int getCount() {
    return count;
  }

  @Override
  void decide(int sameNumberCount) {
    if (sameNumberCount == grade.getSameCount()) {
      count++;
    }
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LottoSecondStat that = (LottoSecondStat) o;
    return count == that.count;
  }

  @Override
  public int hashCode() {
    return Objects.hash(count);
  }

  @Override
  public String toString() {
    return String.format("%s- %d개", grade, count);
  }

}
