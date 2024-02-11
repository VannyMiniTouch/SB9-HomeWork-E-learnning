package co.istad.elearningapi.mapper;

import co.istad.elearningapi.dto.CourseReqUpdateDto;
import co.istad.elearningapi.dto.CourseRequestDto;
import co.istad.elearningapi.dto.CourseResponseDto;
import co.istad.elearningapi.entity.Course;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CourseMapper {
    List<CourseResponseDto> toCoursesResDto(List<Course> all);
    Course fromCourseReqDto(CourseRequestDto courseRequestDto);
    CourseResponseDto toCourseResDto(Course course);
    void copyFromUpdateDto(@MappingTarget Course course, CourseReqUpdateDto courseReqUpdateDto);
}
