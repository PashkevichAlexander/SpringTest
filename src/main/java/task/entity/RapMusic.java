package task.entity;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class RapMusic implements Music {
    private Map<Integer,String> map = new HashMap<>(){{
        put(1," Rap 1");
        put(2," Rap 2");
        put(3," Rap 3");
    }};

    @Override
    public Map getSong() {
        return map;
    }}
