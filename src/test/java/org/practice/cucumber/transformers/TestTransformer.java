package org.practice.cucumber.transformers;

import cucumber.api.Transformer;

public class TestTransformer extends Transformer<String> {

    @Override
    public String transform(String input) {
        return input.equals("testTransformer") ?
                "successful transformation" : "could not transform " + input;
    }
}
