package creational.builder.bt2;

public class MyStringBuilder {
    String str;

    public MyStringBuilder(Builder builder) {
        this.str = builder.str;
    }

    @Override
    public String toString() {
        return str;
    }

    public static class Builder{
        String str;

        public Builder addString(String s) {
            if (this.str == null) {
                this.str = s;
                return this;
            }
            this.str = str + s;
            return this;
        }

        public Builder addFloat(Float s) {
            if (this.str == null) {
                this.str = s.toString();
                return this;
            }
            this.str = str + s;
            return this;
        }

        public Builder addBool(Boolean s) {
            if (this.str == null) {
                this.str = s.toString();
                return this;
            }
            this.str = str + s;
            return this;
        }

        public MyStringBuilder build() {
            return new MyStringBuilder(this);
        }

    }
}
