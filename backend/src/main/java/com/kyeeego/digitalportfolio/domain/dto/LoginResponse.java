package com.kyeeego.digitalportfolio.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginResponse {
    private long userId;
    private String userPfp;

    private TokenPair tokenPair;
}
