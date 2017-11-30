/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import ics.upjs.sk.paz1c.skladnik.entity.Sklad;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Daniel
 */
public class MysqlSkladDao implements SkladDao{
    private JdbcTemplate jdbcTemplate;
    
    public MysqlSkladDao(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void pridajSklad(Sklad sklad) {
        jdbcTemplate.update("INSERT INTO sklad (nazov,adresa) VALUES (?,?)",sklad.getNazov(),sklad.getAdresa());
    }

    @Override
    public Sklad dajSklad(Long id) {
       String sql = "Select id,nazov from sklad where id = ?";
    }

    @Override
    public void odstranSklad(Sklad sklad) {
        jdbcTemplate.update("delete from sklad where id=?");
        sklad.getId();
    }
    
}