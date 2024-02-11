package co.istad.elearningapi.dto;

import lombok.Builder;

@Builder
public record CourseRequestDto(
        String title,
        String thumbnail,
        String description,
        Boolean isFree,
        Boolean isDeleted,
        Long cateId,
        Long insId
) {
}
