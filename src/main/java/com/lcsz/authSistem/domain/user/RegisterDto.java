package com.lcsz.authSistem.domain.user;

public record RegisterDto(String login, String password, UserRole role) {
}
