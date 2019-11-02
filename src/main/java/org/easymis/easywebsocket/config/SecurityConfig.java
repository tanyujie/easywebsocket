package org.easymis.easywebsocket.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers(

				"/webjars/**", "/sec/**", "/v2/**", "/swagger**", "/swagger-resources/**"//用来获取api-docs的URI

		);
		// 忽略登录界面
		web.ignoring().antMatchers("/login");
		// 首页地址不拦截
		web.ignoring().antMatchers("/index.html");
		web.ignoring().antMatchers("/static/**");
		web.ignoring().antMatchers("/web/socket/**");
		web.ignoring().antMatchers("/webSocket.html");

	}
    @Override
    protected void configure(HttpSecurity http) throws Exception {
      //  http.cors().configurationSource(corsConfigurationSource());
        http.csrf().disable();



        http.authorizeRequests().mvcMatchers(HttpMethod.POST, "/user/login").permitAll()
                .anyRequest().authenticated()
                // .and().rememberMe().userDetailsService(pcPasswordUserDetailService).key("banza")
                .and().anonymous().principal("ROLE_ANONYMOUS").and()
                .logout().logoutUrl("/user/logout").permitAll().invalidateHttpSession(true).
                and().sessionManagement().maximumSessions(1);
        ;


    }
}

