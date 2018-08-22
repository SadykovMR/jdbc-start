package sql.demo.model;

import java.math.BigDecimal;

// Модель трейдера
public class Traider extends BaseModel{
    // продаем все акции и закупаем макс самых дешевых
    public static final int METHOD_SELL_ALL_BUY_CHEAP = 1;
    // продаем самые дорогие и покупаем самые дешевые
    public static final int METHOD_SELL_ALL_BUY_CHEAPO_SELL_EXPENSIVE_BUY_CHEAP = 2;
    // продаем и покупаем все случайно выбранного наименования
    public static final int METHOD_SELL_ALL_BUY_CHEAP_SELL_RANDOM_BUY_RANDOM = 3;

    private String name;        // Имя
    private int freqPerDay;     // Частота в день
    private BigDecimal cash;    // Сумма (BigDecimal позволяет нам точно работать с десятичной дробной частью)
    private int tradingMethod;  // Применяемый трейдером алгоритм

    public Traider() {
    }

    public Traider(long id, String name, int freqPerDay, BigDecimal cash, int tradingMethod) {
        super(id);
        this.name = name;
        this.freqPerDay = freqPerDay;
        this.cash = cash;
        this.tradingMethod = tradingMethod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFreqPerDay() {
        return freqPerDay;
    }

    public void setFreqPerDay(int freqPerDay) {
        this.freqPerDay = freqPerDay;
    }

    public BigDecimal getCash() {
        return cash;
    }

    public void setCash(BigDecimal cash) {
        this.cash = cash;
    }

    public int getTradingMethod() {
        return tradingMethod;
    }

    public void setTradingMethod(int tradingMethod) {
        this.tradingMethod = tradingMethod;
    }
}
