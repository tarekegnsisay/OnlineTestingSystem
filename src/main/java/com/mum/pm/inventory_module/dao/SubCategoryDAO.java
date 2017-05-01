package com.mum.pm.inventory_module.dao;


import com.mum.pm.inventory_module.model.SubCategory;


        import com.mum.pm.inventory_module.model.Category;
        import org.springframework.data.repository.CrudRepository;
        import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by manzil on 4/27/2017.
 */

@Repository("subCategoryDAO")
public interface SubCategoryDAO extends CrudRepository<SubCategory,Integer>{
    public Iterable<SubCategory> findByCategory(Category category);
    public List<SubCategory> getSubCategoriesByCategory_CategoryId(int id);

}