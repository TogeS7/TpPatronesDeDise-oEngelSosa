package builder;
public class Pizza {
    private String masa;
    private String salsa;

    public void setMasa(String masa) { this.masa = masa; }
    public void setSalsa(String salsa) { this.salsa = salsa; }
    
    @Override
    public String toString() {
        return "Pizza [Masa=" + masa + ", Salsa=" + salsa + "]";
    }
}