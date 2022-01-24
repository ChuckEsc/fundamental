package com.interview.basic;

public interface Generator<K> {
    K getValue();

}

class GeneratorImpl implements Generator<String>{

    @Override
    public String getValue() {
        return "value";
    }
}
