package com.ssafy.websns.config;

import com.ssafy.websns.config.oauth.CustomOAuth2UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.web.filter.CorsFilter;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig extends WebSecurityConfigurerAdapter {

  private final CorsFilter corsFilter;
  private final CustomOAuth2UserService customOAuth2UserService;

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http.csrf().disable();

    http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
        .and()
        .addFilter(corsFilter)
        .formLogin().disable()
        .httpBasic().disable()
//        .addFilter(new JwtAuthenticationFilter(authenticationManager())) //AuthenticationManager
//        .addFilter(new JwtAuthorizationFilter(authenticationManager(),userRepository))
        .authorizeRequests()
        .antMatchers("/**").permitAll();
//        .antMatchers("/user/**","/auth/**").permitAll()
//        .anyRequest()
//        .authenticated()
//        .and()
//        .oauth2Login()
//        .loginPage("/user")
//        .loginPage("/loginform") //구글 로그인이 완료된 뒤에 후처리가 필요함.
//        // 1.코드받기(인증) 2. 엑세스토큰 받기(권한) 3.사용자 프로필 정보를 가져오기 4-1.그 정보를 토대로 회원가입을 자동으로 진행 4-2. 부족한 정보를 수집
//        // Tip. 코드X, => (엑세스토큰 + 사용자 프로필 정보)를 받음
//        .userInfoEndpoint()
//        .userService(customOAuth2UserService);

  }
}
