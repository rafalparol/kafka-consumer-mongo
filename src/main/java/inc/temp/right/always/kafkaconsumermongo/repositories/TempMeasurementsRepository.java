package inc.temp.right.always.kafkaconsumermongo.repositories;

import inc.temp.right.always.kafkaconsumermongo.model.TempMeasurement;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TempMeasurementsRepository extends MongoRepository<TempMeasurement, String> {

}
