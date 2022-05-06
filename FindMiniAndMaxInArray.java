import java.util.ArrayList;

public class FindMiniAndMaxInArray {
    private  ArrayList<Integer> OperandOne;


    public Integer findMax(){
        int max = OperandOne.get(0);
        for(int i = 1; i < OperandOne.size(); i++){
            if(OperandOne.get(i) > max) max = OperandOne.get(i);
        }
        return max;
    }

    public Integer findMini(){
        int mini = OperandOne.get(0);
        for(int i = 1; i < OperandOne.size(); i++){
            if(OperandOne.get(i) < mini) mini = OperandOne.get(i);
        }
        return mini;
    }

    public void initOperandOne(ArrayList<Integer> al){
        OperandOne = al;
    }
}
