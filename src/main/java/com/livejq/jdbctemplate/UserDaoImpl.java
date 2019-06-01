package com.livejq.jdbctemplate;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

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

    /**
     * 与3.x 用法不同，3.x 使用 ParameteriedBeanPropertyRowMapper.newInstance(User.class) 来
     * 返回一个 RowMapper<User> 对象
     * @param id
     * @return
     */
    @Override
    public User findUserById(int id) {
	    String sql = "select * from tb_user where id = ?";
        RowMapper<User> rowMapper = new BeanPropertyRowMapper<User>(User.class);
        return jdbcTemplate.queryForObject(sql, rowMapper, id);
    }

    @Override
    public List<User> findAllUser() {
        String sql = "select * from tb_user";
        RowMapper<User> rowMapper = new BeanPropertyRowMapper<User>(User.class);
        return jdbcTemplate.query(sql, rowMapper);
    }


}
