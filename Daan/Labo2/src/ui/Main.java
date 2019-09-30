package ui;

import domain.CaesarCode;
import domain.Code;
import domain.CodeBehavior;
import domain.Mirror;

public class Main {
    public static void main(String[] args) {
        CodeBehavior cd = new CaesarCode();
        Code c = new Code(cd);
        CodeBehavior m = new Mirror();
        Code c2 = new Code(m);
        System.out.println(c.encode("DiT is ZEer geHeim!"));
    }
}
