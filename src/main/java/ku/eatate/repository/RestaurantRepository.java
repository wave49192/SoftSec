
package ku.eatate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ku.eatate.model.Restaurant;

@Repository
public interface RestaurantRepository extends
                JpaRepository<Restaurant, Integer> {
}
