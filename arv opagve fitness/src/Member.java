public class Member extends Person{

    private String type;
    private double fee;

    @Override
    public String toString() {
        return getName() + "\t\t" + getCpr() + "\t\t" + type + "\t\t" + fee;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
}
