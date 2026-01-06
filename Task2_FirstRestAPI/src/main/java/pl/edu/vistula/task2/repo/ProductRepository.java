package pl.edu.vistula.task2.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.edu.vistula.task2.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
