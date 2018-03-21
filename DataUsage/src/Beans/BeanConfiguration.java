package Beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

	@Bean
	public CellPhoneUserDao cellPhoneUserDao() {
		CellPhoneUserImpl bean = new CellPhoneUserImpl();
		return bean;
	}

	@Bean
	public CellPhoneUserService cellPhoneUserService() {
		CellPhoneUserServiceImpl bean = new CellPhoneUserServiceImpl();
		bean.setCellPhoneUserDao(cellPhoneUserDao());
		return bean;
	}
}
