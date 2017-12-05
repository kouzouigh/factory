package pl.com.bottega.factory.demand.forecasting;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import pl.com.bottega.factory.demand.forecasting.projection.DeliveryForecastProjection;

@Lazy
@Component
class DemandEventsMapping implements DemandEvents {

    DeliveryForecastProjection demands;
    //ShortagePredictionMapping predictions;

    @Override
    public void emit(DemandedLevelsChanged event) {
        demands.emit(event);
        //predictions.emit(event);
    }
}