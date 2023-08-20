package Builder;
import java.util.Set;

public class BuilderPattern {
    private int v1;
    private double v2;
    private String v3;
    private BuilderPattern(){}
    public int getV1() {
        return v1;
    }
    public double getV2() {
        return v2;
    }
    public String getV3() {
        return v3;
    }   
    public void setV1(int v1) {
        this.v1 = v1;
    }
    public void setV2(double v2) {
        this.v2 = v2;
    }
    public void setV3(String v3) {
        this.v3 = v3;
    }
    public static Builder getBuilder()
    {
        return new Builder();
    }

    public static class Builder
    {
        int v1;
        double v2;
        String v3;
        public Builder setV1(int v1) {
            this.v1 = v1;
            return this;
        }
        public Builder setV2(double v2) {
            this.v2 = v2;
            return this;
        }
        public Builder setV3(String v3) {
            this.v3 = v3;
            return this;
        }
        BuilderPattern build()
        {
            BuilderPattern bp = new BuilderPattern();
            bp.v1 = this.v1;
            bp.v2 = this.v2;
            bp.v3 = this.v3;
            return  bp;
        }
    }
}

