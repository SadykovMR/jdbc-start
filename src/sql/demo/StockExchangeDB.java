package sql.demo;

import sql.demo.repository.*;
import java.sql.*;

public class StockExchangeDB {
    // Блок объявления констант
    public static final String DB_URL = "jdbc:h2:/c:/JavaPrj/SQLDemo/db/stockExchange";
    public static final String DB_Driver = "org.h2.Driver";

    // Таблицы СУБД
    Traiders traiders;
    ShareRates shareRates;
    Shares shares;
    TraiderShareActions traiderShareActions;

    // Получить новое соединение с БД
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL);
    }

    // Инициализация
    public StockExchangeDB() throws SQLException, ClassNotFoundException {
        Class.forName(DB_Driver);
        // Инициализируем таблицы
        traiders = new Traiders();
        shares = new Shares();
        shareRates = new ShareRates();
        traiderShareActions = new TraiderShareActions();
    }

    // Создание всех таблиц и ключей между ними
    public void createTablesAndForeignKeys() throws SQLException {
        shares.createTable();
        shareRates.createTable();
        traiders.createTable();
        traiderShareActions.createTable();
        // Создание внешних ключей (связt` между таблицами)
        shareRates.createForeignKeys();
        traiderShareActions.createForeignKeys();
    }


    public static void main(String[] args) {
        try{
            StockExchangeDB stockExchangeDB = new StockExchangeDB();
            stockExchangeDB.createTablesAndForeignKeys();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Ошибка SQL !");
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC драйвер для СУБД не найден!");
        }
    }
}
