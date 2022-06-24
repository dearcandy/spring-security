package com.example.security;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@SpringBootTest
class PasswordEncoderTest {

    @Test
    void bCryptPasswordEncoderTest(){
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        // 加密
        String encode = bCryptPasswordEncoder.encode("123");
        System.out.println(encode);
        // 匹配判定
        boolean matches = bCryptPasswordEncoder.matches("123", encode);
        System.out.println(matches);

    }
}
