package com.mum.pm.inventory_module.service;

import com.mum.pm.inventory_module.model.Category;
import com.mum.pm.inventory_module.model.SubCategory;

import java.util.List;
import java.util.Set;

/**
 * Created by manzi on 4/25/2017.
 */
public interface CategoryService {
    public void saveCategory(Category category);

    public Category getCategoryById(int id);

    public Category getCategoryByName(String name);

    public void deleteCategory(int id);

    public List<Category> getAllCategories();

    public boolean isCategoryExist(Category category);

    public Set<SubCategory> getAllSubCategoriesOfACategory(int id);

    public Category setCategoryDisable(Category category);

    public SubCategory getSubCategoryById(int id);

    public SubCategory setSubCategoryDisable(SubCategory subCategory);

    public void saveSubCategory(Category category, SubCategory subcategory);

    public SubCategory getSubCategoryByName(String name);

    public List<Category> getAllActiveCategories();

    public List<SubCategory> getAllActiveSubCategories(int id);

}
