package org.kniit.lab10.task22;

import java.util.HashMap;
import java.util.Map;

public class Dictionary<K, V> {
    Map<K, V> map;
    
    public Dictionary(){
        map = new HashMap<>();
    }

    public void put(K k, V v){
        map.put(k, v);
    }

    public V get(K k){
        return map.get(k);
    }

    public void remove(K k){
        map.remove(k);
    }
}
