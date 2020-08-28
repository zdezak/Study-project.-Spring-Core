package org.zd.IoC;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class ClassicalMusic implements Music {
    ArrayList list = new ArrayList(3);
    @Override
    public ArrayList<String> getSong() {
        list.add("Летняя гроза");
        list.add("Маленькая ночная серенада");
        list.add("Симфония 5");
        return list;
    }
}
