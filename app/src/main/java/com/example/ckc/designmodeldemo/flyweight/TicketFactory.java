package com.example.ckc.designmodeldemo.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

//车票工厂
public class TicketFactory {
    // 首先选择一种容器缓存
    static Map<String, Ticket> ticketMap = new ConcurrentHashMap<>();

    public static Ticket getTicket(String from, String to) {
        String key = from + "" + to;
        if (ticketMap.containsKey(key)) {
            return ticketMap.get(key);
        } else {
            Ticket ticket = new TrainTicket(from, to);
            ticketMap.put(key, ticket);
            return ticket;
        }
    }
}
