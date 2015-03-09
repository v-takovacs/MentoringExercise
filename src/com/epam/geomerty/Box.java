package com.epam.geomerty;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class Box<T extends GraphicObject> {
    private static final Logger LOGGER = Logger.getLogger(Box.class.getName());
    private final Map<String, T> storedObjects = new HashMap<>();

    public void putInto(String name, T type) {
        storedObjects.put(name, type);
    }

    public T getFrom(String name) {
        return storedObjects.get(name);
    }

    public void removeFrom(String name) {
        storedObjects.remove(name);
    }

    public void lookInto() {
        for (T object : storedObjects.values()) {
            LOGGER.info("Stored object: " + object.toString());
        }
    }
}
