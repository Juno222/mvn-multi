package jin.project.service.jin.project.service.impl;

import jin.project.mapper.AdminMapper;
import jin.project.pojo.Admin;
import jin.project.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * \*
 * \* User: jin82
 * \* Date: 2016/08/28
 * \* Time: 2:08
 * \* Description:
 * \
 */
@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private AdminMapper adminMapper;

	@Override
	public Admin getById(Integer id) {
		return adminMapper.selectByPrimaryKey(id);
	}
}
