package cn.edu.bjut.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class JWTUtils {
    public void testGenJWT(){ // 生成JWT
        Map<String, Object> claims = new HashMap<>();
        claims.put("username", "zhangsan");
        claims.put("id", "1");

        String jwt = Jwts.builder()
                .setClaims(claims)
                .signWith(SignatureAlgorithm.HS256, "itheima")
                .setExpiration(new Date(System.currentTimeMillis() + 600 * 1000))
                .compact();
        System.out.println(jwt);
    }

    // 篡改解析报错
    // 过期解析报错
    public void testParseJWT(){ // 解析JWT
        Claims claims = Jwts.parser()
                .setSigningKey("itheima")
                .parseClaimsJws("eyJhbGciOiJIUzI1NiJ9.eyJpZCI6IjEiLCJleHAiOjE3MTAzMzIzNTEsInVzZXJuYW1lIjoiemhhbmdzYW4ifQ.fY8vwVeZlpXuVHy-J0LRTv1zzsEiXe4f-qZx7QTKFnQ")
                .getBody();
        System.out.println(claims);
    }
}
