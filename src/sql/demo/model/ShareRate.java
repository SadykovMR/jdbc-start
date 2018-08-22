package sql.demo.model;

import java.time.LocalDateTime;

// Модель курсов акций
public class ShareRate extends BaseModel{
    private LocalDateTime operDate; // Время выставления курса
    private long share;             // Акция, для которой задается курс
    private double rate;            // Курс акции

    public ShareRate() {
    }

    public ShareRate(long id, LocalDateTime operDate, long share, double rate) {
        super(id);
        this.operDate = operDate;
        this.share = share;
        this.rate = rate;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    public long getShare() {
        return share;
    }

    public void setShare(long share) {
        this.share = share;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
