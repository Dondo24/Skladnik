/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import com.mysql.cj.jdbc.MysqlDataSource;
import dao.MaterialDao;
import dao.MysqlMaterialDao;
import dao.MysqlPouzivatelDao;
import dao.MysqlSkladDao;
import dao.PouzivatelDao;
import dao.SkladDao;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Daniel
 */
public enum ObjectFactory {
    INSTANCE;
    
    private JdbcTemplate jdbcTemplate;
    private JdbcTemplate getJdbcTemplate() {
        if (jdbcTemplate == null) {
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setUrl("jdbc:mysql://localhost/mydb?serverTimezone=UTC");
            dataSource.setUser("skladnik");
            dataSource.setPassword("sklad");
            jdbcTemplate = new JdbcTemplate(dataSource);
        }
        return jdbcTemplate;
    }
    
       
    
    public MaterialDao getMaterialDao(){
    return new MysqlMaterialDao(getJdbcTemplate());
    }
    
     public PouzivatelDao getPouzivatelDao(){
    return new MysqlPouzivatelDao(getJdbcTemplate());
    }
        public SkladDao getSkladDao(){
    return new MysqlSkladDao(getJdbcTemplate());
    }
    public PouzivatelDao getHesla(){
        return new MysqlPouzivatelDao(getJdbcTemplate());
    }
    
}
