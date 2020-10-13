package repositories;

import com.tung.reddit.models.Country;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface CountryRepository extends PagingAndSortingRepository<Country, Long> {
    public Iterable<Country> findAll();
    public Country findByName(String name);
    public Country findFirstById(Long id);

}