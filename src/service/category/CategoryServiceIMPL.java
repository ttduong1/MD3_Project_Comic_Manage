package service.category;

import config.Config;
import model.Category;

import java.util.List;

public class CategoryServiceIMPL implements ICategoryService{
    List<Category> categoryList = new Config<Category>().readFromFile(Config.PATH_CATEGORY, categoryList);
    @Override
    public List<Category> findAll() {
        return categoryList;
    }

    @Override
    public void save(Category category) {
        if (findById(category.getId())==null){
            categoryList.add(category);
        }else {
            categoryList.set(categoryList.indexOf(findById(category.getId())),category);
        }
        new Config<Category>().readFromFile(Config.PATH_CATEGORY, categoryList);
    }

    @Override
    public void remove(int id) {

    }

    @Override
    public Category findById(int id) {
        return null;
    }

    @Override
    public void updateData() {

    }

    @Override
    public int getLastId() {
        return 0;
    }
}
