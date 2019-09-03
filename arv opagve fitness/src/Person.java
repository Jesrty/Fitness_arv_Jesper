public abstract class Person {

    private String name;
    private String cpr;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpr() {
        return cpr;
    }

    public void setCpr(String cpr) {
        this.cpr = cpr;
    }

    @Override
    public String toString() {
        return getName() + "\t\t" + getCpr();
    }

    public String toString(String overload) {
        return getName() + "\t\t" + getCpr();
    }
}
