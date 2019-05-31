package com.livejq.jdbctemplate;

import org.springframework.jdbc.core.JdbcTemplate;

public class UserDaoImpl implements UserDao {

	private JdbcTemplate jdbcTemplate;
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		String sql = "insert into tb_user (username, password) values(?, ?)";
		Object[] params = new Object[] {
				user.getUsername(),
				user.getPassword()
		};
		int flag = this.jdbcTemplate.update(sql, params);
		return 0;
	}

	@Override
	public int updateUser(User user) {
		// TODO Auto-generated method stub
        String sql = "update tb_user set username = ?," +
                "password = ? where id = ?";
        Object[] params = new Object[] {
                user.getUsername(),
                user.getPassword(),
                user.getId()
        };
        int flag = jdbcTemplate.update(sql, params);
		return flag;
	}

	@Override
	public int deleteUserById(int id) {
		// TODO Auto-generated method stub
        String sql = "delete from tb_user where id = ?";
        int flag = jdbcTemplate.update(sql, id);
		return flag;
	}


}
