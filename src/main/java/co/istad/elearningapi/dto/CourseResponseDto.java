package co.istad.elearningapi.dto;

import lombok.Builder;

@Builder
public record CourseResponseDto(
        String title,
        String thumbnail,
        String description,
        Boolean isFree,
        Boolean isDeleted,
        CategoryResponseDto category,
        InstructorResponseDto instructor
) {
}
