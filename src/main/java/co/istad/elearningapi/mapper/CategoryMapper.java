package co.istad.elearningapi.mapper;

import co.istad.elearningapi.dto.CategoryRequestDto;
import co.istad.elearningapi.dto.CategoryResponseDto;
import co.istad.elearningapi.entity.Category;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface CategoryMapper {

    List<CategoryResponseDto> toListCategoryResDto(List<Category> all);
    CategoryResponseDto toCategoryResDto(Category category);

    Category fromCategoryReqDto(CategoryRequestDto categoryRequestDto);

    @Mapping(target = "id", source = "id")
    Category fromIdAndCategoryReqDto(Long id, CategoryRequestDto categoryRequestDto);
}
