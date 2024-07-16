package com.nc13.spring_legacy.model;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Data
public class UserDTO implements UserDetails {
    private int id;
    private String username;
    private String password;
    private String nickname;
    private String role;
    private List<GrantedAuthority> authorities;

    // 시큐리티는 사용자의 권한을 GrantedAuthority 객체의 리스트로 관리
    //getAuthorites()는 UserDetails 인터페이스의 메소드로 사용자의 권한을 반환하는 메소드

    // UserDTO 클래스에서는 getAuthorities() 메서드를 오버라이딩하여 사용자가 가진 권한(role)을
    // SimpleGrantedAuthority() 객체로 생성하고 이를 리스트에 담아 반환합니다.
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority(role));
        return authorities;

    }
}
