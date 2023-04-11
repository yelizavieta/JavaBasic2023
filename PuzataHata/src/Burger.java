public class Burger {
    private String bun;
    private String meat;
    private String cheese;
    private String vegetables;
    private String mayo;

    public Burger(String bun, String meat, String cheese, String vegetables, String mayo) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.vegetables = vegetables;
        this.mayo = mayo;
        System.out.println("Burger ingredients: " + bun + ", " + meat + ", " + cheese + ", " + vegetables + ", " + mayo);
    }

    public Burger(String bun, String meat, String cheese, String vegetables) {
        this(bun, meat, cheese, vegetables, "no mayo");
        System.out.println("Burger ingredients: " + bun + ", " + meat + ", " + cheese + ", " + vegetables);
    }

    public Burger(String bun, String meat, String cheese, String vegetables, int doubleMeat) {
        this(bun, meat + " x2", cheese, vegetables, "no mayo");
        System.out.println("Burger ingredients: " + bun + ", " + meat + " x2, " + cheese + ", " + vegetables);
    }
}

public class BurgerMain {
    public static void main(String[] args) {
        Burger burger1 = new Burger("sesame bun", "beef patty", "cheddar cheese", "lettuce", "mayo");
        Burger burger2 = new Burger("whole wheat bun", "turkey patty", "swiss cheese", "tomato");
        Burger burger3 = new Burger("potato bun", "beef patty", "pepper jack cheese", "onions", 2);
    }
}
