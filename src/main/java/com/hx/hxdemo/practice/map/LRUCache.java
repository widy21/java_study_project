package com.hx.hxdemo.practice.map;

import java.util.LinkedHashMap;
import java.util.Map;

class LRUCache<K, V> extends LinkedHashMap<K, V> {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private final int CACHE_SIZE;

    /**
     * 传递进来最多能缓存多少数据
     *
     * @param cacheSize 缓存大小
     */
    public LRUCache(final int cacheSize) {
        // true 表示让 linkedHashMap 按照访问顺序来进行排序，最近访问的放在头部，最老访问的放在尾部。
        super((int) Math.ceil(cacheSize / 0.75) + 1, 0.75f, true);
        CACHE_SIZE = cacheSize;
    }

    @Override
    protected boolean removeEldestEntry(final Map.Entry<K, V> eldest) {
        // 当 map中的数据量大于指定的缓存个数的时候，就自动删除最老的数据。
        return size() > CACHE_SIZE;
    }

    public static void main(String[] args) {
        LRUCache<String,Integer> lc = new LRUCache<>(2);
        lc.put("k1",1);
        lc.put("k2",2);
        lc.put("k3",3);
        lc.put("k4",4);
        lc.put("k5",5);
        System.out.println(lc);
    }
}