package com.gzmtu.mxdc.security;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gzmtu.mxdc.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.*;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.logout.LogoutHandler;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author mxdc
 * @Date 2019/11/24
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    AdminService adminService;

    @Bean
    PasswordEncoder passwordEncoder() {
//        不加密，已过期
        return NoOpPasswordEncoder.getInstance();
    }

    @Override
    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(adminService);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
//        super.configure(http);
        http.authorizeRequests()//开启认证配置
                .antMatchers("/static/**/**.**").permitAll()
                .anyRequest().authenticated()// 表示剩余的其他接口，登录之后才能访问
                // 开启表单认证登录，一开始就是login界面，不开启会报403。此时不要进行Http basic进行验证
                .and().formLogin()
                // 自定义登录页面，会从/login重定向到“/static/login_page.html”,
                // 在没有指定模板引擎时，视图路径问/resources/static
                .loginPage("/login.html")
//                 设置登录处理接口
                .loginProcessingUrl("/do-login")
//                配置登录页面的参数名，默认是username,password
//                .usernameParameter("user")
//                .passwordParameter("psw")
//       行定义了登录成功的处理逻辑。用户登录成功后可以跳转到某一个页面，也可以返回一段JSON，
                .successHandler(new AuthenticationSuccessHandler() {
                    @Override
                    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
                        Object principal = authentication.getPrincipal();
                        response.setContentType("application/json;charset=utf8");
                        PrintWriter writer = response.getWriter();
                        response.setStatus(200);
                        Map<String, Object> map = new HashMap<>();
                        map.put("status", 2000);
                        map.put("msg", principal);
                        ObjectMapper objectMapper = new ObjectMapper();
                        writer.write(objectMapper.writeValueAsString(map));
                        writer.flush();
                        writer.close();
                    }
                })
//定义了登录失败的处理逻辑，和登录成功类似，不同的是，登录失败的回调方法
//里有一个AuthenticationException 参数，通过这个异常参数可以获取登录失败的原因，进而给
//用户一个明确的提示。
                .failureHandler(new AuthenticationFailureHandler() {
                    @Override
                    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {
                        response.setContentType("application/json;charset=utf8");
                        PrintWriter writer = response.getWriter();
                        response.setStatus(401);
                        Map<String, Object> map = new HashMap<>();
                        map.put("status", 401);
                        if (exception instanceof LockedException) {
                            map.put("msg", "账号被锁定，登录失败");
                        } else if (exception instanceof BadCredentialsException) {
                            map.put("msg", "账号名或密码输入错误，登录失败");
                        } else if (exception instanceof AccountExpiredException) {
                            map.put("msg", "账号过期，登录失败");
                        } else if (exception instanceof CredentialsExpiredException) {
                            map.put("msg", "密码过期，登录失败");
                        } else {
                            map.put("msg", "登录失败");
                        }
                        ObjectMapper objectMapper = new ObjectMapper();
                        writer.write(objectMapper.writeValueAsString(map));
                        writer.flush();
                        writer.close();
                    }
                })
                .permitAll()
                // 支持HTTP基本认证
                .and().logout()
//              默认logoutUrl也是logout
                .logoutUrl("/logout")
//                清除如认证信息,默认为true
                .clearAuthentication(true)
//                使Session失效,默认为true
                .invalidateHttpSession(true)
//              logoutHandler可以做一些清楚工作
                .addLogoutHandler(new LogoutHandler() {
                    @Override
                    public void logout(HttpServletRequest request, HttpServletResponse response, Authentication authentication) {
                    }
                })
                .logoutSuccessHandler(new LogoutSuccessHandler() {
                    @Override
                    public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
                        response.sendRedirect("/login");
                    }
                })
//              在Security的默认拦截器里，默认会开启CSRF处理，判断请求是否携带了token，如果没有就拒绝访问。并且，在请求为(GET|HEAD|TRACE|OPTIONS)时，则不会开启
                .and().csrf().disable()
        ;
    }


}
