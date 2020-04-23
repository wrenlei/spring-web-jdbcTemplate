package com.sl.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TestDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void save() {
		String sql="insert into t_testa(name) values('11111')";
        jdbcTemplate.execute(sql);
	}
	
	public void methodA() {
		String sql="insert into t_testa(name) values('11111')";
        jdbcTemplate.execute(sql);
	}
	
	public void methodB() {
		String sql="insert into t_testb(name) values('11111')";
        jdbcTemplate.execute(sql);
	}
	
	public void del() {
		String sql="delete from t_testa";
        jdbcTemplate.execute(sql);
	}
	
	public List<Map<String, Object>> get() {
		String sql="select * from t_testa";
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
        return list;
	}
	
	public void update() {
		String sql="update t_testa set name = 'asdfg'";
        jdbcTemplate.execute(sql);
	}
}
