//WAP to demonstrate short circuit operators.

class shortcircuit {
    public static void main (String []args){
        int a = 24;
        int b =  67;
        System.out.println((a>23)&&(b>56));
        System.out.println((a<35)|| (b< 69));
    }
}