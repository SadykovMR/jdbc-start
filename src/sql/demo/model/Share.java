package sql.demo.model;

// Модель акции
public class Share extends BaseModel{
    private String name;    // Наименование
    private int changeProbability; // Вероятность смены курса (в процентах)
    private int delta;   // Максимальная разница (в процентах) на которое может измениться акции от своей стоимости

    public Share() {
    }

    public Share(long id, String name, int changeProbability, int delta) {
        super(id);
        this.name = name;
        this.changeProbability = changeProbability;
        this.delta = delta;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChangeProbability() {
        return changeProbability;
    }

    public void setChangeProbability(int changeProbability) {
        this.changeProbability = changeProbability;
    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }

}
