package sql.demo.repository;

import java.sql.SQLException;

// Операции с таблицами
public interface TableOperations {
    void createTable() throws SQLException; // создание таблицы
    void createForeignKeys() throws SQLException; // создание связей между таблицами
}
