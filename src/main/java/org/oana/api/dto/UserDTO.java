package org.oana.api.dto;

import java.util.UUID;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class UserDTO {
    @NotNull
    public UUID id;

    @NotBlank
    public String username;

    @NotBlank
    @Email
    public String email;

    @NotNull
    public String createdAt;

    @NotNull
    public Integer userTypeId;
}