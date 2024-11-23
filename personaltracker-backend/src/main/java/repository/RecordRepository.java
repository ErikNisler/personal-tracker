package repository;

import dto.RecordDTO;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RecordRepository extends MongoRepository<RecordDTO, Integer> {

}
