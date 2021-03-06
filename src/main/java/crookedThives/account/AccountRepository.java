package crookedThives.account;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

	Account findByUserId(String userid);
	
	Account findByUsername(String username);
	
	Boolean findByEmail(String email);

}
