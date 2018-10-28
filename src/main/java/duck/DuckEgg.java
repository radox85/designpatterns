package duck;

public class DuckEgg {

    private final Double yolkWeight;
    private final Double whiteWeight;
    private final Double totalWeight;

    private DuckEgg(Double yolkWeight, Double whiteWeight, Double totalWeight) {
        this.yolkWeight = yolkWeight;
        this.whiteWeight = whiteWeight;
        this.totalWeight = totalWeight;
    }

    public Double getYolkWeight() {
        return yolkWeight;
    }

    public Double getWhiteWeight() {
        return whiteWeight;
    }

    public Double getTotalWeight() {
        return totalWeight;
    }

    @Override
    public String toString() {
        return "DuckEgg{" +
                "yolkWeight=" + yolkWeight +
                ", whiteWeight=" + whiteWeight +
                ", totalWeight=" + totalWeight +
                '}';
    }

    public static class Builder {
        private Double yolkWeight;

        public void setYolkWeight(Double yolkWeight) {
            this.yolkWeight = yolkWeight;
        }

        public DuckEgg build() {
            Double calculatedYolkWeight = yolkWeight != null ? yolkWeight : 0D;
            Double calculateWhiteWeight = Math.max(calculatedYolkWeight * 1.2, 31D);
            Double membraneWeight = (calculatedYolkWeight + calculateWhiteWeight) * 0.005;
            Double calculatedShellWeight = calculatedYolkWeight * 0.07;
            if (calculatedShellWeight < 3D) {
                //could be replaced with Mat.max(a,b)
                calculatedShellWeight = 3D;
            }
            Double totalWeight = calculatedShellWeight
                    + calculateWhiteWeight
                    + calculatedYolkWeight
                    + membraneWeight;

            return new DuckEgg(calculatedYolkWeight, calculateWhiteWeight, totalWeight);
        }
    }
}
