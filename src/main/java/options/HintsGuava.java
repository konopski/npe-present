package options;

import com.google.common.base.Optional;
import options.stubs.Event;

import java.util.LinkedList;
import java.util.List;

public class HintsGuava {

    List<Event> events1(List<Optional<Event>> someEvents) {
        List<Event> result = new LinkedList<>();
        for (Optional<Event> transformedEvent : someEvents) {
            if (transformedEvent.isPresent()) {
                result.add(transformedEvent.get());
            }
        }
        return result;
    }


    Iterable<Event> events2(List<Optional<Event>> someEvents) {
        return Optional.presentInstances(someEvents);
    }
}
