package options;

import options.stubs.Camera;
import options.stubs.Event;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Hints {

    List<Camera> cameras;

    private Optional<Camera> getCameraByMac(List<Camera> cameras, String mac) {
        return cameras.stream().filter(c -> mac.equals(c.getMac())).findFirst();
    }

    Optional<String> ipByMac1(String mac) {
        Optional<Camera> camera = getCameraByMac(cameras, mac);
        if (camera.isPresent()) {
            return Optional.of( camera.get().getIp() );
        } else {
            return Optional.empty();
        }
    }

    Optional<String> ipByMac2(String mac) {
        Optional<Camera> camera = getCameraByMac(cameras, mac);
        return camera.map(Camera::getIp);
    }


    List<Event> events1(List<Optional<Event>> someEvents) {
        List<Event> result = new LinkedList<>();
        for (Optional<Event> transformedEvent : someEvents) {
            transformedEvent.ifPresent(result::add);
        }
        return result;
    }

    List<Event> events2(List<Optional<Event>> someEvents) {
        return someEvents.stream().filter(Optional::isPresent).map(Optional::get).collect(Collectors.toList());
    }

}
