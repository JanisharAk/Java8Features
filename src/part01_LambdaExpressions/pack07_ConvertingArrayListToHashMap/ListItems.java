package part01_LambdaExpressions.pack07_ConvertingArrayListToHashMap;

public class ListItems {
    private int key;
    private String value;

    public ListItems(int key, String name){
        this.key = key;
        this.value = name;
    }

    //apply get here to get the value
    public int getkey(){
        return this.key;
    }
    public String getvalue(){
        return this.value;
    }
}
