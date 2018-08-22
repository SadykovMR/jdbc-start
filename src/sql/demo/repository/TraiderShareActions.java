package sql.demo.repository;

import java.sql.SQLException;

public class TraiderShareActions extends BaseTable implements TableOperations{
    public TraiderShareActions() throws SQLException {
        super("traider_share_actions");
    }

    @Override
    public void createTable() throws SQLException {
        super.executeSqlStatement("CREATE TABLE IF NOT EXISTS traider_share_actions(" +
                "id BIGINT AUTO_INCREMENT PRIMARY KEY," +
                "operation integer NOT NULL," +
                "traider integer NOT NULL,"+
                "share_rate integer NOT NULL,"+
                "amount bigint NOT NULL)", "Создана таблица " + tableName);
    }

    @Override
    public void createForeignKeys() throws SQLException {
        super.executeSqlStatement(" ALTER TABLE traider_share_actions ADD FOREIGN KEY (share_rate) REFERENCES share_rates(id)",
                "Cоздан внешний ключ traider_share_actions.share -> shares.id");
    }
}
