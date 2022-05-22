public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap!");
        } else if (this.price > 600 && this.price <1800){
            System.out.println("This price is good!");
        } else{
            System.out.println("This notebook is expensive!");
        }
    }

    public void chceckWeight() {
        if (this.weight < 700) {
            System.out.println("This notebook is light!");
        } else if (this.weight > 700 && this.weight < 1700){
                System.out.println("This notebook is not too heavy!");
            } else{
                System.out.println("This notebook is heavy!");
            }
        }
        public void chceckSystem() {
        if (this.price < 1600 && this.year < 2009) {
            System.out.println("This notebook is not expensive, but is old!");
        } else if (this.price > 1800 && this.price < 1900 && this.year > 2011 && this.year < 2019) {
            System.out.println("This notebook is not too old and is not too expensive!");
        } else {
            System.out.println("This nootebook is expensive, but is new!");
        }
        }
    }
