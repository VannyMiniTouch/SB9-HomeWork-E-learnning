package co.istad.elearningapi.dto;

import lombok.Builder;

@Builder
public record InstructorResponseDto(
        String familyName,
        String givenName) {
}
