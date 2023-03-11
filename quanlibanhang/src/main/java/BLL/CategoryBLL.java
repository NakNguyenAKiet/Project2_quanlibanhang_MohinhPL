package BLL;

import DAL.CategoryDAL;
import DTO.Category;
import java.util.List;

public class CategoryBLL {
    private final CategoryDAL categoryDAL = new CategoryDAL();

    /*
    public List<Category> getAllCategories() {
        return categoryDAL.getAllCategories();
    }

    public Category getCategoryById(int categoryId) {
        return categoryDAL.getCategoryById(categoryId);
    }

    public boolean insertCategory(Category category) {
        return categoryDAL.insertCategory(category);
    }

    public boolean updateCategory(Category category) {
        return categoryDAL.updateCategory(category);
    }

    public boolean deleteCategory(int categoryId) {
        return categoryDAL.deleteCategory(categoryId);
    }
    */
}
