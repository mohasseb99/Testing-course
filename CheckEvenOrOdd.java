public class CheckEvenOrOdd {
    private Integer OperandOne;


    public boolean checkEvenOrOdd(){
        if(OperandOne % 2 == 0) return true;
        else return false;
    }

    public void initOperandOne(Integer op){
        OperandOne=op;
    }
}
