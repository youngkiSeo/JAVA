package com.green.security.config.security;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import static org.springframework.security.config.Customizer.withDefaults;

//spring security 5.7.0부터 WebSecurityConfigurerAdapter deprecated 됨
@Configuration
@RequiredArgsConstructor
public class SecurityConfiguration {

    private final JwtTokenProvider jwtTokenProvider;

    //webSecurityCustomizer를 제외한 모든 것, 시큐리티를 거친다. 보안과 연관
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity
                .authorizeHttpRequests(authz -> authz.requestMatchers(

                                        "/sign-api/sign-in"
                                        , "/sign-api/sign-up"
                                        , "/sign-api/exception"

                                        , "/swagger.html"
                                        , "/swagger-ui/**"
                                        , "/v3/api-docs/**"
                                        , "/imgs/**"

                                        , "/js/**"
                                        , "/css/**"
                                        , "/index.html"
                                        , "/"
                                        ,"/view/**"
                                ).permitAll()
                                .requestMatchers(HttpMethod.GET, "/product/**").permitAll() //get 방식으로 들어오면 다 허용 /product **은 1차2차3차신경안쓰겠다
                                .requestMatchers("**exception**").permitAll() //exception이 들어간 주소값이면 다 허용
                                .requestMatchers("/todo-api").hasAnyRole("USER","ADMIN") // 주소값이 todoapi user이다.
                                .anyRequest().hasRole("ADMIN") //anyRequest 어떠한 요청도 어드민이어야한다.

                ) //사용 권한 체크
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS)) //세션 사용 X
                .httpBasic(http -> http.disable()) //UI 있는 시큐리티 설정을 비활성화
                .csrf(csrf -> csrf.disable()) //CSRF 보안이 필요 X, 쿠키와 세션을 이용해서 인증을 하고 있기 때문에 발생하는 일, https://kchanguk.tistory.com/197
                .exceptionHandling(except -> {
                    except.accessDeniedHandler(new CustomAccessDeniedHandler());
                    except.authenticationEntryPoint(new CustomAuthenticationEntryPoint());
                })
                .addFilterBefore(new JwtAuthenticationFilter(jwtTokenProvider), UsernamePasswordAuthenticationFilter.class);
        return httpSecurity.build();
    }

    //시큐리티를 거치지 않는다. 보안과 전혀 상관없는 페이지 및 리소스
    /*
    @Bean
    public WebSecurityCustomizer webSecurityCustomizer() {
        //함수형 인터페이스 람다
        WebSecurityCustomizer lamda = (web) -> web.ignoring()
                    .requestMatchers("/swagger.html", "/swagger-ui/index.html", "/imgs/**", "/js/**", "/css/**", "/index.html");
        return lamda;
    }

     */
}
