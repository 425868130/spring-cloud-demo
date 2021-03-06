/*
package com.example.authcenter.controller;

import com.example.authcenter.service.tokenService.TokenService;
import com.example.common.define.StatusCode;
import com.example.common.define.Result;
import com.feign.provider.dto.UserAuthDTO;
import com.feign.provider.userService.UserServiceFeign;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.impl.DefaultClaims;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
@Slf4j
@RefreshScope
@RestController
public class AuthController {
    @Autowired
    UserServiceFeign userServiceFeign;

    @Autowired
    private DiscoveryClient discoveryClient;
    @Value("${server.port}")
    private String ip;
    @Autowired
    private TokenService tokenService;

    @RequestMapping("/client")
    public Result client() {
        String services = "Services: " + discoveryClient.getServices() + " ip :" + ip;
        log.info(services);
        return Result.success(services);
    }

    @RequestMapping("user")
    public Result userInfo() {
        return userServiceFeign.getInfo();
    }

    @PostMapping("login")
    public Result UserAuth(@RequestBody UserAuthDTO userAuthDTO) {
        */
/*模拟用户身份校验*//*

        if ("xujw".equals(userAuthDTO.getAccount()) && "1320074071".equals(userAuthDTO.getPassword())) {
            Claims claims = new DefaultClaims();
            claims.put("user", "xujw");
            return Result.success(tokenService.generateToken(claims));
        }
        return Result.error(StatusCode.PERMISSION_NO_ACCESS);
    }

    @PostMapping("logout")
    Result logout(HttpServletRequest httpServletRequest, @RequestBody UserAuthDTO userAuthDTO) {

        return Result.success();
    }
}
*/
