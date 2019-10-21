package com.miguel.cursomc.Interface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoSQL {

    public static void main(String[] args) throws SQLException {

        {

            String connectionURL = "jdbc:sqlserver://172.0.0.4:1433";

            try {

                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

                Connection conexao = DriverManager.getConnection(connectionURL,
                        "miguel.santos", "Mutant@2019");

                System.out.println("Conexão obtida com sucesso");

            } catch (SQLException ex) {

                System.out.println("SQLException: " + ex.getMessage());
                System.out.println("SQLException: " + ex.getSQLState());
                System.out.println("SQLException: " + ex.getErrorCode());

            } catch (Exception e) {

                System.out.println("Não foi possivel conectar com o banco");
                e.printStackTrace();

            }

        }

    }    
}