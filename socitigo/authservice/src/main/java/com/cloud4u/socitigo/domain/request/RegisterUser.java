package com.cloud4u.socitigo.domain.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
public class RegisterUser {
    private String name;
    private String password;
    private String emailId;
    private Long orgId;
}
