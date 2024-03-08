package inc.temp.right.always.temperaturemodel;

import inc.temp.right.always.kafkaconsumermongo.model.TempMeasurement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TemperatureMeasurement {
    private String roomId;
    private String thermometerId;
    private long timestamp;
    private double temperature;

    public TempMeasurement toTempMeasurement() {
        return new TempMeasurement(this.thermometerId + "-" + Long.toString(this.timestamp), this.thermometerId, this.timestamp, this.roomId, this.temperature);
    }
}
