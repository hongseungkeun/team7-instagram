package com.sparta.team7instagram.domain.user.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor (access = AccessLevel.PROTECTED)
public class UserPasswordUpdateRequestDto {
    @Pattern(
            regexp = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[!@#$%^&*(),.?\":{}|<>]).{8,}$",
            message = "비밀번호는 영문자, 숫자, 특수문자를 각각 최소 1개 이상 포함하고, 8자 이상이어야 합니다."
    )
    @NotBlank
    private String currentPassword;

    @Pattern(
            regexp = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[!@#$%^&*(),.?\":{}|<>]).{8,}$",
            message = "비밀번호는 영문자, 숫자, 특수문자를 각각 최소 1개 이상 포함하고, 8자 이상이어야 합니다."
    )
    @NotBlank
    private String changedPassword;
}
