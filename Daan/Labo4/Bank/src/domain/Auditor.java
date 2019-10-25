package domain;

import java.time.LocalDate;

public class Auditor implements Observer {
    private Bank bank;

    public Auditor(Bank bank){
        this.bank = bank;
        this.bank.addObserver(this);
    }

    @Override
    public void update(Rekening rekening) {
        System.out.println("Nieuwe rekening geopend op datum " + LocalDate.now() + " met nummer " + rekening.getRekeningnummer() + " en saldo " + rekening.getSaldo());
    }
}
