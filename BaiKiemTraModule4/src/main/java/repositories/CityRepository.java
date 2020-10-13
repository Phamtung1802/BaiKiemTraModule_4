package repositories;

import com.tung.reddit.models.City;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface CityRepository extends PagingAndSortingRepository<City, Long> {
    public Iterable<City> findAll();
    public City findByName(String name);
    public City findFirstById(Long id);

}