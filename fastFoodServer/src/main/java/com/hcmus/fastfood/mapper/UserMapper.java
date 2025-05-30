package com.hcmus.fastfood.mapper;

import com.hcmus.fastfood.dto.UserDTO;
import com.hcmus.fastfood.dto.UserRoleDTO;
import com.hcmus.fastfood.model.User;
import com.hcmus.fastfood.model.UserRole;

public class UserMapper {
    public static UserDTO toDTO(User user) {
        if (user == null)
            return null;
        UserDTO dto = new UserDTO();
        dto.setId(user.getId());
        dto.setUsername(user.getUsername());
        dto.setEmail(user.getEmail());
        dto.setPhoneNumber(user.getPhoneNumber());
        dto.setFullName(user.getFullName());
        dto.setCity(user.getCity());
        dto.setAddress(user.getAddress());
        dto.setActive(user.isActive());
        dto.setRole(toRoleDTO(user.getRole()));
        return dto;
    }

    public static UserRoleDTO toRoleDTO(UserRole role) {
        if (role == null)
            return null;
        UserRoleDTO dto = new UserRoleDTO();
        dto.setId(role.getId());
        dto.setName(role.getName());
        dto.setDescription(role.getDescription());
        return dto;
    }
}