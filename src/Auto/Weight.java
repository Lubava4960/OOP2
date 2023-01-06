package Auto;

import java.util.function.DoubleToIntFunction;

public enum Weight {

        N1(0.0,3.5),
        N2( 3.5 ,12D),
        N3(12D,null);


    private Double from;
        private Double   to;


        Weight(Double from, Double to) {
            this.from = from;
            this.to = to;
        }

        public Double getFrom() {
            return from;
        }

        public Double getTo() {
            return to;
        }

    public void setFrom(Double from) {
        this.from = from;
    }

    public void setTo(Double to) {
        this.to = to;
    }
}
