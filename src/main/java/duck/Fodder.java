package duck;

public class Fodder {
    private Integer cornGrams;
    private Integer wheatGrams;
    private Integer oatGrams;
    private Integer tritcaleGrams;
    private Boolean minerals;
    private Boolean vitamins;

    private Fodder(Builder builder) {
        cornGrams = builder.cornGrams;
        wheatGrams = builder.wheatGrams;
        oatGrams = builder.oatGrams;
        tritcaleGrams = builder.tritcaleGrams;
        minerals = builder.minerals;
        vitamins = builder.vitamins;
    }

    public static Builder builder(Integer cornGrams, Integer wheatGrams){
        //validation
        if(cornGrams == null || cornGrams  < 0){
            throw new IllegalArgumentException("Corn must be provided");
        }
        if(wheatGrams == null || wheatGrams  < 0){
           throw new IllegalArgumentException("Wheat must be provided");
        }

        return new Builder(cornGrams,wheatGrams);
    }

    public Integer getCornGrams() {
        return cornGrams;
    }

    public Integer getWheatGrams() {
        return wheatGrams;
    }

    public Integer getOatGrams() {
        return oatGrams;
    }

    public Integer getTritcaleGrams() {
        return tritcaleGrams;
    }

    public Boolean getMinerals() {
        return minerals;
    }

    public Boolean getVitamins() {
        return vitamins;
    }


          public static class Builder {
        private final Integer cornGrams;
        private final Integer wheatGrams;
        private Integer oatGrams;
        private Integer tritcaleGrams;
        private Boolean minerals;
        private Boolean vitamins;

        private Builder(Integer cornGrams, Integer wheatGrams){
            this.cornGrams = cornGrams;
            this.wheatGrams = wheatGrams;
        }

        public Builder OatGrams(Integer oatGrams) {
            this.oatGrams = oatGrams;
            return this;
        }

        public Builder TritcaleGrams(Integer tritcaleGrams) {
            this.tritcaleGrams = tritcaleGrams;
            return this;
        }

        public Builder Minerals(Boolean minerals) {
            this.minerals = minerals;
            return this;
        }

        public Builder Vitamins(Boolean vitamins) {
            this.vitamins = vitamins;
            return this;
        }


        public Fodder build() {
            return new Fodder(this);
        }

    }


}
