package domain;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RandomCypherAdapter implements CodeStrategy{
    RandomCypher cypher;
    public RandomCypherAdapter(RandomCypher cypher){
        this.cypher = cypher;
    }

    @Override
    public String encode(String m) {
        return new String(cypher.encypher(m.toCharArray()));
    }

    @Override
    public String decode(String m) {
        return new String(cypher.decypher(m.toCharArray()));
    }
}
