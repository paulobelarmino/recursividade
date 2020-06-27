package teste1;

public class Teste1{
    public static void main(String args[]){

        System.out.println(X(4));
    }

    public static int X (int n) {
        if (n == 1 || n == 2) return n;

        else{
            System.out.println("X(" + (n) + ")");
            return X(n-1) + n * X(n-2);
        }
    
    }

}

