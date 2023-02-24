package co.develhope.apiSpringRepositories01.Repositories;

import co.develhope.apiSpringRepositories01.Entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CarRepository extends JpaRepository<Car, Long> {
}
