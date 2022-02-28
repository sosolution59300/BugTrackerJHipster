package soso.incu.tuto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import soso.incu.tuto.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
