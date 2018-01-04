public class FruitThread extends Thread {
    
    public FruitThread(Runnable runnable){
        super(runnable);
    }

    public void sayFavoriteFruitName(String fruitName){
        System.out.println(fruitName);
    }

}