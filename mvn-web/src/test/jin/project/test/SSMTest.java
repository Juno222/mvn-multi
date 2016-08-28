package project.test;

import jin.project.pojo.Admin;
import jin.project.service.LoginService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * \*
 * \* User: jin82
 * \* Date: 2016/08/28
 * \* Time: 2:43
 * \* Description:
 * \
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/applicationContext*.xml"})
public class SSMTest {

	private Logger logger = Logger.getLogger(this.getClass().getName());

	@Autowired
	private LoginService loginService;

	@Test
	public void test(){
		Admin admin = loginService.getById(1);
		logger.info("----"+admin.getaUser());
	}

}
