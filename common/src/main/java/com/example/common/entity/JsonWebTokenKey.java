package com.example.common.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

public class JsonWebTokenKey {
    private String privateKey;
    private String publicKey;
}