public class PrefixAgain2 {
  public boolean prefixAgain(String str, int n) {

    for (int i = 0; i < str.length() - n; i++) {
      if (str.substring(0, n).equals(str.substring(i + 1, i + n + 1))) {
        return true;
      }
    }
    return false;
  }
}
