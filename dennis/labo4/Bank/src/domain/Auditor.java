package domain;
import java.time.LocalDateTime;


public class Auditor implements Observer {
    Bank bank = new Bank();
    public Auditor(Bank b){
        this.bank = b;
        bank.registerObserver(Events.NEW,this);
    }
    @Override
    public void update(Events e) {
       // if(e.toString().equals("NEW")){
            Account a = (Account) bank.getNewest();
            System.out.println("Nieuwe rekening geopend op datum "+ LocalDateTime.now().getDayOfMonth()+"/"+LocalDateTime.now().getMonthValue()+"/"+LocalDateTime.now().getYear() +" met nummer "+ a.getIndex() +" en saldo "+ a.getSaldo());
        //}
       }
}
