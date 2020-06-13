package com.springlearn.configuration;

import com.springlearn.dao.entity.Voltage;
import org.springframework.batch.item.ItemProcessor;

import java.math.BigDecimal;

public class VoltageProcessor implements ItemProcessor<Voltage, Voltage> {
    @Override
    public Voltage process(Voltage voltage) throws Exception {
        final BigDecimal volt = voltage.getVolt();
        final Double time = voltage.getTime();

        final Voltage processedVoltage = new Voltage();
        processedVoltage.setVolt(volt);
        processedVoltage.setTime(time);
        return processedVoltage;
    }
}
