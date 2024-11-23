package repository;

import dto.AccountDTO;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccountRepository extends MongoRepository<AccountDTO, Integer> {

}
