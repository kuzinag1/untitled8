package com.company;

import java.util.Locale;

public class Dog {
    private String name;
    private int age;
    private String colorSkin;

    public static Builder newBuilder() {
        return new Dog().new Builder();

    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", colorSkin='" + colorSkin + '\'' +
                '}';
    }

    public class Builder {
        private Dog dog;

        public Builder() {
            this.dog = new Dog();
        }
        public Builder withName(String name) {
            this.dog.name = name;
            return this;
        }
        public Builder withAge(int age) {
            this.dog.age = age;
            return this;
        }
        public Builder withColorSkin(String colorSkin) {
            this.dog.colorSkin = colorSkin;
            return this;
        }
        public Dog build() {
            return dog;
        }

    }

}
