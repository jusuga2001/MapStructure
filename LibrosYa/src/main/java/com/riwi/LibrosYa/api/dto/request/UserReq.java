package com.riwi.LibrosYa.api.dto.request;

import com.riwi.LibrosYa.utils.enums.UserRole;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserReq {

    @NotBlank(message = "username is required")
    @Size(min = 5, max = 50)
    private String username;
    @NotBlank(message = "password is required")
    @Size(min = 8, max = 100)
    private String password;
    @Email
    private String email;
    @NotBlank(message = "full name is required")
    @Size(min = 5, max = 100)
    private String full_name;
    @NotNull(message = "role is required")
    private UserRole role;
}
