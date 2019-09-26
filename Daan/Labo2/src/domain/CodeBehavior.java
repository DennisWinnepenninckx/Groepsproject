package domain;

public interface CodeBehavior {
    String encode(String msg);
    String decode(String msg);
}
