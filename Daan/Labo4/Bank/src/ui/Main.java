package ui;

import domain.*;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Observer auditor = new Auditor(bank);
        Observer logger = new Logger(bank);
        Rekening rekening = new Rekening("27459631", 4.20);
        bank.addRekening(rekening);
    }
}
