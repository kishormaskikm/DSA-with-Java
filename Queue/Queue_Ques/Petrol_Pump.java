package Interview_Course.Queue.Queue_Ques;

public class Petrol_Pump {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int balence = 0;
        int deficit = 0;
        int start = 0;

        for(int i = 0; i<gas.length; i++){
            balence += gas[i] - cost[i];
            if(balence < 0){
                deficit += balence;
                start = i + 1;
                balence = 0;
            }
        }

        if(balence + deficit >= 0){
            return start;
        }else{
            return -1;
        }
    }
}
