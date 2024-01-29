package com.xmrwjstk.newsservice.service;

import com.xmrwjstk.newsservice.dto.CategoryDTO;
import com.xmrwjstk.newsservice.entity.CategoryEntity;
import com.xmrwjstk.newsservice.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class NewsService {
    private final CategoryRepository categoryRepository;
    public List<CategoryDTO> findAllCategories(){
        List<CategoryEntity> categoryEntities = categoryRepository.findAll();
        ArrayList<CategoryDTO> list = new ArrayList<>();
        for (CategoryEntity category : categoryEntities){
            System.out.println( category );
            list.add( CategoryDTO.fromCategoryEntity(category) );
        }

        return list;
    }
}
