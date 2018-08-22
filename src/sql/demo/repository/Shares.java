package sql.demo.repository;

import java.sql.SQLException;

public class Shares extends BaseTable implements TableOperations{

    public Shares() throws SQLException {
        super("shares");
    }

    @Override
    public void createTable() throws SQLException {
        super.executeSqlStatement("CREATE TABLE IF NOT EXISTS shares(" +
                "id BIGINT AUTO_INCREMENT PRIMARY KEY," +
                "name VARCHAR(255) NOT NULL," +
                "changeProbability INTEGER NOT NULL,"+
                "delta INTEGER NOT NULL)", "Создана таблица " + tableName);
    }

    @Override
    public void createForeignKeys() throws SQLException {
    }
}
