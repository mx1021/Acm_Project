package com33;

public class MyFactory extends Factory
{

    @Override
    Food createFood(String type) {
        Food kaoji = new FoodImpl();
        return kaoji;
    }

    @Override
    Tools createTools(String type) {
        Tools kaojia = new ToolsImpl();
        return kaojia;
    }

}
