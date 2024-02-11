package co.istad.elearningapi.dto;

import lombok.Builder;

@Builder
public record InstructorDto(Integer id,
                            String familyName,
                            String givenName) {
}
