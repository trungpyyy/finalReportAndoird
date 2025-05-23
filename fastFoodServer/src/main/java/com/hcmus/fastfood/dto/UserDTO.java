package com.hcmus.fastfood.dto;

import lombok.Data;

@Data
public class UserDTO {
    private String id;
    private String username;
    private String email;
    private String phoneNumber;
    private String fullName;
    private String address;
    private String city;
    private boolean isActive;
    private UserRoleDTO role;
}