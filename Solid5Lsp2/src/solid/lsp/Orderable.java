package solid.lsp;


public abstract class Orderable {
   protected int qnt;
   protected int price;
    public Orderable(int qnt, int price){
        this.price=price;
        this.qnt=qnt;
    }
    
     public abstract int getAmount();
    @Override
    public String toString() {
        
        return String.format("Бонус\nКоличество = %d, Цена = %d", qnt, price);
    }
}
