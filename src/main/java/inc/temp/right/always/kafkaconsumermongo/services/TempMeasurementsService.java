package inc.temp.right.always.kafkaconsumermongo.services;

import inc.temp.right.always.kafkaconsumermongo.model.TempMeasurement;
import inc.temp.right.always.kafkaconsumermongo.repositories.TempMeasurementsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

@Service
public class TempMeasurementsService {
    @Autowired
    private TempMeasurementsRepository tempMeasurementsRepository;
    @Retryable
    public TempMeasurement save(TempMeasurement tempMeasurement) {
        return tempMeasurementsRepository.save(tempMeasurement);
    }
}
