package domain;

public class Logger implements Observer {
    private Bank bank;

    public Logger(Bank bank){
        this.bank = bank;
        this.bank.addObserver(this);
    }

    @Override
    public void update(Rekening rekening) {
        System.out.println(rekening.getRekeningnummer() + " heeft een saldo van " + rekening.getSaldo() + ", de bank heeft nu " + bank.getAantalRekeningen() + " rekeningen");
    }
}
