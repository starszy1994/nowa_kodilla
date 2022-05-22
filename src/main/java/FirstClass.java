public class FirstClass {
    public static void main(String[] args) {
    Notebook notebook = new Notebook(600, 1500, 2005);
        System.out.println(notebook.weight + " " + notebook.price + " " + notebook.year);
        notebook.checkPrice();
        notebook.chceckWeight();
        notebook.chceckSystem();

        Notebook heavyNotebook = new Notebook(2000, 2000, 2020);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price + " " + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.chceckWeight();
        heavyNotebook.chceckSystem();

        Notebook oldNotebook = new Notebook(1600, 1750, 2010);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price + " " + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.chceckWeight();
        oldNotebook.chceckSystem();
        }
    }
