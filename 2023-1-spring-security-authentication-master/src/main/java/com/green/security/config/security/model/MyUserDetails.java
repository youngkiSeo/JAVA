package com.green.security.config.security.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Data
@Builder
public class MyUserDetails implements UserDetails {
    private Long iuser;
    private String uid;
    private String upw;
    private String name;

    @Builder.Default
    private List<String> roles = new ArrayList<>();


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.roles.stream().map(SimpleGrantedAuthority::new).collect(Collectors.toList());
    }

    @Override
    public String getPassword() { return this.upw; }

    @Override
    public String getUsername() { return this.uid; }

    @Override
    public boolean isAccountNonExpired() { return true; }
    // 계정이 만료되지 않았는지를  리턴한다 true를 리턴하면 만료되지 않음을 의미

    @Override
    public boolean isAccountNonLocked() { return true; }
    //계정이 잠겨있지 않은지를 리턴한다. true를 리턴하면 계정이 잠겨 있지 않음을 의미
    @Override
    public boolean isCredentialsNonExpired() { return true; }
    //계정의 패스퉈드가 만료되지 않았는지를 리턴한다. true를 리턴하면 패스워드가 만료되지 않음을 의미
    @Override
    public boolean isEnabled() { return true; }
    // 계정이 사용가능한 계정이지를 리턴한다 true를 리턴하면 사용가능한 계정을 의미
}
