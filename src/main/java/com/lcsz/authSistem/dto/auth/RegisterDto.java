package com.lcsz.authSistem.dto.auth;

import com.lcsz.authSistem.model.user.UserRole;

public record RegisterDto(String login, String password, UserRole role) {
}
