package ModelLayer;

import java.text.DateFormat;
import java.util.ArrayList;

/**
 * Created by Admin on 11/28/2016.
 */
public class Loan extends Order{
    private DateFormat startDate;
    private int periodOfTime;
    private ArrayList<Item> loanItem;

    public Loan(String numberID, int quantity, DateFormat startDate, int periodOfTime) {
        super(numberID, quantity);
        this.startDate = startDate;
        this.periodOfTime = periodOfTime;
        loanItem = new ArrayList<>();
    }

    public DateFormat getStartDate() {
        return startDate;
    }

    public void setStartDate(DateFormat startDate) {
        this.startDate = startDate;
    }

    public int getPeriodOfTime() {
        return periodOfTime;
    }

    public void setPeriodOfTime(int periodOfTime) {
        this.periodOfTime = periodOfTime;
    }

}
