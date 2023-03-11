package BLL;

import DAL.VegetableDAL;
import DTO.Vegetable;
import java.util.List;

public class VegetableBLL {
    private final VegetableDAL vegetableDAL = new VegetableDAL();
     
    /*
    public List<Vegetable> getAllVegetables() { 
        return vegetableDAL.getAllVegetables();
    }
    public Vegetable getVegetableById(int vegetableId) { 
        return vegetableDAL.getVegetableById(vegetableId);
    }
    public List<Vegetable> getVegetablesByCategoryId(int categoryId) { 
        return vegetableDAL.getVegetablesByCategoryId(categoryId);
    }
    public boolean insertVegetable(Vegetable vegetable) { 
        return vegetableDAL.insertVegetable(vegetable);
    }
    public boolean updateVegetable(Vegetable vegetable) { 
        return vegetableDAL.updateVegetable(vegetable);
    }
    public boolean deleteVegetable(int vegetableId) { 
        return vegetableDAL.deleteVegetable(vegetableId);
    }
    */
}
