public class Test {

    public static void main(String[] args) {
        System.out.print(getFibo());
    }

    //使用递归方法
    private static int[] getFibo() {

        int[] array = new int[10];
        array[0] = 0;
        array[1] = 1;
        for(int i = 0; i < array.length; i++){
            if(i > 1){
                array[i] = array[i -2] + array[i -1];
            }
            System.out.println(array[i]);
        }
        return array;
    }

}
