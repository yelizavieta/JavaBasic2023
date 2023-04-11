public class Burger {
    private String bun;
    private String meat;
    private String cheese;
    private String greens;
    private String mayonnaise;

    public Burger() {
        this.bun = "regular bun";
        this.meat = "beef patty";
        this.cheese = "cheddar cheese";
        this.greens = "lettuce and tomato";
        this.mayonnaise = "mayonnaise";
        System.out.println("Regular burger: " + this.bun + ", " + this.meat + ", " + this.cheese + ", " + this.greens + ", " + this.mayonnaise);
    }

    public Burger(boolean isDiet) {
        this.bun = "whole wheat bun";
        this.meat = "turkey patty";
        this.cheese = "no cheese";
        this.greens = "lettuce and tomato";
        if (isDiet) {
            this.mayonnaise = "no mayonnaise";
        } else {
            this.mayonnaise = "mayonnaise";
        }
        System.out.println("Diet burger: " + this.bun + ", " + this.meat + ", " + this.cheese + ", " + this.greens + ", " + this.mayonnaise);
    }

    public Burger(int doubleMeat) {
        this.bun = "regular bun";
        this.meat = "double beef patty";
        this.cheese = "cheddar cheese";
        this.greens = "lettuce and tomato";
        this.mayonnaise = "mayonnaise";
        System.out.println("Burger with double meat: " + this.bun + ", " + this.meat + ", " + this.cheese + ", " + this.greens + ", " + this.mayonnaise);
    }
}

class BurgerMain {
    public static void main(String[] args) {
        Burger regularBurger = new Burger();
        Burger dietBurger = new Burger(true);
        Burger doubleMeatBurger = new Burger(2);
    }
}
