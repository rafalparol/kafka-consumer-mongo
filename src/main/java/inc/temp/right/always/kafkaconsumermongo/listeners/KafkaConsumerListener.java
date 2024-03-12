package inc.temp.right.always.kafkaconsumermongo.listeners;

import inc.temp.right.always.kafkaconsumermongo.services.TempMeasurementsService;
import inc.temp.right.always.temperaturemodel.TemperatureMeasurement;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Log4j2
@KafkaListener(topics = "${main.config.kafka.topic}")
public class KafkaConsumerListener {
    @Autowired
    private TempMeasurementsService tempMeasurementsService;
    @KafkaHandler
    public void handleTemperatureMeasurement(TemperatureMeasurement temperatureMeasurement) {
       log.info(String.format("Message received: %s", temperatureMeasurement));
       tempMeasurementsService.save(temperatureMeasurement.toTempMeasurement());
    }

    public void setTempMeasurementsService(TempMeasurementsService tempMeasurementsService) {
        this.tempMeasurementsService = tempMeasurementsService;
    }
}
