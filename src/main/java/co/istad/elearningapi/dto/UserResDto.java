package co.istad.elearningapi.dto;

import lombok.Builder;

@Builder
public record UserResDto(
        String username,
        String email
) {
}
