package co.istad.elearningapi.service;

import co.istad.elearningapi.dto.CourseDto;
import co.istad.elearningapi.dto.CourseReqUpdateDto;
import co.istad.elearningapi.dto.CourseRequestDto;
import co.istad.elearningapi.dto.CourseResponseDto;

import java.util.List;

public interface CourseService {

    public List<CourseResponseDto> findAllCourses();
    public CourseResponseDto findCourseByID(Long id);

    public void createCourse(CourseRequestDto courseRequestDto);

    public CourseResponseDto updateCourse(Long id, CourseReqUpdateDto courseReqUpdateDto);

    public void disableCourse(Long id);
    public void deleteCourse(Long id);
}
