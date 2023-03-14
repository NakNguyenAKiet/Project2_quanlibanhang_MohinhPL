package BLL;

import DAL.CategoryDAL;
import DTO.Category;
import Utils.Validate;
import java.util.List;

public class CategoryBLL {
    private static final CategoryDAL categoryDAL = new CategoryDAL();
    private static final Validate validate = new Validate();

    public List<Category> getAllCategories() {
        return categoryDAL.getAllCategories();
    }

    public Category getCategoryById(int categoryId) {
        return categoryDAL.getCategoryById(categoryId);
    }

    public String insertCategory(Category category) {
        if(!validate.validateCategoryName(category.getName()))
            return "Tên danh mục phải chứa [2,50] ký tự.";
        if(!validate.validateCategoryDescription(category.getDescription()))
            return "Mô tả danh mục không được để trống.";
        if(!categoryDAL.insertCategory(category)) 
            return "Có lỗi xảy ra trong quá trình thêm dannh mục. Vui lòng thử lại sau!";
        return null;
    }

    public boolean updateCategory(Category category) {
        return categoryDAL.updateCategory(category);
    }

    public boolean deleteCategory(int categoryId) {
        return categoryDAL.deleteCategory(categoryId);
    }
}
