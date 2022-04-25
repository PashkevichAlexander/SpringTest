package task.entity;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class RockMusic implements Music {
    private Map<Integer,String> map = new HashMap<>(){{
        put(4," Rock 1");
        put(5," Rock 2");
        put(6," Rock 3");
    }};

    @Override
    public Map getSong() {
        return map;
    }
}
