package sql.demo.repository;

import java.sql.SQLException;

public class Traiders extends BaseTable implements TableOperations {
    public Traiders() throws SQLException {
        super("traiders");
    }

    @Override
    public void createTable() throws SQLException {
        super.executeSqlStatement("CREATE TABLE IF NOT EXISTS shares(" +
                "id BIGINT AUTO_INCREMENT PRIMARY KEY," +
                "name varchar(255) NOT NULL," +
                "freqPerDay integer NOT NULL," +
                "cash  decimal(15,2) NOT NULL,"+
                "tradingMethod integer NOT NULL)", "Создана таблица " + tableName);
    }

    @Override
    public void createForeignKeys() throws SQLException {

    }
}
