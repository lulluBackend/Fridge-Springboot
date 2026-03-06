package dev.lullu.Fridge.service;
import java.util.List;
import org.springframework.stereotype.Service;
import dev.lullu.Fridge.model.Food;
import dev.lullu.Fridge.repository.FoodRepository;

@Service
public class FoodService {
    
    //Injeção de dependência
    private final FoodRepository foodRepository;
    
    public FoodService (FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    //Listar
    public List<Food> getAll() {
        return foodRepository.findAll();
    }
    //Criar
    public Food save(Food food) {
        return foodRepository.save(food);
    }
    //Deletar
    public void delete(Long id) {
        foodRepository.deleteById(id);
    }

}
