package com.sam.effective_java.static_factory_methods;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Services {
    private Services(){}

    private static final Map<String,Provider> providers = new ConcurrentHashMap<String,Provider>();
    public static final String DEFAULT_PROVIDER_NAME = "<def>";
    public static void registerDefaultProvider(Provider p) {
        registerProvider(DEFAULT_PROVIDER_NAME,p);
    }
    public static void registerProvider(String name, Provider p) {
        providers.put(name,p);
    }
    public static Service newInstance() {
        return newInstance(DEFAULT_PROVIDER_NAME);
    }
    public static Service newInstance(String name) {
        Provider p = providers.get(name);
        if (p == null) {
            throw new IllegalArgumentException ("No Provider registered with name: " + name);
        }
        return p.newService();
    }
    public static <K,V> HashMap<K,V> newInstanceHashMap(){
        return new HashMap<K,V>();
    }
}
