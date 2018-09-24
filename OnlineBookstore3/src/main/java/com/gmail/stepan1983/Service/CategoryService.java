package com.gmail.stepan1983.Service;

import com.gmail.stepan1983.model.CategoryItem;
import com.gmail.stepan1983.model.Publisher;

import java.util.List;

public interface CategoryService {


    CategoryItem addCategoryItem(CategoryItem categoryItem);

    CategoryItem getById(Long categoryId);

    void updateCategory(CategoryItem categoryItem);

    List<CategoryItem> findAll();

    CategoryItem getByName(String name);

    long count();
}
