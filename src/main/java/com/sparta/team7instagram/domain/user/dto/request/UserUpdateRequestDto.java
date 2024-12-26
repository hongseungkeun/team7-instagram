package com.sparta.team7instagram.domain.user.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserUpdateRequestDto {
    @Pattern(
            regexp = "^[가-힣]{1,4}$",
            message = "유저명은 4글자 이하의 한글")
    @NotBlank
    private String name;

    @Size(max = 30, message = "소개글은 최대 30자까지 입력 가능합니다.")
    private String intro;
}
