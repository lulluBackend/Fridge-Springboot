package dev.lullu.Fridge.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import dev.lullu.Fridge.model.Food;

@Repository
public interface FoodRepository extends JpaRepository<Food, Long>{

}
