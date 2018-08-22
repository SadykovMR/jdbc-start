package sql.demo.model;

import java.time.LocalDateTime;

// Модель операций трейдеров на бирже
public class TraiderShareAction extends BaseModel {
    public static final int OPERATION_BUY = 1;  // Покупка
    public static final int OPERATION_SELL= 2;  // Продажа

    private LocalDateTime operDate; // дата и время совершения операции
    private int  operation;         // собственно операция (buy, sell)
    private long traider;           // трейдер, совершивший операцию
    private long share;             // акции, с которыми совершена операции
    private long amount;            // и их количество

    public TraiderShareAction() {
    }

    public TraiderShareAction(long id, LocalDateTime operDate, int operation, long traider, long share, long amount) {
        super(id);
        this.operDate = operDate;
        this.operation = operation;
        this.traider = traider;
        this.share = share;
        this.amount = amount;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    public int getOperation() {
        return operation;
    }

    public void setOperation(int operation) {
        this.operation = operation;
    }

    public long getTraider() {
        return traider;
    }

    public void setTraider(long traider) {
        this.traider = traider;
    }

    public long getShare() {
        return share;
    }

    public void setShare(long share) {
        this.share = share;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }
}
