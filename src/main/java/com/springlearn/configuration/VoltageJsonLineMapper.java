package com.springlearn.configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.springlearn.dao.entity.Voltage;
import org.springframework.batch.item.file.LineMapper;

public class VoltageJsonLineMapper implements LineMapper<Voltage> {

    private ObjectMapper mapper = new ObjectMapper();


    @Override
    public Voltage mapLine(String line, int lineNumber) throws Exception {
        return mapper.readValue(line,Voltage.class);
    }
}
