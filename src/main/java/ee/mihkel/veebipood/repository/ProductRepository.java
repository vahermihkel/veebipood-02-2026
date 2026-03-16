package ee.mihkel.veebipood.repository;

import ee.mihkel.veebipood.entity.Product;
import lombok.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// @NonNull ---> Spring Boot 4.0 errori "Non-null type argument is expected" tõttu
public interface ProductRepository extends JpaRepository<@NonNull Product,@NonNull Long> {

    List<Product> findByActiveTrue();

    List<Product> findAllByCategoryId(Long id);

    List<Product> findByCategoryIdAndActiveTrue(Long id);

}
