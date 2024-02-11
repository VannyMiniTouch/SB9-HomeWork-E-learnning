package co.istad.elearningapi.service;

import co.istad.elearningapi.dto.CategoryRequestDto;
import co.istad.elearningapi.dto.CategoryResponseDto;

import java.util.List;

public interface CategoryService {
    public List<CategoryResponseDto> getAllCategories();
    public CategoryResponseDto getCategoryById(Long id);
    public void createCategory(CategoryRequestDto categoryRequestDto);
    public CategoryResponseDto updateCategory(Long id,CategoryRequestDto categoryRequestDto);
    public void disableCategory(Long id);
    public void deleteCategory(Long id);
}
