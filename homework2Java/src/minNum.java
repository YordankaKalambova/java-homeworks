public class minNum {
    // Task 1
    static int minNumThree (int x, int y,int z){
        int min = x;
        if(min<y){
            min=x;
        }else {
            min = y;
        }
        if( min> z){
            min =z;
        }else {
            return min;
        }
        return min;
    }
    public static void main(String [] args){
        System.out.println(minNumThree(3,5,2));
    }
}

