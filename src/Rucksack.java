import java.util.ArrayList;
public class Rucksack {
private int carry_weight;
ArrayList<Weights> Items;
ArrayList<Integer> count;
private int Value;


Rucksack(int Carry) {
    carry_weight = Carry;
    Items = new ArrayList <>();
    count = new ArrayList <>();

}

public void add_item(int weight, String name, int value){
 Items.add(new Weights(weight, name, value));
}

public void calculate (){
    for (int i = 0; i < Items.size(); i++){
        Weights Item = Items.get(i);
        // muss mir den Algorithmus nochmal anschauen
        }
    }


public void Print(){
    for (int i = 0; i < Items.size(); i++){
        Weights Item = Items.get(i);
        System.out.println(Item.getWeight() + "kg   " + Item.getName());
    }
}



}
