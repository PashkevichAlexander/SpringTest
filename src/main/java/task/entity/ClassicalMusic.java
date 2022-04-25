package task.entity;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class ClassicalMusic implements Music {
    private Map<Integer,String> map = new HashMap<>(){{
        put(7," Simphonia 1");
        put(8," Simphonia 2");
        put(9," Simphonia 3");
    }};

    @Override
    public Map getSong() {
        return map;
    }
}
