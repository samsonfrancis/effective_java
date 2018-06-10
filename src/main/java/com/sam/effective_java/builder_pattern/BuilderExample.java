package com.sam.effective_java.builder_pattern;

public class BuilderExample {
    private final int a;//required
    private final int b;//required
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;

    public static class Builder {
        //required params
        private int a;
        private int b;

        //optional params - initialize it to default values
        private int c = 0;
        private int d = 0;
        private int e = 0;
        private int f = 0;
        private int g = 0;

        public Builder(int a, int b) {
            this.a = a;
            this.b = b;
        }
        
        public Builder c (int c){
            this.c = c;
            return this;
        }
        public Builder d (int d){
            this.d = d;
            return this;
        }
        public Builder e (int e){
            this.e = e;
            return this;
        }
        public Builder f (int f){
            this.f = f;
            return this;
        }
        public Builder g (int g){
            this.g = g;
            return this;
        }

        public BuilderExample build(){
            return new BuilderExample(this);
        }
    }

    private BuilderExample(Builder builder){
        a = builder.a;
        b = builder.b;
        c = builder.c;
        d = builder.d;
        e = builder.e;
        f = builder.f;
        g = builder.g;
    }

    public static void main(String[] args) {
        BuilderExample builderExample = new Builder(100,200).c(300).d(400).e(500).f(600).g(700).build();
    }
}
